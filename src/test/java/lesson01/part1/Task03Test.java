package lesson01.part1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import util.SystemOutGatewayUtil;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class Task03Test {

    @Test
    public void main() {
        SystemOutGatewayUtil.setCustomOut();
        Task03.main(null);
        ByteArrayOutputStream outputStream = SystemOutGatewayUtil.getOutputArray();
        String cleanStr = outputStream.toString().replaceAll("\r", "").replaceAll("\n", "");
        int year = Integer.parseInt(cleanStr);
        assertTrue(year % 1000 != 0);
        assertTrue(year/100 == 19);
        assertTrue(year == (2019 - 98));
    }
}