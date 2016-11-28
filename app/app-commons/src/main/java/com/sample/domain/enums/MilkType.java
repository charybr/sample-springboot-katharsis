package com.sample.domain.enums;

public enum MilkType {

	COW("COW", 0), BUFFALO("BUFFALO", 1), MIXED("MIXED", 2);

	private int value;

	private String code;

	MilkType(String code, int value) {
		this.value = value;
		this.setCode(code);
	}

	MilkType(int value) {
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
