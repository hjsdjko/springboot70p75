package com.dao;

import com.entity.ZhubanfangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhubanfangVO;
import com.entity.view.ZhubanfangView;


/**
 * 主办方
 * 
 * @author 
 * @email 
 * @date 2022-04-16 14:42:37
 */
public interface ZhubanfangDao extends BaseMapper<ZhubanfangEntity> {
	
	List<ZhubanfangVO> selectListVO(@Param("ew") Wrapper<ZhubanfangEntity> wrapper);
	
	ZhubanfangVO selectVO(@Param("ew") Wrapper<ZhubanfangEntity> wrapper);
	
	List<ZhubanfangView> selectListView(@Param("ew") Wrapper<ZhubanfangEntity> wrapper);

	List<ZhubanfangView> selectListView(Pagination page,@Param("ew") Wrapper<ZhubanfangEntity> wrapper);
	
	ZhubanfangView selectView(@Param("ew") Wrapper<ZhubanfangEntity> wrapper);
	

}
