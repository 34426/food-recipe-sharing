package com.entity.view;

import com.entity.ShipuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 食谱信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 11:34:49
 */
@TableName("shipuxinxi")
public class ShipuxinxiView  extends ShipuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShipuxinxiView(){
	}
 
 	public ShipuxinxiView(ShipuxinxiEntity shipuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, shipuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
