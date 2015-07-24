package ru.icl.test;

import org.apache.commons.lang3.StringUtils; 

public class MyFilter2 implements Filter {

	public Boolean accept(String line) {
		//на экране печатаются только те строки где есть слова Путин, но нет слова Медведев
		if ((line != null) && 
				(StringUtils.contains(line, "Путин") && 
						(!StringUtils.contains(line, "Медведев")))) return true;
		else return false;
	}
	
}