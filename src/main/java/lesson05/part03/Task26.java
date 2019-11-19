package lesson05.part03;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Сортировка четных чисел из файла
 * 1. Ввести имя файла с консоли.
 * 2. Прочитать из него набор чисел.
 * 3. Вывести на консоль только четные, отсортированные по возрастанию.
 * <p>
 * Пример ввода:
 * 5
 * 8
 * -2
 * 11
 * 3
 * -5
 * 2
 * 10
 * <p>
 * Пример вывода:
 * -2
 * 2
 * 8
 * 10
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна считывать данные с консоли.
 * 2. Программа должна создавать FileInputStream для введенной с консоли строки.
 * 3. Программа должна выводить данные на экран.
 * 4. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
 * 5. Программа должна закрывать поток чтения из файла(FileInputStream).
 */

public class Task26 {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        FileInputStream fis = new FileInputStream(scanner.nextLine());
        BufferedReader br = new BufferedReader(new FileReader(fis.getFD()));
        int num = Integer.parseInt(br.readLine());
        ArrayList<Integer> numList = new ArrayList<>();
        String line;
        while((line = br.readLine()) != null){
            num = Integer.parseInt(line);
            if (num % 2 == 0) numList.add(num);
        }
        numList.sort(Comparator.comparingInt(n -> n));
        numList.forEach(System.out::println);
    }
}
