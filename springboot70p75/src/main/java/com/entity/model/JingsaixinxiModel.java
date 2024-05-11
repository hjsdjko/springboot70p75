package com.entity.model;

import com.entity.JingsaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 竞赛信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-16 14:42:37
 */
public class JingsaixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 竞赛标题
	 */
	
	private String jingsaibiaoti;
		
	/**
	 * 竞赛分类
	 */
	
	private String jingsaifenlei;
		
	/**
	 * 截至时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiezhishijian;
		
	/**
	 * 竞赛地点
	 */
	
	private String jingsaididian;
		
	/**
	 * 竞赛内容
	 */
	
	private String jingsaineirong;
		
	/**
	 * 竞赛封面
	 */
	
	private String jingsaifengmian;
		
	/**
	 * 名称
	 */
	
	private String mingcheng;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
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
				
	
	/**
	 * 设置：竞赛标题
	 */
	 
	public void setJingsaibiaoti(String jingsaibiaoti) {
		this.jingsaibiaoti = jingsaibiaoti;
	}
	
	/**
	 * 获取：竞赛标题
	 */
	public String getJingsaibiaoti() {
		return jingsaibiaoti;
	}
				
	
	/**
	 * 设置：竞赛分类
	 */
	 
	public void setJingsaifenlei(String jingsaifenlei) {
		this.jingsaifenlei = jingsaifenlei;
	}
	
	/**
	 * 获取：竞赛分类
	 */
	public String getJingsaifenlei() {
		return jingsaifenlei;
	}
				
	
	/**
	 * 设置：截至时间
	 */
	 
	public void setJiezhishijian(Date jiezhishijian) {
		this.jiezhishijian = jiezhishijian;
	}
	
	/**
	 * 获取：截至时间
	 */
	public Date getJiezhishijian() {
		return jiezhishijian;
	}
				
	
	/**
	 * 设置：竞赛地点
	 */
	 
	public void setJingsaididian(String jingsaididian) {
		this.jingsaididian = jingsaididian;
	}
	
	/**
	 * 获取：竞赛地点
	 */
	public String getJingsaididian() {
		return jingsaididian;
	}
				
	
	/**
	 * 设置：竞赛内容
	 */
	 
	public void setJingsaineirong(String jingsaineirong) {
		this.jingsaineirong = jingsaineirong;
	}
	
	/**
	 * 获取：竞赛内容
	 */
	public String getJingsaineirong() {
		return jingsaineirong;
	}
				
	
	/**
	 * 设置：竞赛封面
	 */
	 
	public void setJingsaifengmian(String jingsaifengmian) {
		this.jingsaifengmian = jingsaifengmian;
	}
	
	/**
	 * 获取：竞赛封面
	 */
	public String getJingsaifengmian() {
		return jingsaifengmian;
	}
				
	
	/**
	 * 设置：名称
	 */
	 
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
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
