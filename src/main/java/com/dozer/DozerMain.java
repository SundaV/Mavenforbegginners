package com.dozer;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

public class DozerMain {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// Add the mapping configuration
		list.add("com/dozer/dozerMapping.xml");
		// Add to DozerMapper
		Mapper mapper = new DozerBeanMapper(list);
		mapper.map("c", "b", "a");
	}

}
