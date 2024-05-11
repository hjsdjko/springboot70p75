package com.entity.vo;

import com.entity.JingsaichengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 竞赛成绩
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-16 14:42:37
 */
public class JingsaichengjiVO  implements Serializable {
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
	 * 竞赛地点
	 */
	
	private String jingsaididian;
		
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
	 * 竞赛成绩
	 */
	
	private String jingsaichengji;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：竞赛成绩
	 */
	 
	public void setJingsaichengji(String jingsaichengji) {
		this.jingsaichengji = jingsaichengji;
	}
	
	/**
	 * 获取：竞赛成绩
	 */
	public String getJingsaichengji() {
		return jingsaichengji;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
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
			
}
