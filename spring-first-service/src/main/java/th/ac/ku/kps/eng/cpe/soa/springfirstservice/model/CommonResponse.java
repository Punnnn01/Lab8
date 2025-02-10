package th.ac.ku.kps.eng.cpe.soa.springfirstservice.model;

public class CommonResponse<T> {
	private String status;
	private T result;
	private String msg;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String message) {
		this.msg = message;
	}
	
	
	public CommonResponse() {
		
	}
	
}
