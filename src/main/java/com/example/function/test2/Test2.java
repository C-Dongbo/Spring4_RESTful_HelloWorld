package com.example.function.test2;

import com.example.function.Functional;
import com.example.models.Request;
import com.example.models.Result;

public class Test2 implements Functional {

	private String test;
	
	public Test2(String test) {
		super();
		this.test = test;
	}
	
	@Override
	public Result work(Request re) {
		Result result = new Result();
		result.result = re.test + test;
		return result;
	}
	
}
