package com.lzf.web;

/**
 * 数据传输对象的实体包装类
 * 
 * @author MJCoder
 */
public class DtoPackaging {
	/**
	 * 是否成功标志
	 */
	private boolean success;
	/**
	 * 返回的详细信息描述
	 */
	private String describe;
	/**
	 * 成功时返回的数据
	 */
	private Object data;

	/**
	 * 数据传输对象的实体包装类的有参构造方法
	 * 
	 * @param success
	 *            是否成功标志
	 * @param describe
	 *            返回的详细信息描述
	 * @param data
	 *            成功时返回的数据
	 */
	public DtoPackaging(boolean success, String describe, Object data) {
		this.success = success;
		this.describe = describe;
		this.data = data;
	}

	/**
	 * 是否成功
	 * 
	 * @return 是否成功标志（true：该请求响应成功）
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * 设置是否成功
	 * 
	 * @param success
	 *            是否成功标志（true：该请求响应成功）
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * 获取详细信息描述
	 * 
	 * @return 详细信息描述
	 */
	public String getDescribe() {
		return describe;
	}

	/**
	 * 设置详细信息描述
	 * 
	 * @param describe
	 *            详细信息描述
	 */
	public void setDescribe(String describe) {
		this.describe = describe;
	}

	/**
	 * 获取数据
	 * 
	 * @return 成功时返回的数据；否则为null。
	 */
	public Object getData() {
		return data;
	}

	/**
	 * 设置数据
	 * 
	 * @param data
	 *            成功时返回的数据；否则为null。
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * 返回对象的字符串表示形式。 通常，{@code toString}方法返回一个“文本表示”此对象的字符串。 结果应该是一个简洁但信息丰富的表示，便于人们阅读。
	 * 
	 * @return 对象的字符串表示
	 */
	@Override
	public String toString() {
		return "DtoPackaging [success=" + success + ", describe=" + describe + ", data=" + data + "]";
	}

}
