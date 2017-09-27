package com.tad.arqdevguide.chp3;

import javax.ejb.LocalBean;
import javax.ejb.Remove;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class HelloLocalBean {
	private final String text = "Hello, World!";

	public HelloLocalBean() { }

	public String getText() {
		return text;
	}
	
	@Remove
	public void removeEjb() {
		
	}
}
