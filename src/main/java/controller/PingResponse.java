package controller;

public class PingResponse {

	private boolean success;
	private String message;
	private long responseTime;
	private String target;
	private int pingCount;

	public PingResponse(String target) {
		this.target = target;
		pingCount = 1;
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

	public int getPingCount() {
		return pingCount;
	}

	public void setPingCount(int pingCount) {
		this.pingCount = pingCount;
	}

}
