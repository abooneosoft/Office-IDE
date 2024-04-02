package org.driverwrks;

public interface WebDriver {

	public default String quit() {
	return "driver to quit";
	}
	public default String close() {
	return "driver to close";
	}
	public default String webDriver() {
		return "WebELementsss";
		}
	public default int sum(int a, int b) {
		int c =  a +  b;
		return c;
		}
}
