#!/bin/bash
echo "Пример скрипта"
echo "Компиляция и запуск программы"
javac -d target -sourcepath src/main/java -cp src/main/resources/commons-lang3-3.4.jar src/main/java/ru/icl/test/Main.java
java -cp src/main/resources/commons-lang3-3.4.jar:target ru.icl.test.Main
cd target
echo "Архивирование программы"
jar cfe factory.jar ru.icl.test.Main ru/icl/test/*.class ./first.txt
echo "Проверка"
[ -e "factory.jar" ] && echo "Jar-файл создан. Запуск программы из архива" || echo "Jar-файл НЕ создан"
java -jar factory.jar

