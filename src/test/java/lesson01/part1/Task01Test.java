package lesson01.part1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import util.SystemOutGatewayUtil;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class Task01Test {

    @Test
    public void Test01(){
        SystemOutGatewayUtil.setCustomOut();
        Task01.main(null);
        ByteArrayOutputStream outputStream = SystemOutGatewayUtil.getOutputArray();
        String cleanStr = outputStream.toString().replaceAll("\r", "");
        assertTrue(cleanStr.equals("Hello World!\n"));
    }

}