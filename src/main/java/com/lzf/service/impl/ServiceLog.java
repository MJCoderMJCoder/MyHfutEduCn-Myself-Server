/**
 * 
 */
package com.lzf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzf.dao.IDaoComment;
import com.lzf.dao.IDaoLog;
import com.lzf.entity.Log;
import com.lzf.service.IServiceLog;

/**
 * 日志的服务层
 * 
 * @author MJCoder
 */
@Service
public class ServiceLog implements IServiceLog {

	/**
	 * 日志的数据访问层
	 */
	@Autowired
	private IDaoLog daolog;

	/**
	 * 评论的数据访问层
	 */
	@Autowired
	private IDaoComment daoComment;

	/**
	 * 日志的服务层的无参构造方法
	 */
	public ServiceLog() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 添加新的日志
	 * 
	 * @param log
	 *            日志实体类的对象
	 * @return 返回添加新的日志的个数。如果小于0，则添加失败。
	 */
	@Override
	public int insert(Log log) {
		// TODO Auto-generated method stub
		int temp = -1;
		try {
			temp = daolog.insert(log);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			return temp;
		}
	}

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
	 *            发布日志的用户所在的学业
	 * @param logUserMajor
	 *            发布日志的用户的专业
	 * @param logUserClass
	 *            发布日志的用户的班级
	 * @return 返回一系列日志。
	 */
	@Override
	public List<Log> dimSelect(String logTxt, String logUserName, String logUserPhone, String logUserEmail, String logUserGender, String logUserBirthday, String logUserDepart,
			String logUserMajor, String logUserClass) {
		// TODO Auto-generated method stub
		return daolog.dimSelect(logTxt, logUserName, logUserPhone, logUserEmail, logUserGender, logUserBirthday, logUserDepart, logUserMajor, logUserClass);
	}

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
	@Override
	public List<Log> select(String logTxt, String logUserName, String logUserPhone, String logUserEmail, String logUserGender, String logUserBirthday, String logUserDepart,
			String logUserMajor, String logUserClass) {
		// TODO Auto-generated method stub
		return daolog.select(logTxt, logUserName, logUserPhone, logUserEmail, logUserGender, logUserBirthday, logUserDepart, logUserMajor, logUserClass);
	}

	/**
	 * 点赞数加一，更新日志的praise字段（加一后的值）。
	 * 
	 * @param logId
	 *            点赞的日志ID
	 * @return 返回更新日志的个数。如果小于0，则更新失败。
	 */
	@Override
	public int praise(int logId) {
		// TODO Auto-generated method stub
		int temp = -1;
		try {
			temp = daolog.praise(logId);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			return temp;
		}
	}

	/**
	 * 删除日志
	 * 
	 * @param logId
	 *            删除的日志ID
	 * @return 返回删除日志的个数。如果小于0，则删除失败。
	 */
	@Override
	public int delete(int logId) {
		// TODO Auto-generated method stub
		int temp = -1;
		try {
			temp = daoComment.deleteByLogId(logId);
			temp = daolog.delete(logId);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			return temp;
		}
	}

}
