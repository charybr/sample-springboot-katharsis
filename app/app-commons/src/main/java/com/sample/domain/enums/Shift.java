package com.sample.domain.enums;

public enum Shift {
	
	MORNING("MORNING", 0), EVENING("EVENING", 1);

	private int value;

	private String code;

	Shift(String code, int value) {
		this.setCode(code);
		this.value = value;
	}

	Shift(int value) {
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
