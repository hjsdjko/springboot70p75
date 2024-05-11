package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingsaifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingsaifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingsaifenleiView;


/**
 * 竞赛分类
 *
 * @author 
 * @email 
 * @date 2022-04-16 14:42:37
 */
public interface JingsaifenleiService extends IService<JingsaifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingsaifenleiVO> selectListVO(Wrapper<JingsaifenleiEntity> wrapper);
   	
   	JingsaifenleiVO selectVO(@Param("ew") Wrapper<JingsaifenleiEntity> wrapper);
   	
   	List<JingsaifenleiView> selectListView(Wrapper<JingsaifenleiEntity> wrapper);
   	
   	JingsaifenleiView selectView(@Param("ew") Wrapper<JingsaifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingsaifenleiEntity> wrapper);
   	

}

