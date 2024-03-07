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
 * 食谱信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-02 11:34:49
 */
@TableName("shipuxinxi")
public class ShipuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShipuxinxiEntity() {
		
	}
	
	public ShipuxinxiEntity(T t) {
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
	 * 食谱名称
	 */
					
	private String shipumingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 食谱分类
	 */
					
	private String shipufenlei;
	
	/**
	 * 烹饪方式
	 */
					
	private String pengrenfangshi;
	
	/**
	 * 做法
	 */
					
	private String zuofa;
	
	/**
	 * 功效
	 */
					
	private String gongxiao;
	
	/**
	 * 时长
	 */
					
	private String shizhang;
	
	/**
	 * 原材料
	 */
					
	private String yuancailiao;
	
	/**
	 * 搭配禁忌
	 */
					
	private String dapeijinji;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：食谱名称
	 */
	public void setShipumingcheng(String shipumingcheng) {
		this.shipumingcheng = shipumingcheng;
	}
	/**
	 * 获取：食谱名称
	 */
	public String getShipumingcheng() {
		return shipumingcheng;
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
	 * 设置：食谱分类
	 */
	public void setShipufenlei(String shipufenlei) {
		this.shipufenlei = shipufenlei;
	}
	/**
	 * 获取：食谱分类
	 */
	public String getShipufenlei() {
		return shipufenlei;
	}
	/**
	 * 设置：烹饪方式
	 */
	public void setPengrenfangshi(String pengrenfangshi) {
		this.pengrenfangshi = pengrenfangshi;
	}
	/**
	 * 获取：烹饪方式
	 */
	public String getPengrenfangshi() {
		return pengrenfangshi;
	}
	/**
	 * 设置：做法
	 */
	public void setZuofa(String zuofa) {
		this.zuofa = zuofa;
	}
	/**
	 * 获取：做法
	 */
	public String getZuofa() {
		return zuofa;
	}
	/**
	 * 设置：功效
	 */
	public void setGongxiao(String gongxiao) {
		this.gongxiao = gongxiao;
	}
	/**
	 * 获取：功效
	 */
	public String getGongxiao() {
		return gongxiao;
	}
	/**
	 * 设置：时长
	 */
	public void setShizhang(String shizhang) {
		this.shizhang = shizhang;
	}
	/**
	 * 获取：时长
	 */
	public String getShizhang() {
		return shizhang;
	}
	/**
	 * 设置：原材料
	 */
	public void setYuancailiao(String yuancailiao) {
		this.yuancailiao = yuancailiao;
	}
	/**
	 * 获取：原材料
	 */
	public String getYuancailiao() {
		return yuancailiao;
	}
	/**
	 * 设置：搭配禁忌
	 */
	public void setDapeijinji(String dapeijinji) {
		this.dapeijinji = dapeijinji;
	}
	/**
	 * 获取：搭配禁忌
	 */
	public String getDapeijinji() {
		return dapeijinji;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
