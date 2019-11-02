package lesson01.part1;

import org.junit.Test;
import util.SystemOutGatewayUtil;

import java.io.*;
import java.util.Arrays;

import static org.junit.Assert.*;

public class Task04Test {

    @Test
    public void main() {
        try{
            BufferedReader br = new BufferedReader(new FileReader("D:\\Programming\\GitHub-repos\\practice-autumn-2019\\src\\main\\java\\lesson01\\part1\\Task04.java"));
            SystemOutGatewayUtil.setCustomOut();
            Task04.main(null);
            ByteArrayOutputStream outputStream = SystemOutGatewayUtil.getOutputArray();
            String[] answers = outputStream.toString().replaceAll("\r","").split("\n");
            int numLines = 0;
            int numSlashes = 0;
            String str;
            while((str = br.readLine()) != null){
                numLines++;
                while(str.matches(".*/.*")){
                    numSlashes++;
                    str = str.replaceFirst("/", "");
                }
            }
            assertEquals(33, numLines);
            assertTrue(numSlashes == 16);
            assertTrue(answers[0].equals("26"));
            assertTrue(answers[1].equals("25"));
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

    }
}