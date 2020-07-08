package com.example.function;

import java.util.ArrayList;
import java.util.List;

import com.example.function.test1.Test1;
import com.example.function.test2.Test2;
import com.example.manager.TYPE;



public class FunctionSelector {

	public List<Functional> select(String type) {
		List<Functional> selectedList = new ArrayList<>();

		switch (type) {
		case TYPE.TEST1:
			selectedList.add(new Test1("TEST1 완료"));
			
			break;
		case TYPE.TEST2:
			selectedList.add(new Test2("TEST2 완료"));
			
			break;
			
		default:
			break;
		}

		return selectedList;
	}
}
