package com.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MapStream {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		Collections.addAll(list, "apple", "banana","orange");
		
		List<String>result= list.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(result);
	}

}
