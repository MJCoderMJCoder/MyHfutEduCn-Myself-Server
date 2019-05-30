/**
 * 
 */
package com.lzf.web;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.lzf.entity.Log;
import com.lzf.service.IServiceLog;

/**
 * 日志的控制层
 * 
 * @author MJCoder
 */
@Controller
@RequestMapping("log")
public class ControlLog {

	/**
	 * 日志的服务层
	 */
	@Resource
	private IServiceLog serviceTravelLog;

	/**
	 * 日志的控制层的无参构造方法
	 */
	public ControlLog() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 发表新的日志
	 * 
	 * @param request
	 *            携带有客户端HTTP请求的所有信息（HttpServletRequest对象提供包括参数名称和值，属性和输入流的数据）
	 * @return 数据传输对象 {@link DtoPackaging}
	 */
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	@ResponseBody
	private Object insert(HttpServletRequest request) {
		System.out.println("request：" + request);
		DtoPackaging dtoPackaging = null;
		try {
			String path = request.getServletContext().getRealPath("upload"); // uploads文件夹位置
			CommonsMultipartResolver cmr = new CommonsMultipartResolver(request.getServletContext());
			if (cmr.isMultipart(request)) {
				System.out.println("cmr：" + cmr);
				MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) (request);
				MultipartFile file = mRequest.getFile("logImg");
				String fileName = file.getOriginalFilename(); // 原始名称
				File dir = new File(path, UUID.randomUUID().toString() + "_" + fileName);// 新文件名
				if (!dir.exists()) { // 如果目标文件所在的目录不存在，则创建父目录
					dir.mkdirs();
				}
				file.transferTo(dir);// 将内存中的数据写入磁盘
				String logImg = dir.getAbsolutePath().substring(dir.getAbsolutePath().indexOf("upload")).replace("\\", "/");
				System.out.println(path + " >>> " + logImg);
				String logTxt = mRequest.getParameter("logTxt");
				String logUserName = mRequest.getParameter("logUserName");
				String logUserPhone = mRequest.getParameter("logUserPhone");
				String logUserEmail = mRequest.getParameter("logUserEmail");
				String logUserGender = mRequest.getParameter("logUserGender");
				String logUserBirthday = mRequest.getParameter("logUserBirthday");
				String logUserDepart = mRequest.getParameter("logUserDepart");
				String logUserMajor = mRequest.getParameter("logUserMajor");
				String logUserClass = mRequest.getParameter("logUserClass");
				boolean logIsAnonymity = Boolean.parseBoolean(mRequest.getParameter("logIsAnonymity"));
				Log log = new Log(0, Timestamp.valueOf(LocalDateTime.now()), logImg, logTxt, 0, logUserName, logUserPhone, logUserEmail, logUserGender, logUserBirthday,
						logUserDepart, logUserMajor, logUserClass, logIsAnonymity, null);
				System.out.println("前：" + log);
				int result = serviceTravelLog.insert(log);
				System.out.println("后：" + log);
				if (result <= 0) {
					dtoPackaging = new DtoPackaging(false, "日志发布失败", null);
				} else {
					dtoPackaging = new DtoPackaging(true, "日志发布成功", log);
				}
			}
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return dtoPackaging;
		}
	}

	/**
	 * 模糊查询日志
	 * 
	 * @param request
	 *            携带有客户端HTTP请求的所有信息（HttpServletRequest对象提供包括参数名称和值，属性和输入流的数据）
	 * @return 数据传输对象 {@link DtoPackaging}
	 */
	@RequestMapping(value = "dimSelect", method = RequestMethod.POST)
	@ResponseBody
	private Object dimSelect(HttpServletRequest request) {
		DtoPackaging dtoPackaging = null;
		String logTxt = "%" + request.getParameter("logTxt").replaceAll("%", "") + "%";
		String logUserName = "%" + request.getParameter("logUserName").replaceAll("%", "") + "%";
		String logUserPhone = "%" + request.getParameter("logUserPhone").replaceAll("%", "") + "%";
		String logUserEmail = "%" + request.getParameter("logUserEmail").replaceAll("%", "") + "%";
		String logUserGender = "%" + request.getParameter("logUserGender").replaceAll("%", "") + "%";
		String logUserBirthday = "%" + request.getParameter("logUserBirthday").replaceAll("%", "") + "%";
		String logUserDepart = "%" + request.getParameter("logUserDepart").replaceAll("%", "") + "%";
		String logUserMajor = "%" + request.getParameter("logUserMajor").replaceAll("%", "") + "%";
		String logUserClass = "%" + request.getParameter("logUserClass").replaceAll("%", "") + "%";
		List<Log> logs = serviceTravelLog.dimSelect(logTxt, logUserName, logUserPhone, logUserEmail, logUserGender, logUserBirthday, logUserDepart, logUserMajor, logUserClass);
		System.out.println(logs);
		if (logs == null) {
			dtoPackaging = new DtoPackaging(false, "旅游日志获取失败", null);
		} else {
			dtoPackaging = new DtoPackaging(true, "旅游日志获取成功", logs);
		}
		return dtoPackaging;
	}

	/**
	 * 查询日志
	 * 
	 * @param request
	 *            携带有客户端HTTP请求的所有信息（HttpServletRequest对象提供包括参数名称和值，属性和输入流的数据）
	 * @return 数据传输对象 {@link DtoPackaging}
	 */
	@RequestMapping(value = "select", method = RequestMethod.POST)
	@ResponseBody
	private Object select(HttpServletRequest request) {
		DtoPackaging dtoPackaging = null;
		String logTxt = "%" + request.getParameter("logTxt").replaceAll("%", "") + "%";
		String logUserName = "%" + request.getParameter("logUserName").replaceAll("%", "") + "%";
		String logUserPhone = "%" + request.getParameter("logUserPhone").replaceAll("%", "") + "%";
		String logUserEmail = "%" + request.getParameter("logUserEmail").replaceAll("%", "") + "%";
		String logUserGender = "%" + request.getParameter("logUserGender").replaceAll("%", "") + "%";
		String logUserBirthday = "%" + request.getParameter("logUserBirthday").replaceAll("%", "") + "%";
		String logUserDepart = "%" + request.getParameter("logUserDepart").replaceAll("%", "") + "%";
		String logUserMajor = "%" + request.getParameter("logUserMajor").replaceAll("%", "") + "%";
		String logUserClass = "%" + request.getParameter("logUserClass").replaceAll("%", "") + "%";
		List<Log> logs = serviceTravelLog.select(logTxt, logUserName, logUserPhone, logUserEmail, logUserGender, logUserBirthday, logUserDepart, logUserMajor, logUserClass);
		System.out.println(logs);
		if (logs == null) {
			dtoPackaging = new DtoPackaging(false, "旅游日志获取失败", null);
		} else {
			dtoPackaging = new DtoPackaging(true, "旅游日志获取成功", logs);
		}
		return dtoPackaging;
	}

	/**
	 * 日志点赞
	 * 
	 * @param request
	 *            携带有客户端HTTP请求的所有信息（HttpServletRequest对象提供包括参数名称和值，属性和输入流的数据）
	 * @return 数据传输对象 {@link DtoPackaging}
	 */
	@RequestMapping(value = "praise", method = RequestMethod.POST)
	@ResponseBody
	private Object praise(HttpServletRequest request) {
		DtoPackaging dtoPackaging = null;
		int logId = Integer.parseInt(request.getParameter("logId"));
		int result = serviceTravelLog.praise(logId);
		if (result <= 0) {
			dtoPackaging = new DtoPackaging(false, "点赞过快，请稍后重试。", null);
		} else {
			dtoPackaging = new DtoPackaging(true, "谢谢你！", null);
		}
		return dtoPackaging;
	}

	/**
	 * 日志删除
	 * 
	 * @param request
	 *            携带有客户端HTTP请求的所有信息（HttpServletRequest对象提供包括参数名称和值，属性和输入流的数据）
	 * @return 数据传输对象 {@link DtoPackaging}
	 */
	@RequestMapping(value = "delete", method = RequestMethod.POST)
	@ResponseBody
	private Object delete(HttpServletRequest request) {
		DtoPackaging dtoPackaging = null;
		int logId = Integer.parseInt(request.getParameter("logId"));
		int result = serviceTravelLog.delete(logId);
		if (result <= 0) {
			dtoPackaging = new DtoPackaging(false, "旅游日志删除失败。", null);
		} else {
			dtoPackaging = new DtoPackaging(true, "旅游日志已删除", null);
		}
		return dtoPackaging;
	}
}
