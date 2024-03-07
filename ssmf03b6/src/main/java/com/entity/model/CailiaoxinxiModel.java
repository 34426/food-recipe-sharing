package com.entity.model;

import com.entity.CailiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 材料信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-02 11:34:49
 */
public class CailiaoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 食物功效
	 */
	
	private String shiwugongxiao;
		
	/**
	 * 食物搭配
	 */
	
	private String shiwudapei;
		
	/**
	 * 食物禁忌
	 */
	
	private String shiwujinji;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：食物功效
	 */
	 
	public void setShiwugongxiao(String shiwugongxiao) {
		this.shiwugongxiao = shiwugongxiao;
	}
	
	/**
	 * 获取：食物功效
	 */
	public String getShiwugongxiao() {
		return shiwugongxiao;
	}
				
	
	/**
	 * 设置：食物搭配
	 */
	 
	public void setShiwudapei(String shiwudapei) {
		this.shiwudapei = shiwudapei;
	}
	
	/**
	 * 获取：食物搭配
	 */
	public String getShiwudapei() {
		return shiwudapei;
	}
				
	
	/**
	 * 设置：食物禁忌
	 */
	 
	public void setShiwujinji(String shiwujinji) {
		this.shiwujinji = shiwujinji;
	}
	
	/**
	 * 获取：食物禁忌
	 */
	public String getShiwujinji() {
		return shiwujinji;
	}
			
}
