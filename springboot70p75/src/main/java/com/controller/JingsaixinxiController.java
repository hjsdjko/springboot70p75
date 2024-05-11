package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JingsaixinxiEntity;
import com.entity.view.JingsaixinxiView;

import com.service.JingsaixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 竞赛信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-16 14:42:37
 */
@RestController
@RequestMapping("/jingsaixinxi")
public class JingsaixinxiController {
    @Autowired
    private JingsaixinxiService jingsaixinxiService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JingsaixinxiEntity jingsaixinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhubanfang")) {
			jingsaixinxi.setMingcheng((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JingsaixinxiEntity> ew = new EntityWrapper<JingsaixinxiEntity>();
		PageUtils page = jingsaixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jingsaixinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JingsaixinxiEntity jingsaixinxi, 
		HttpServletRequest request){
        EntityWrapper<JingsaixinxiEntity> ew = new EntityWrapper<JingsaixinxiEntity>();
		PageUtils page = jingsaixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jingsaixinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JingsaixinxiEntity jingsaixinxi){
       	EntityWrapper<JingsaixinxiEntity> ew = new EntityWrapper<JingsaixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jingsaixinxi, "jingsaixinxi")); 
        return R.ok().put("data", jingsaixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JingsaixinxiEntity jingsaixinxi){
        EntityWrapper< JingsaixinxiEntity> ew = new EntityWrapper< JingsaixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jingsaixinxi, "jingsaixinxi")); 
		JingsaixinxiView jingsaixinxiView =  jingsaixinxiService.selectView(ew);
		return R.ok("查询竞赛信息成功").put("data", jingsaixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JingsaixinxiEntity jingsaixinxi = jingsaixinxiService.selectById(id);
		jingsaixinxi.setClicknum(jingsaixinxi.getClicknum()+1);
		jingsaixinxi.setClicktime(new Date());
		jingsaixinxiService.updateById(jingsaixinxi);
        return R.ok().put("data", jingsaixinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JingsaixinxiEntity jingsaixinxi = jingsaixinxiService.selectById(id);
		jingsaixinxi.setClicknum(jingsaixinxi.getClicknum()+1);
		jingsaixinxi.setClicktime(new Date());
		jingsaixinxiService.updateById(jingsaixinxi);
        return R.ok().put("data", jingsaixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JingsaixinxiEntity jingsaixinxi, HttpServletRequest request){
    	jingsaixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jingsaixinxi);
        jingsaixinxiService.insert(jingsaixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JingsaixinxiEntity jingsaixinxi, HttpServletRequest request){
    	jingsaixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jingsaixinxi);
        jingsaixinxiService.insert(jingsaixinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JingsaixinxiEntity jingsaixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jingsaixinxi);
        jingsaixinxiService.updateById(jingsaixinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jingsaixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JingsaixinxiEntity> wrapper = new EntityWrapper<JingsaixinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhubanfang")) {
			wrapper.eq("mingcheng", (String)request.getSession().getAttribute("username"));
		}

		int count = jingsaixinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,JingsaixinxiEntity jingsaixinxi, HttpServletRequest request,String pre){
        EntityWrapper<JingsaixinxiEntity> ew = new EntityWrapper<JingsaixinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = jingsaixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jingsaixinxi), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 协同算法（按收藏推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,JingsaixinxiEntity jingsaixinxi, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String inteltypeColumn = "jingsaifenlei";
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("userid", userId).eq("tablename", "jingsaixinxi").orderBy("addtime", false));
        List<String> inteltypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<JingsaixinxiEntity> jingsaixinxiList = new ArrayList<JingsaixinxiEntity>();
        //去重
        if(storeups!=null && storeups.size()>0) {
            for(StoreupEntity s : storeups) {
                jingsaixinxiList.addAll(jingsaixinxiService.selectList(new EntityWrapper<JingsaixinxiEntity>().eq(inteltypeColumn, s.getInteltype())));
            }
        }
        EntityWrapper<JingsaixinxiEntity> ew = new EntityWrapper<JingsaixinxiEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = jingsaixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jingsaixinxi), params), params));
        List<JingsaixinxiEntity> pageList = (List<JingsaixinxiEntity>)page.getList();
        if(jingsaixinxiList.size()<limit) {
            int toAddNum = (limit-jingsaixinxiList.size())<=pageList.size()?(limit-jingsaixinxiList.size()):pageList.size();
            for(JingsaixinxiEntity o1 : pageList) {
                boolean addFlag = true;
                for(JingsaixinxiEntity o2 : jingsaixinxiList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    jingsaixinxiList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        } else if(jingsaixinxiList.size()>limit) {
            jingsaixinxiList = jingsaixinxiList.subList(0, limit);
        }
        page.setList(jingsaixinxiList);
        return R.ok().put("data", page);
    }





}
