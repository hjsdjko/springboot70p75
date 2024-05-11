package com.dao;

import com.entity.DiscussgonggaolanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussgonggaolanVO;
import com.entity.view.DiscussgonggaolanView;


/**
 * 公告栏评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-16 14:42:37
 */
public interface DiscussgonggaolanDao extends BaseMapper<DiscussgonggaolanEntity> {
	
	List<DiscussgonggaolanVO> selectListVO(@Param("ew") Wrapper<DiscussgonggaolanEntity> wrapper);
	
	DiscussgonggaolanVO selectVO(@Param("ew") Wrapper<DiscussgonggaolanEntity> wrapper);
	
	List<DiscussgonggaolanView> selectListView(@Param("ew") Wrapper<DiscussgonggaolanEntity> wrapper);

	List<DiscussgonggaolanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussgonggaolanEntity> wrapper);
	
	DiscussgonggaolanView selectView(@Param("ew") Wrapper<DiscussgonggaolanEntity> wrapper);
	

}
