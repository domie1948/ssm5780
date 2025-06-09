package com.entity.view;

import com.entity.ShouhouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 售后
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-02 23:13:39
 */
@TableName("shouhou")
public class ShouhouView  extends ShouhouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShouhouView(){
	}
 
 	public ShouhouView(ShouhouEntity shouhouEntity){
 	try {
			BeanUtils.copyProperties(this, shouhouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
