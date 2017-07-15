package com.common.utilities;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JavaUtilities {

	Log log = LogFactory.getLog(JavaUtilities.class);

	public void printArray(List<String> myList) {
		myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(str -> log.info(str));
	}

	public String[] stringToArray(String array, String splitChar) {
		return array.split(splitChar);
	}

}
