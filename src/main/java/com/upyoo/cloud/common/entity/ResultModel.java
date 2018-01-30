package com.upyoo.cloud.common.entity;

import java.io.Serializable;

public class ResultModel implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final int CODE_SUCCESS = 0;
	public static final String RESULT_SUCCESS = "success";
	public static final String RESULT_FAIL = "fail";

	private int code = CODE_SUCCESS;
	private Object data;
	private String message;
	private String result = RESULT_SUCCESS;

	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	private ResultModel() {
	}
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public static ResultModel createSuccess() {
		ResultModel result = new ResultModel();
		return result;
	}

	public static ResultModel createSuccess(Object data) {
		ResultModel result = ResultModel.createSuccess();
		result.setData(data);
		return result;
	}

	public static ResultModel createFail(int code) {
		ResultModel result = new ResultModel();
		result.setResult(RESULT_FAIL);
		result.setCode(code);
		return result;
	}

	public static ResultModel createFail(int code, String message) {
		ResultModel result = ResultModel.createFail(code);
		result.setMessage(message);
		return result;
	}

}
