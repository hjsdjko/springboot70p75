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


import com.dao.JingsaichengjiDao;
import com.entity.JingsaichengjiEntity;
import com.service.JingsaichengjiService;
import com.entity.vo.JingsaichengjiVO;
import com.entity.view.JingsaichengjiView;

@Service("jingsaichengjiService")
public class JingsaichengjiServiceImpl extends ServiceImpl<JingsaichengjiDao, JingsaichengjiEntity> implements JingsaichengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingsaichengjiEntity> page = this.selectPage(
                new Query<JingsaichengjiEntity>(params).getPage(),
                new EntityWrapper<JingsaichengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingsaichengjiEntity> wrapper) {
		  Page<JingsaichengjiView> page =new Query<JingsaichengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingsaichengjiVO> selectListVO(Wrapper<JingsaichengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingsaichengjiVO selectVO(Wrapper<JingsaichengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingsaichengjiView> selectListView(Wrapper<JingsaichengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingsaichengjiView selectView(Wrapper<JingsaichengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
