package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingsaichengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingsaichengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingsaichengjiView;


/**
 * 竞赛成绩评论表
 *
 * @author 
 * @email 
 * @date 2022-04-16 14:42:37
 */
public interface DiscussjingsaichengjiService extends IService<DiscussjingsaichengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingsaichengjiVO> selectListVO(Wrapper<DiscussjingsaichengjiEntity> wrapper);
   	
   	DiscussjingsaichengjiVO selectVO(@Param("ew") Wrapper<DiscussjingsaichengjiEntity> wrapper);
   	
   	List<DiscussjingsaichengjiView> selectListView(Wrapper<DiscussjingsaichengjiEntity> wrapper);
   	
   	DiscussjingsaichengjiView selectView(@Param("ew") Wrapper<DiscussjingsaichengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingsaichengjiEntity> wrapper);
   	

}

