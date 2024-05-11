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


import com.dao.DiscussgonggaolanDao;
import com.entity.DiscussgonggaolanEntity;
import com.service.DiscussgonggaolanService;
import com.entity.vo.DiscussgonggaolanVO;
import com.entity.view.DiscussgonggaolanView;

@Service("discussgonggaolanService")
public class DiscussgonggaolanServiceImpl extends ServiceImpl<DiscussgonggaolanDao, DiscussgonggaolanEntity> implements DiscussgonggaolanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussgonggaolanEntity> page = this.selectPage(
                new Query<DiscussgonggaolanEntity>(params).getPage(),
                new EntityWrapper<DiscussgonggaolanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussgonggaolanEntity> wrapper) {
		  Page<DiscussgonggaolanView> page =new Query<DiscussgonggaolanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussgonggaolanVO> selectListVO(Wrapper<DiscussgonggaolanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussgonggaolanVO selectVO(Wrapper<DiscussgonggaolanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussgonggaolanView> selectListView(Wrapper<DiscussgonggaolanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussgonggaolanView selectView(Wrapper<DiscussgonggaolanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
