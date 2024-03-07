package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 一周食谱健康安排
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-02 11:34:49
 */
@TableName("yizhoushipujiankanganpai")
public class YizhoushipujiankanganpaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YizhoushipujiankanganpaiEntity() {
		
	}
	
	public YizhoushipujiankanganpaiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 标题名称
	 */
					
	private String biaotimingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：标题名称
	 */
	public void setBiaotimingcheng(String biaotimingcheng) {
		this.biaotimingcheng = biaotimingcheng;
	}
	/**
	 * 获取：标题名称
	 */
	public String getBiaotimingcheng() {
		return biaotimingcheng;
	}
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
