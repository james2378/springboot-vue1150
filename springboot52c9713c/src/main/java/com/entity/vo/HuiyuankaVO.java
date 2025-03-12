package com.entity.vo;

import com.entity.HuiyuankaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 会员卡
 * @author 
 * @email 
 * @date 2024-03-05 17:02:10
 */
public class HuiyuankaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 会员卡金额
	 */
	
	private Integer yue;
		
	/**
	 * 会员折扣
	 */
	
	private Double huiyuanzhekou;
		
	/**
	 * 会员功能
	 */
	
	private String huiyuangongneng;
				
	
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
	 * 设置：会员卡金额
	 */
	 
	public void setYue(Integer yue) {
		this.yue = yue;
	}
	
	/**
	 * 获取：会员卡金额
	 */
	public Integer getYue() {
		return yue;
	}
				
	
	/**
	 * 设置：会员折扣
	 */
	 
	public void setHuiyuanzhekou(Double huiyuanzhekou) {
		this.huiyuanzhekou = huiyuanzhekou;
	}
	
	/**
	 * 获取：会员折扣
	 */
	public Double getHuiyuanzhekou() {
		return huiyuanzhekou;
	}
				
	
	/**
	 * 设置：会员功能
	 */
	 
	public void setHuiyuangongneng(String huiyuangongneng) {
		this.huiyuangongneng = huiyuangongneng;
	}
	
	/**
	 * 获取：会员功能
	 */
	public String getHuiyuangongneng() {
		return huiyuangongneng;
	}
			
}
