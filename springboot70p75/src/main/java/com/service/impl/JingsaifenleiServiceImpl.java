package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JingsaifenleiDao;
import com.entity.JingsaifenleiEntity;
import com.service.JingsaifenleiService;
import com.entity.vo.JingsaifenleiVO;
import com.entity.view.JingsaifenleiView;

@Service("jingsaifenleiService")
public class JingsaifenleiServiceImpl extends ServiceImpl<JingsaifenleiDao, JingsaifenleiEntity> implements JingsaifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingsaifenleiEntity> page = this.selectPage(
                new Query<JingsaifenleiEntity>(params).getPage(),
                new EntityWrapper<JingsaifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingsaifenleiEntity> wrapper) {
		  Page<JingsaifenleiView> page =new Query<JingsaifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingsaifenleiVO> selectListVO(Wrapper<JingsaifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingsaifenleiVO selectVO(Wrapper<JingsaifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingsaifenleiView> selectListView(Wrapper<JingsaifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingsaifenleiView selectView(Wrapper<JingsaifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
