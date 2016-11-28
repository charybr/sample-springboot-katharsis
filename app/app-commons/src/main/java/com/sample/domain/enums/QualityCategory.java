package com.sample.domain.enums;

public enum QualityCategory {

	GOOD("GOOD", 0), SOUR("SOUR", 1), CURDLED("CURDLED", 2);
	
	private int value;

	private String code;

	QualityCategory(String code, int value) {
		this.value = value;
		this.setCode(code);
	}

	QualityCategory(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String toString() {
		return this.code;
	}
}
