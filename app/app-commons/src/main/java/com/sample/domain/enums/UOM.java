package com.sample.domain.enums;

public enum UOM {

	MORNING("KG", 0), EVENING("LTR", 1);

	private int value;

	private String code;

	UOM(String code, int value) {
		this.value = value;
		this.setCode(code);
	}

	UOM(int value) {
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
