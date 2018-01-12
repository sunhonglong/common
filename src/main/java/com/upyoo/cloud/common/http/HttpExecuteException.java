package com.upyoo.cloud.common.http;

public class HttpExecuteException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String code;
	private String msg;

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public HttpExecuteException() {
		super();
	}
	public HttpExecuteException(String msg) {
		super(msg);
	}
	public HttpExecuteException(String code, String msg) {
		super(msg);
		this.code = code;
		this.msg = msg;

	}
}
