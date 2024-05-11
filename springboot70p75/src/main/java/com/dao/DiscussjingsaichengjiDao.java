package com.dao;

import com.entity.DiscussjingsaichengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjingsaichengjiVO;
import com.entity.view.DiscussjingsaichengjiView;


/**
 * 竞赛成绩评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-16 14:42:37
 */
public interface DiscussjingsaichengjiDao extends BaseMapper<DiscussjingsaichengjiEntity> {
	
	List<DiscussjingsaichengjiVO> selectListVO(@Param("ew") Wrapper<DiscussjingsaichengjiEntity> wrapper);
	
	DiscussjingsaichengjiVO selectVO(@Param("ew") Wrapper<DiscussjingsaichengjiEntity> wrapper);
	
	List<DiscussjingsaichengjiView> selectListView(@Param("ew") Wrapper<DiscussjingsaichengjiEntity> wrapper);

	List<DiscussjingsaichengjiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingsaichengjiEntity> wrapper);
	
	DiscussjingsaichengjiView selectView(@Param("ew") Wrapper<DiscussjingsaichengjiEntity> wrapper);
	

}
