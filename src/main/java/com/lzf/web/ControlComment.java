/**
 * 
 */
package com.lzf.web;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzf.entity.Comment;
import com.lzf.service.IServiceComment;

/**
 * 评论的控制层
 * 
 * @author MJCoder
 */
@Controller
@RequestMapping("comment")
public class ControlComment {
	/**
	 * 评论的服务层
	 */
	@Autowired
	private IServiceComment serviceComment;

	/**
	 * 评论的控制层的无参构造方法
	 */
	public ControlComment() {
	}

	/**
	 * 发布评论
	 * 
	 * @param request
	 *            携带有客户端HTTP请求的所有信息（HttpServletRequest对象提供包括参数名称和值，属性和输入流的数据）
	 * @return 数据传输对象 {@link DtoPackaging}
	 */
	@ResponseBody
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	private Object insert(HttpServletRequest request) {
		DtoPackaging dtoPackaging = null;
		String commentTxt = request.getParameter("commentTxt");
		int commentLog = Integer.parseInt(request.getParameter("commentLog"));
		String commentUserName = request.getParameter("commentUserName");
		String commentUserPhone = request.getParameter("commentUserPhone");
		String commentUserEmail = request.getParameter("commentUserEmail");
		String commentUserGender = request.getParameter("commentUserGender");
		String commentUserBirthday = request.getParameter("commentUserBirthday");
		String commentUserDepart = request.getParameter("commentUserDepart");
		String commentUserMajor = request.getParameter("commentUserMajor");
		String commentUserClass = request.getParameter("commentUserClass");
		boolean commentIsAnonymity = Boolean.parseBoolean(request.getParameter("commentIsAnonymity"));
		String replyUserName = request.getParameter("replyUserName");
		String replyUserPhone = request.getParameter("replyUserPhone");
		String replyUserEmail = request.getParameter("replyUserEmail");
		String replyUserGender = request.getParameter("replyUserGender");
		String replyUserBirthday = request.getParameter("replyUserBirthday");
		String replyUserDepart = request.getParameter("replyUserDepart");
		String replyUserMajor = request.getParameter("replyUserMajor");
		String replyUserClass = request.getParameter("replyUserClass");
		Comment comment = new Comment(0, Timestamp.valueOf(LocalDateTime.now()), commentTxt, commentLog, commentUserName, commentUserPhone, commentUserEmail, commentUserGender,
				commentUserBirthday, commentUserDepart, commentUserMajor, commentUserClass, commentIsAnonymity, replyUserName, replyUserPhone, replyUserEmail, replyUserGender,
				replyUserBirthday, replyUserDepart, replyUserMajor, replyUserClass);
		int result = serviceComment.insert(comment);
		if (result <= 0) {
			dtoPackaging = new DtoPackaging(false, "评论失败", null);
		} else {
			dtoPackaging = new DtoPackaging(true, "评论成功", comment);
		}
		return dtoPackaging;
	}

}
