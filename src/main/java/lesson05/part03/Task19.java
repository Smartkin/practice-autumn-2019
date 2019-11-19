package lesson05.part03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Писатель в файл с консоли
 * 1. Прочесть с консоли имя файла.
 * 2. Считывать строки с консоли, пока пользователь не введет строку "exit".
 * 3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна считывать c консоли имя файла.
 * 2. Создай и используй объект типа BufferedWriter.
 * 3. Программа не должна ничего читать из файловой системы.
 * 4. Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
 * 5. Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
 * 6. Метод main должен закрывать объект типа BufferedWriter после использования.
 * 7. Метод main не должен выводить данные на экран.
 */

public class Task19 {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        FileWriter fileWriter = new FileWriter(scanner.nextLine());
        BufferedWriter writer = new BufferedWriter(fileWriter);
        String line = "";
        while(!(line = scanner.nextLine()).equals("exit")){
            writer.write(line);
            writer.write("\n");
        }

        writer.close();
        fileWriter.close();
    }
}
