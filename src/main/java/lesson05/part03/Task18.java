package lesson05.part03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Чтение файла
 * 1. Считать с консоли имя файла.
 * 2. Вывести в консоль(на экран) содержимое файла.
 * 3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна считывать c консоли имя файла.
 * 2. Программа должна выводить на экран содержимое файла.
 * 3. Поток чтения из файла (FileInputStream) должен быть закрыт.
 * 4. BufferedReader также должен быть закрыт.
 */

public class Task18 {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(scanner.nextLine());
            int b = 0;
            while((b = fis.read()) != -1){
                System.out.print((char)b);
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}