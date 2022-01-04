package com.sba4.MyHelloWorld.entity;

public class Hello {
	private String hello;
	
	public Hello() {}

	public Hello(String hello) {
		super();
		this.hello = hello;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	@Override
	public String toString() {
		return "Hello [hello=" + hello + "]";
	}
	
}
