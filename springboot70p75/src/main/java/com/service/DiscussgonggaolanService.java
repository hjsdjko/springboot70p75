package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussgonggaolanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussgonggaolanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussgonggaolanView;


/**
 * 公告栏评论表
 *
 * @author 
 * @email 
 * @date 2022-04-16 14:42:37
 */
public interface DiscussgonggaolanService extends IService<DiscussgonggaolanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussgonggaolanVO> selectListVO(Wrapper<DiscussgonggaolanEntity> wrapper);
   	
   	DiscussgonggaolanVO selectVO(@Param("ew") Wrapper<DiscussgonggaolanEntity> wrapper);
   	
   	List<DiscussgonggaolanView> selectListView(Wrapper<DiscussgonggaolanEntity> wrapper);
   	
   	DiscussgonggaolanView selectView(@Param("ew") Wrapper<DiscussgonggaolanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussgonggaolanEntity> wrapper);
   	

}

