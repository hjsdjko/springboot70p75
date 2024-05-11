package com.entity.view;

import com.entity.DiscussjingsaichengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 竞赛成绩评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-16 14:42:37
 */
@TableName("discussjingsaichengji")
public class DiscussjingsaichengjiView  extends DiscussjingsaichengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjingsaichengjiView(){
	}
 
 	public DiscussjingsaichengjiView(DiscussjingsaichengjiEntity discussjingsaichengjiEntity){
 	try {
			BeanUtils.copyProperties(this, discussjingsaichengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
