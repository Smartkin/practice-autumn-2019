package lesson04.part01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. Введи с клавиатуры 10 слов в список строк.
 * 2. Метод doubleValues должен удваивать слова по принципу:
 * "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
 * 3. Выведи результат на экран, каждое значение с новой строки.
 *
 * Требования:
 * 1.	Проинициализируй переменную типа список строк.
 * 2.	Считай 10 строк с клавиатуры и добавь их в список.
 * 3.	Метод doubleValues должен удваивать элементы списка
 * по принципу "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма".
 * 4.	Выведи получившийся список на экран, каждый элемент с новой строки.
 */

public class Task14 {
  public static void main(String[] args) throws Exception {
    // Считать строки с консоли и объявить ArrayList list тут
    ArrayList<String> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < 10; ++i){
      list.add(scanner.nextLine());
    }

    ArrayList<String> result = doubleValues(list);

    // Вывести на экран result
    result.forEach(System.out::println);
  }

  public static ArrayList<String> doubleValues(ArrayList<String> list) {
    //напишите тут ваш код
    for(int i = list.size()-1; i >= 0; --i){
      list.add(i, list.get(i));
    }
    return list;
  }
}