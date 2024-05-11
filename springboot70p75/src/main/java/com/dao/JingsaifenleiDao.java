package com.dao;

import com.entity.JingsaifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingsaifenleiVO;
import com.entity.view.JingsaifenleiView;


/**
 * 竞赛分类
 * 
 * @author 
 * @email 
 * @date 2022-04-16 14:42:37
 */
public interface JingsaifenleiDao extends BaseMapper<JingsaifenleiEntity> {
	
	List<JingsaifenleiVO> selectListVO(@Param("ew") Wrapper<JingsaifenleiEntity> wrapper);
	
	JingsaifenleiVO selectVO(@Param("ew") Wrapper<JingsaifenleiEntity> wrapper);
	
	List<JingsaifenleiView> selectListView(@Param("ew") Wrapper<JingsaifenleiEntity> wrapper);

	List<JingsaifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<JingsaifenleiEntity> wrapper);
	
	JingsaifenleiView selectView(@Param("ew") Wrapper<JingsaifenleiEntity> wrapper);
	

}
