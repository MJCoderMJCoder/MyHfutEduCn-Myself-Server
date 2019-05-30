/**
 * 
 */
package com.lzf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzf.dao.IDaoComment;
import com.lzf.entity.Comment;
import com.lzf.service.IServiceComment;

/**
 * 评论的服务层
 * 
 * @author MJCoder
 */
@Service
public class ServiceComment implements IServiceComment {

	/**
	 * 评论的数据访问层
	 */
	@Autowired
	private IDaoComment daoComment;

	/**
	 * 评论的服务层的无参构造方法
	 */
	public ServiceComment() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 添加新的评论
	 * 
	 * @param comment
	 *            评论实体类的对象
	 * @return 返回添加新的评论的个数。如果小于0，则添加失败。
	 */
	@Override
	public int insert(Comment comment) {
		// TODO Auto-generated method stub
		int temp = -1;
		try {
			temp = daoComment.insert(comment);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			return temp;
		}
	}
}
