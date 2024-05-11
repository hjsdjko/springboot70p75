package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhubanfangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhubanfangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhubanfangView;


/**
 * 主办方
 *
 * @author 
 * @email 
 * @date 2022-04-16 14:42:37
 */
public interface ZhubanfangService extends IService<ZhubanfangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhubanfangVO> selectListVO(Wrapper<ZhubanfangEntity> wrapper);
   	
   	ZhubanfangVO selectVO(@Param("ew") Wrapper<ZhubanfangEntity> wrapper);
   	
   	List<ZhubanfangView> selectListView(Wrapper<ZhubanfangEntity> wrapper);
   	
   	ZhubanfangView selectView(@Param("ew") Wrapper<ZhubanfangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhubanfangEntity> wrapper);
   	

}

