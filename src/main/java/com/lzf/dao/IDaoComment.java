/**
 * 
 */
package com.lzf.dao;

import com.lzf.entity.Comment;

/**
 * 评论的数据访问层的接口
 * 
 * @author MJCoder
 */
public interface IDaoComment {
	/**
	 * 添加新的评论
	 * 
	 * @param comment
	 *            评论实体类的对象
	 * @return 返回添加新的评论的个数。如果小于0，则添加失败。
	 */
	int insert(Comment comment);

	/**
	 * 通过日志的ID删除与该日志相关的所有评论
	 * 
	 * @param logId
	 *            日志的ID
	 * @return 返回删除新的评论的个数。如果小于0，则删除失败。
	 */
	int deleteByLogId(int logId);
}
