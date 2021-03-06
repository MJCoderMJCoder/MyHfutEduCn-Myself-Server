/**
 * 
 */
package com.lzf.entity;

import java.sql.Timestamp;
import java.util.List;

/**
 * 日志的实体类
 * 
 * @author MJCoder
 */
public class Log {
	/**
	 * 日志的ID
	 */
	private int logId;
	/**
	 * 日志的发布时间
	 */
	private Timestamp logTime;
	/**
	 * 日志的图片
	 */
	private String logImg;
	/**
	 * 日志的文本内容
	 */
	private String logTxt;
	/**
	 * 日志的点赞数
	 */
	private int logPraise;
	/**
	 * 发布日志的用户名
	 */
	private String logUserName;
	/**
	 * 发布日志的用户的手机
	 */
	private String logUserPhone;
	/**
	 * 发布日志的用户的邮箱
	 */
	private String logUserEmail;
	/**
	 * 发布日志的用户的性别
	 */
	private String logUserGender;
	/**
	 * 发布日志的用户的出生日期
	 */
	private String logUserBirthday;
	/**
	 * 发布日志的用户所在的学院
	 */
	private String logUserDepart;
	/**
	 * 发布日志的用户的专业
	 */
	private String logUserMajor;
	/**
	 * 发布日志的用户的班级
	 */
	private String logUserClass;
	/**
	 * 是否匿名发表日志
	 */
	private boolean logIsAnonymity;
	/**
	 * 与该日志相关的所有评论
	 */
	private List<Comment> comments;

	/**
	 * 日志实体类的无参构造方法
	 */
	public Log() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 日志实体类的有参构造方法
	 * 
	 * @param logId
	 *            日志的ID
	 * @param logTime
	 *            日志的发布时间
	 * @param logImg
	 *            日志的图片
	 * @param logTxt
	 *            日志的文本内容
	 * @param logPraise
	 *            日志的点赞数
	 * @param logUserName
	 *            发布日志的用户名
	 * @param logUserPhone
	 *            发布日志的用户的手机
	 * @param logUserEmail
	 *            发布日志的用户的邮箱
	 * @param logUserGender
	 *            发布日志的用户的性别
	 * @param logUserBirthday
	 *            发布日志的用户的出生日期
	 * @param logUserDepart
	 *            发布日志的用户所在的学院
	 * @param logUserMajor
	 *            发布日志的用户的专业
	 * @param logUserClass
	 *            发布日志的用户的班级
	 * @param logIsAnonymity
	 *            是否匿名发表日志
	 * @param comments
	 *            与该日志相关的所有评论
	 */
	public Log(int logId, Timestamp logTime, String logImg, String logTxt, int logPraise, String logUserName, String logUserPhone, String logUserEmail, String logUserGender,
			String logUserBirthday, String logUserDepart, String logUserMajor, String logUserClass, boolean logIsAnonymity, List<Comment> comments) {
		super();
		this.logId = logId;
		this.logTime = logTime;
		this.logImg = logImg;
		this.logTxt = logTxt;
		this.logPraise = logPraise;
		this.logUserName = logUserName;
		this.logUserPhone = logUserPhone;
		this.logUserEmail = logUserEmail;
		this.logUserGender = logUserGender;
		this.logUserBirthday = logUserBirthday;
		this.logUserDepart = logUserDepart;
		this.logUserMajor = logUserMajor;
		this.logUserClass = logUserClass;
		this.logIsAnonymity = logIsAnonymity;
		this.comments = comments;
	}

	/**
	 * 获取日志的ID
	 * 
	 * @return 日志的ID
	 */
	public int getLogId() {
		return logId;
	}

	/**
	 * 设置日志的ID
	 * 
	 * @param logId
	 *            日志的ID
	 */
	public void setLogId(int logId) {
		this.logId = logId;
	}

	/**
	 * 获取日志的发布时间
	 * 
	 * @return 日志的发布时间
	 */
	public Timestamp getLogTime() {
		return logTime;
	}

	/**
	 * 设置日志的发布时间
	 * 
	 * @param logTime
	 *            日志的发布时间
	 */
	public void setLogTime(Timestamp logTime) {
		this.logTime = logTime;
	}

	/**
	 * 获取日志的图片
	 * 
	 * @return 日志的图片
	 */
	public String getLogImg() {
		return logImg;
	}

	/**
	 * 设置日志的图片
	 * 
	 * @param logImg
	 *            日志的图片
	 */
	public void setLogImg(String logImg) {
		this.logImg = logImg;
	}

	/**
	 * 获取日志的文本内容
	 * 
	 * @return 日志的文本内容
	 */
	public String getLogTxt() {
		return logTxt;
	}

	/**
	 * 设置日志的文本内容
	 * 
	 * @param logTxt
	 *            日志的文本内容
	 */
	public void setLogTxt(String logTxt) {
		this.logTxt = logTxt;
	}

	/**
	 * 获取日志的点赞数
	 * 
	 * @return 日志的点赞数
	 */
	public int getLogPraise() {
		return logPraise;
	}

	/**
	 * 设置日志的点赞数
	 * 
	 * @param logPraise
	 *            日志的点赞数
	 */
	public void setLogPraise(int logPraise) {
		this.logPraise = logPraise;
	}

	/**
	 * 获取发布日志的用户名
	 * 
	 * @return 发布日志的用户名
	 */
	public String getLogUserName() {
		return logUserName;
	}

	/**
	 * 设置发布日志的用户名
	 * 
	 * @param logUserName
	 *            发布日志的用户名
	 */
	public void setLogUserName(String logUserName) {
		this.logUserName = logUserName;
	}

	/**
	 * 获取发布该日志的用户的手机
	 *
	 * @return 发布该日志的用户的手机
	 */
	public String getLogUserPhone() {
		return logUserPhone;
	}

	/**
	 * 设置发布该日志的用户的手机
	 *
	 * @param logUserPhone
	 *            发布该日志的用户的手机
	 */
	public void setLogUserPhone(String logUserPhone) {
		this.logUserPhone = logUserPhone;
	}

	/**
	 * 获取发布该日志的用户的邮箱
	 *
	 * @return 发布该日志的用户的邮箱
	 */
	public String getLogUserEmail() {
		return logUserEmail;
	}

	/**
	 * 设置发布该日志的用户的邮箱
	 *
	 * @param logUserEmail
	 *            发布该日志的用户的邮箱
	 */
	public void setLogUserEmail(String logUserEmail) {
		this.logUserEmail = logUserEmail;
	}

	/**
	 * 获取发布该日志的用户的性别
	 *
	 * @return 发布该日志的用户的性别
	 */
	public String getLogUserGender() {
		return logUserGender;
	}

	/**
	 * 设置发布该日志的用户的性别
	 *
	 * @param logUserGender
	 *            发布该日志的用户的性别
	 */
	public void setLogUserGender(String logUserGender) {
		this.logUserGender = logUserGender;
	}

	/**
	 * 获取发布该日志的用户的出生日期
	 *
	 * @return 发布该日志的用户的出生日期
	 */
	public String getLogUserBirthday() {
		return logUserBirthday;
	}

	/**
	 * 设置发布该日志的用户的出生日期
	 *
	 * @param logUserBirthday
	 *            发布该日志的用户的出生日期
	 */
	public void setLogUserBirthday(String logUserBirthday) {
		this.logUserBirthday = logUserBirthday;
	}

	/**
	 * 获取发布该日志的用户所在的学院
	 *
	 * @return 发布该日志的用户所在的学院
	 */
	public String getLogUserDepart() {
		return logUserDepart;
	}

	/**
	 * 设置发布该日志的用户所在的学院
	 *
	 * @param logUserDepart
	 *            发布该日志的用户所在的学院
	 */
	public void setLogUserDepart(String logUserDepart) {
		this.logUserDepart = logUserDepart;
	}

	/**
	 * 获取发布该日志的用户的专业
	 *
	 * @return 发布该日志的用户的专业
	 */
	public String getLogUserMajor() {
		return logUserMajor;
	}

	/**
	 * 设置发布该日志的用户的专业
	 *
	 * @param logUserMajor
	 *            发布该日志的用户的专业
	 */
	public void setLogUserMajor(String logUserMajor) {
		this.logUserMajor = logUserMajor;
	}

	/**
	 * 获取发布该日志的用户的班级
	 *
	 * @return 发布该日志的用户的班级
	 */
	public String getLogUserClass() {
		return logUserClass;
	}

	/**
	 * 设置发布该日志的用户的班级
	 *
	 * @param logUserClass
	 *            发布该日志的用户的班级
	 */
	public void setLogUserClass(String logUserClass) {
		this.logUserClass = logUserClass;
	}

	/**
	 * 获取该日志是否匿名发表
	 *
	 * @return 该日志是否匿名发表（true：匿名发表；false：实名发表）
	 */
	public boolean isLogIsAnonymity() {
		return logIsAnonymity;
	}

	/**
	 * 设置该日志是否匿名发表
	 *
	 * @param logIsAnonymity
	 *            该日志是否匿名发表（true：匿名发表；false：实名发表）
	 */
	public void setLogIsAnonymity(boolean logIsAnonymity) {
		this.logIsAnonymity = logIsAnonymity;
	}

	/**
	 * 获取与该日志相关的所有评论
	 *
	 * @return 与该日志相关的所有评论
	 * @see Comment
	 */
	public List<Comment> getComments() {
		return comments;
	}

	/**
	 * 设置与该日志相关的所有评论
	 *
	 * @param comments
	 *            与该日志相关的所有评论
	 * @see Comment
	 */
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	/**
	 * 返回对象的字符串表示形式。 通常，{@code toString}方法返回一个“文本表示”此对象的字符串。 结果应该是一个简洁但信息丰富的表示，便于人们阅读。
	 * 
	 * @return 对象的字符串表示
	 */
	@Override
	public String toString() {
		return "Log [logId=" + logId + ", logTime=" + logTime + ", logImg=" + logImg + ", logTxt=" + logTxt + ", logPraise=" + logPraise + ", logUserName=" + logUserName
				+ ", logUserPhone=" + logUserPhone + ", logUserEmail=" + logUserEmail + ", logUserGender=" + logUserGender + ", logUserBirthday=" + logUserBirthday
				+ ", logUserDepart=" + logUserDepart + ", logUserMajor=" + logUserMajor + ", logUserClass=" + logUserClass + ", logIsAnonymity=" + logIsAnonymity + ", comments="
				+ comments + "]";
	}
}
