package lesson04.part02;

import java.util.HashMap;
import java.util.Map;

/**
 * Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
 * Удалить из словаря всех людей, у которых зарплата ниже 500.
 * <p>
 * Требования:
 * 1.	Программа не должна выводить текст на экран.
 * 2.	Программа не должна считывать значения с клавиатуры.
 * 3.	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
 * 4.	Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
 */

public class Task34 {

  public static Map<String, Integer> createMap() {
    //напишите тут ваш код
    Map<String, Integer> map = new HashMap<>();
    for(int i = 0; i < 10; ++i){
      map.put("Surname_"+i, 100 + i * 100);
    }
    return map;
  }

  public static void removeItemFromMap(Map<String, Integer> map) {
    //напишите тут ваш код
    Map<String, Integer> mapCopy = new HashMap<>(map);
    for (Map.Entry<String, Integer> pair :
            mapCopy.entrySet()) {
      if (pair.getValue() < 500){
        map.remove(pair.getKey());
      }
    }
  }

  public static void main(String[] args) {
    Map<String, Integer> map = createMap();
    removeItemFromMap(map);
  }
}
