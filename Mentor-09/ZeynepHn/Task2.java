package Mentor.ZeynepHn;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

public class Task2 {
    /*
    // LocalTime kullanarak ve test ortaminda
    //1. mevcut saate arti dakika ve saat ekleyiniz
    //2. mevcut saatten eksi dakika ve saat cikariniz
     */
    @Test
    public void testPlus() {
        LocalTime time = LocalTime.of(5, 45);
        LocalTime plus = time.plusHours(1).plusMinutes(10);

        Assert.assertEquals(6, plus.getHour());
        Assert.assertEquals(55, plus.getMinute());

    }

    @Test
    public void testMinus() {
        LocalTime time = LocalTime.of(10, 40);
        LocalTime minus = time.minusHours(2).minusMinutes(5);

        Assert.assertEquals(8, minus.getHour());
        Assert.assertEquals(35, minus.getMinute());


    }


}
