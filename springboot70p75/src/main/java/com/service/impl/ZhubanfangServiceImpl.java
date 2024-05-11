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


import com.dao.ZhubanfangDao;
import com.entity.ZhubanfangEntity;
import com.service.ZhubanfangService;
import com.entity.vo.ZhubanfangVO;
import com.entity.view.ZhubanfangView;

@Service("zhubanfangService")
public class ZhubanfangServiceImpl extends ServiceImpl<ZhubanfangDao, ZhubanfangEntity> implements ZhubanfangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhubanfangEntity> page = this.selectPage(
                new Query<ZhubanfangEntity>(params).getPage(),
                new EntityWrapper<ZhubanfangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhubanfangEntity> wrapper) {
		  Page<ZhubanfangView> page =new Query<ZhubanfangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhubanfangVO> selectListVO(Wrapper<ZhubanfangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhubanfangVO selectVO(Wrapper<ZhubanfangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhubanfangView> selectListView(Wrapper<ZhubanfangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhubanfangView selectView(Wrapper<ZhubanfangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
