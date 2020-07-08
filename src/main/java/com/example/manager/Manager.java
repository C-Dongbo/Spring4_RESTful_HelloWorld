package com.example.manager;

import java.util.List;

import com.example.function.FunctionSelector;
import com.example.function.Functional;
import com.example.models.Request;
import com.example.models.Result;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Manager {
	private Manager() {
		selector = new FunctionSelector();
	}	
	
	public static Manager getInstance() {
		return LazyHolder.INSTANCE;
	}

	private static class LazyHolder {
		public static final Manager INSTANCE = new Manager();
	}	
	private FunctionSelector selector;
	
	public String work(Request re, String type) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Result result = new Result();
		
		List<Functional> functionList = selector.select(type);
		for(Functional functional : functionList) {
			result = functional.work(re);
		}
		return gson.toJson(result);
	}
}
