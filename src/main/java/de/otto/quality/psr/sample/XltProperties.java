package de.otto.quality.psr.sample;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "xlt")
public class XltProperties {
	private int duration;
	private int rampUp;
	private String host;
	private boolean trackingDisabled;
	private boolean disablResultBrowsers;
	private boolean http2Enabled;
	private String bypassRateLimit;
	private String protocol;
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getRampUp() {
		return rampUp;
	}
	public void setRampUp(int rampUp) {
		this.rampUp = rampUp;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public boolean isTrackingDisabled() {
		return trackingDisabled;
	}
	public void setTrackingDisabled(boolean trackingDisabled) {
		this.trackingDisabled = trackingDisabled;
	}
	public boolean isDisablResultBrowsers() {
		return disablResultBrowsers;
	}
	public void setDisablResultBrowsers(boolean disablResultBrowsers) {
		this.disablResultBrowsers = disablResultBrowsers;
	}
	public boolean isHttp2Enabled() {
		return http2Enabled;
	}
	public void setHttp2Enabled(boolean http2Enabled) {
		this.http2Enabled = http2Enabled;
	}
	public String getBypassRateLimit() {
		return bypassRateLimit;
	}
	public void setBypassRateLimit(String bypassRateLimit) {
		this.bypassRateLimit = bypassRateLimit;
	}
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	
	
}
