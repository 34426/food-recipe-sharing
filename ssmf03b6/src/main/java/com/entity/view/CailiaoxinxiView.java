package com.entity.view;

import com.entity.CailiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 材料信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 11:34:49
 */
@TableName("cailiaoxinxi")
public class CailiaoxinxiView  extends CailiaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CailiaoxinxiView(){
	}
 
 	public CailiaoxinxiView(CailiaoxinxiEntity cailiaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, cailiaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
