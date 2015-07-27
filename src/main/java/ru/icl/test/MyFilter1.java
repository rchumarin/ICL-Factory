package ru.icl.test;

import org.apache.commons.lang3.StringUtils;

public class MyFilter1 implements Filter {

	public Boolean accept(String line) {
		//на экране печатаются только те строки файла где нету слова Путин"
		return (!StringUtils.contains(line, "Путин"));
	}

}
