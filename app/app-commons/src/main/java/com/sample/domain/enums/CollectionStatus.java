package com.sample.domain.enums;

public enum CollectionStatus {

	ACCEPTED("ACCEPTED", 0), REJECTED("REJECTED", 1);

	private int value;

	private String code;

	CollectionStatus(String code, int value) {
		this.value = value;
		this.setCode(code);
	}

	CollectionStatus(int value) {
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