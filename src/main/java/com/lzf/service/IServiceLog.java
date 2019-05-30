/**
 * 
 */
package com.lzf.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lzf.entity.Log;

/**
 * 日志的服务层接口
 * 
 * @author MJCoder
 */
public interface IServiceLog {

	/**
	 * 添加新的日志
	 * 
	 * @param log
	 *            日志实体类的对象
	 * @return 返回添加新的日志的个数。如果小于0，则添加失败。
	 */
	int insert(Log log);

	/**
	 * 模糊查询日志
	 * 
	 * @param logTxt
	 *            日志的文本内容
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
	 * @return 返回一系列日志。
	 */
	List<Log> dimSelect(String logTxt, String logUserName, String logUserPhone, String logUserEmail, String logUserGender, String logUserBirthday, String logUserDepart,
			String logUserMajor, String logUserClass);

	/**
	 * 查询日志
	 * 
	 * @param logTxt
	 *            日志的文本内容
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
	 *            发布日志的用户所在的学业
	 * @param logUserMajor
	 *            发布日志的用户的专业
	 * @param logUserClass
	 *            发布日志的用户的班级
	 * @return 返回一系列日志。
	 */
	List<Log> select(String logTxt, String logUserName, String logUserPhone, String logUserEmail, String logUserGender, String logUserBirthday, String logUserDepart,
			String logUserMajor, String logUserClass);

	/**
	 * 点赞数加一，更新日志的praise字段（加一后的值）。
	 * 
	 * @param logId
	 *            点赞的日志ID
	 * @return 返回更新日志的个数。如果小于0，则更新失败。
	 */
	int praise(int logId);

	/**
	 * 删除日志
	 * 
	 * @param logId
	 *            删除的日志ID
	 * @return 返回删除日志的个数。如果小于0，则删除失败。
	 */
	int delete(int logId);
}
