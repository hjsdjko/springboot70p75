package com.dao;

import com.entity.DiscussjingsaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjingsaixinxiVO;
import com.entity.view.DiscussjingsaixinxiView;


/**
 * 竞赛信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-16 14:42:37
 */
public interface DiscussjingsaixinxiDao extends BaseMapper<DiscussjingsaixinxiEntity> {
	
	List<DiscussjingsaixinxiVO> selectListVO(@Param("ew") Wrapper<DiscussjingsaixinxiEntity> wrapper);
	
	DiscussjingsaixinxiVO selectVO(@Param("ew") Wrapper<DiscussjingsaixinxiEntity> wrapper);
	
	List<DiscussjingsaixinxiView> selectListView(@Param("ew") Wrapper<DiscussjingsaixinxiEntity> wrapper);

	List<DiscussjingsaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingsaixinxiEntity> wrapper);
	
	DiscussjingsaixinxiView selectView(@Param("ew") Wrapper<DiscussjingsaixinxiEntity> wrapper);
	

}
