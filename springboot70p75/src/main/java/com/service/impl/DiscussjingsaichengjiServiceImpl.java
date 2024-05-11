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


import com.dao.DiscussjingsaichengjiDao;
import com.entity.DiscussjingsaichengjiEntity;
import com.service.DiscussjingsaichengjiService;
import com.entity.vo.DiscussjingsaichengjiVO;
import com.entity.view.DiscussjingsaichengjiView;

@Service("discussjingsaichengjiService")
public class DiscussjingsaichengjiServiceImpl extends ServiceImpl<DiscussjingsaichengjiDao, DiscussjingsaichengjiEntity> implements DiscussjingsaichengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjingsaichengjiEntity> page = this.selectPage(
                new Query<DiscussjingsaichengjiEntity>(params).getPage(),
                new EntityWrapper<DiscussjingsaichengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjingsaichengjiEntity> wrapper) {
		  Page<DiscussjingsaichengjiView> page =new Query<DiscussjingsaichengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjingsaichengjiVO> selectListVO(Wrapper<DiscussjingsaichengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjingsaichengjiVO selectVO(Wrapper<DiscussjingsaichengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjingsaichengjiView> selectListView(Wrapper<DiscussjingsaichengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjingsaichengjiView selectView(Wrapper<DiscussjingsaichengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
