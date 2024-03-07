package com.entity.vo;

import com.entity.YizhoushipujiankanganpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 一周食谱健康安排
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-02 11:34:49
 */
public class YizhoushipujiankanganpaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 星期一
	 */
	
	private String xingqiyi;
		
	/**
	 * 星期二
	 */
	
	private String xingqier;
		
	/**
	 * 星期三
	 */
	
	private String xingqisan;
		
	/**
	 * 星期四
	 */
	
	private String xingqisi;
		
	/**
	 * 星期五
	 */
	
	private String xingqiwu;
		
	/**
	 * 星期六
	 */
	
	private String xingqiliu;
		
	/**
	 * 星期天
	 */
	
	private String xingqitian;
				
	
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
	 * 设置：星期一
	 */
	 
	public void setXingqiyi(String xingqiyi) {
		this.xingqiyi = xingqiyi;
	}
	
	/**
	 * 获取：星期一
	 */
	public String getXingqiyi() {
		return xingqiyi;
	}
				
	
	/**
	 * 设置：星期二
	 */
	 
	public void setXingqier(String xingqier) {
		this.xingqier = xingqier;
	}
	
	/**
	 * 获取：星期二
	 */
	public String getXingqier() {
		return xingqier;
	}
				
	
	/**
	 * 设置：星期三
	 */
	 
	public void setXingqisan(String xingqisan) {
		this.xingqisan = xingqisan;
	}
	
	/**
	 * 获取：星期三
	 */
	public String getXingqisan() {
		return xingqisan;
	}
				
	
	/**
	 * 设置：星期四
	 */
	 
	public void setXingqisi(String xingqisi) {
		this.xingqisi = xingqisi;
	}
	
	/**
	 * 获取：星期四
	 */
	public String getXingqisi() {
		return xingqisi;
	}
				
	
	/**
	 * 设置：星期五
	 */
	 
	public void setXingqiwu(String xingqiwu) {
		this.xingqiwu = xingqiwu;
	}
	
	/**
	 * 获取：星期五
	 */
	public String getXingqiwu() {
		return xingqiwu;
	}
				
	
	/**
	 * 设置：星期六
	 */
	 
	public void setXingqiliu(String xingqiliu) {
		this.xingqiliu = xingqiliu;
	}
	
	/**
	 * 获取：星期六
	 */
	public String getXingqiliu() {
		return xingqiliu;
	}
				
	
	/**
	 * 设置：星期天
	 */
	 
	public void setXingqitian(String xingqitian) {
		this.xingqitian = xingqitian;
	}
	
	/**
	 * 获取：星期天
	 */
	public String getXingqitian() {
		return xingqitian;
	}
			
}
