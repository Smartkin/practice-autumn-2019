package lesson05.part02;

/**
 * Свобода печати
 * Написать пять методов print с разными параметрами.
 * <p>
 * <p>
 * Требования:
 * 1. Программа не должна выводить текст на экран.
 * 2. Класс Solution должен содержать шесть методов.
 * 3. Класс Solution должен содержать статический метод main().
 * 4. Класс Solution должен содержать пять статических методов print() с разными параметрами.
 */

public class Task08 {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    public static void print(int num){
        System.out.println(num);
    }

    public static void print(float f){
        System.out.println(f);
    }

    public static void print(double d){
        System.out.println(d);
    }

    public static void print(String s){
        System.out.println(s);
    }

    public static void print(Character c){
        System.out.println(c);
    }
}
