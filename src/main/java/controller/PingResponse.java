package controller;

public class PingResponse {

	boolean success;
	String message;
	long responseTime;
	String target;

	public PingResponse(String target) {
		this.target = target;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(long responseTime) {
		this.responseTime = responseTime;
	}

	public String getTarget() {
		return target;
	}
	
	@Override
	public String toString() {
		return "PingResponse [success=" + success + ", message=" + message
				+ ", responseTime=" + responseTime + "]";
	}

}
