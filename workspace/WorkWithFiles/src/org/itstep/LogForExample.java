package org.itstep;

public class LogForExample {
	
	private long connectionId;
	private long connectionTime;
	private String connectorIp;  // 192.168.0.1
	private int specId;
		
	public long getConnectionId() {
		return connectionId;
	}
	public void setConnectionId(long connectionId) {
		this.connectionId = connectionId;
	}
	public long getConnectionTime() {
		return connectionTime;
	}
	public void setConnectionTime(long connectionTime) {
		this.connectionTime = connectionTime;
	}
	public String getConnectorIp() {
		return connectorIp;
	}
	public void setConnectorIp(String connectorIp) {
		this.connectorIp = connectorIp;
	}
	public int getSpecId() {
		return specId;
	}
	public void setSpecId(int specId) {
		this.specId = specId;
	}
	
	public LogForExample(long connectionId, long connectionTime, String connectorIp, int specId) {
		this.connectionId = connectionId;
		this.connectionTime = connectionTime;
		this.connectorIp = connectorIp;
		this.specId = specId;
	}
	
	public LogForExample(){
		
	}

}


