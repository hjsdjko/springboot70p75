package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingsaichengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingsaichengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingsaichengjiView;


/**
 * 竞赛成绩
 *
 * @author 
 * @email 
 * @date 2022-04-16 14:42:37
 */
public interface JingsaichengjiService extends IService<JingsaichengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingsaichengjiVO> selectListVO(Wrapper<JingsaichengjiEntity> wrapper);
   	
   	JingsaichengjiVO selectVO(@Param("ew") Wrapper<JingsaichengjiEntity> wrapper);
   	
   	List<JingsaichengjiView> selectListView(Wrapper<JingsaichengjiEntity> wrapper);
   	
   	JingsaichengjiView selectView(@Param("ew") Wrapper<JingsaichengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingsaichengjiEntity> wrapper);
   	

}

