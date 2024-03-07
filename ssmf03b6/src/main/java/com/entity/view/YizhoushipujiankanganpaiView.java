package com.entity.view;

import com.entity.YizhoushipujiankanganpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 一周食谱健康安排
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 11:34:49
 */
@TableName("yizhoushipujiankanganpai")
public class YizhoushipujiankanganpaiView  extends YizhoushipujiankanganpaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YizhoushipujiankanganpaiView(){
	}
 
 	public YizhoushipujiankanganpaiView(YizhoushipujiankanganpaiEntity yizhoushipujiankanganpaiEntity){
 	try {
			BeanUtils.copyProperties(this, yizhoushipujiankanganpaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
