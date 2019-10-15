package lesson01.part1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import util.SystemOutGatewayUtil;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class Task02Test {

    @Test
    public void main() {
        SystemOutGatewayUtil.setCustomOut();
        Task02.main(null);
        ByteArrayOutputStream outputStream = SystemOutGatewayUtil.getOutputArray();
        String cleanStr = outputStream.toString().replaceAll("\r", "");
        assertTrue(cleanStr.equals("Hello World!\nHello World!\nHello World!\n"));
    }
}