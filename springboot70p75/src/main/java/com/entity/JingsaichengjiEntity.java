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
 * 竞赛成绩
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-16 14:42:37
 */
@TableName("jingsaichengji")
public class JingsaichengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JingsaichengjiEntity() {
		
	}
	
	public JingsaichengjiEntity(T t) {
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
	 * 竞赛编号
	 */
					
	private String jingsaibianhao;
	
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
	 * 设置：竞赛编号
	 */
	public void setJingsaibianhao(String jingsaibianhao) {
		this.jingsaibianhao = jingsaibianhao;
	}
	/**
	 * 获取：竞赛编号
	 */
	public String getJingsaibianhao() {
		return jingsaibianhao;
	}
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
