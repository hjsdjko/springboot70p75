package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingsaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingsaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingsaixinxiView;


/**
 * 竞赛信息评论表
 *
 * @author 
 * @email 
 * @date 2022-04-16 14:42:37
 */
public interface DiscussjingsaixinxiService extends IService<DiscussjingsaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingsaixinxiVO> selectListVO(Wrapper<DiscussjingsaixinxiEntity> wrapper);
   	
   	DiscussjingsaixinxiVO selectVO(@Param("ew") Wrapper<DiscussjingsaixinxiEntity> wrapper);
   	
   	List<DiscussjingsaixinxiView> selectListView(Wrapper<DiscussjingsaixinxiEntity> wrapper);
   	
   	DiscussjingsaixinxiView selectView(@Param("ew") Wrapper<DiscussjingsaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingsaixinxiEntity> wrapper);
   	

}

