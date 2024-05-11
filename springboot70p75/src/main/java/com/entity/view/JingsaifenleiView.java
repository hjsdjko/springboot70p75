package com.entity.view;

import com.entity.JingsaifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 竞赛分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-16 14:42:37
 */
@TableName("jingsaifenlei")
public class JingsaifenleiView  extends JingsaifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingsaifenleiView(){
	}
 
 	public JingsaifenleiView(JingsaifenleiEntity jingsaifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, jingsaifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
