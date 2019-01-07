package cn.tedu.ajax.entity;

import java.io.Serializable;

public class ResponseResult implements Serializable{
	private static final long serialVersionUID = -7454091143601115340L;
	private Integer state;
	private String message;
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ResponseResult [state=" + state + ", message=" + message + "]";
	}
	
	
}
