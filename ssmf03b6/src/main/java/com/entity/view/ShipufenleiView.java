package com.entity.view;

import com.entity.ShipufenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 食谱分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 11:34:49
 */
@TableName("shipufenlei")
public class ShipufenleiView  extends ShipufenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShipufenleiView(){
	}
 
 	public ShipufenleiView(ShipufenleiEntity shipufenleiEntity){
 	try {
			BeanUtils.copyProperties(this, shipufenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
