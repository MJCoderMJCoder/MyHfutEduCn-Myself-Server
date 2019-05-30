/**
 * 
 */
package com.lzf.service;

import com.lzf.entity.Comment;

/**
 * 评论的服务层接口
 * 
 * @author MJCoder
 */
public interface IServiceComment {

	/**
	 * 添加新的评论
	 * 
	 * @param comment
	 *            评论实体类的对象
	 * @return 返回添加新的评论的个数。如果小于0，则添加失败。
	 */
	int insert(Comment comment);
}
