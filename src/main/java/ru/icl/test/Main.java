package ru.icl.test;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		String line;
		int num;			 
		//System.out.print("Укажите путь к файлу (например, ./src/main/resources/first.txt): ");
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//File file = new File(reader.readLine());
		File file = new File("./first.txt");
		if (!file.exists()) {
			System.out.println("\nФайл не найден");
			return;
		}
		System.out.println("Фильтр №1 - на экране печатаются только те строки файла где нету слова Путин");
		System.out.println("Фильтр №2 - на экране печатаются только те строки файла где есть слова Путин, но нет слома Медведев");
		System.out.print("Введите номер фильтра: ");
		num = System.in.read();
		Factory factory = new Factory();
		Filter filter = factory.getFilter(num);
		try (BufferedReader filer = new BufferedReader(new FileReader(file))) {
			line = filer.readLine();
			while(line != null) {
				if (filter.accept(line)) 
					System.out.println(line);
				line = filer.readLine();
            }
        }
    }

}
