package com.entity.view;

import com.entity.JubaotousuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 举报投诉
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-02 23:13:39
 */
@TableName("jubaotousu")
public class JubaotousuView  extends JubaotousuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JubaotousuView(){
	}
 
 	public JubaotousuView(JubaotousuEntity jubaotousuEntity){
 	try {
			BeanUtils.copyProperties(this, jubaotousuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
