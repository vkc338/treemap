package com.cjc.app.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CheckTreemap 

{
	public static void main(String[] args) {
		
	
	TreeMap map= new TreeMap();
	map.put(3, 2);
	map.put(2, 3);
	map.put(1, 1);
	Set set=map.entrySet();
	Iterator itr=set.iterator();
	while(itr.hasNext())
	{
		Map.Entry m=(Map.Entry)itr.next();
		System.out.println(m.getKey()+"  "+m.getValue());
		
		
	}
}}
