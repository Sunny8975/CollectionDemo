package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Sunny");
		list.add("Rajigare");
		list.add("Pune");
		//System.out.println(list);
		for(String i : list) {
			System.out.println(i);
		}
	}
}
