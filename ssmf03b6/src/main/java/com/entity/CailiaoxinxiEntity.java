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
 * 材料信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-02 11:34:49
 */
@TableName("cailiaoxinxi")
public class CailiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CailiaoxinxiEntity() {
		
	}
	
	public CailiaoxinxiEntity(T t) {
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
	 * 材料名称
	 */
					
	private String cailiaomingcheng;
	
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
	 * 设置：材料名称
	 */
	public void setCailiaomingcheng(String cailiaomingcheng) {
		this.cailiaomingcheng = cailiaomingcheng;
	}
	/**
	 * 获取：材料名称
	 */
	public String getCailiaomingcheng() {
		return cailiaomingcheng;
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
