package com.sample.domain.enums;

public enum CollectionMode {

	MANUAL("MANUAL", 0), AUTO("AUTO", 1);

	private int value;

	private String code;

	CollectionMode(String code, int value) {
		this.value = value;
		this.setCode(code);
	}

	CollectionMode(int value) {
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