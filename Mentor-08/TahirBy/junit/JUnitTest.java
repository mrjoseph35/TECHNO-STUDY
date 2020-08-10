package Mentor.TahirBy.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;

public class JUnitTest {
    //Assert.assertEquals

    @Test    //JUnit Kütüphanesinde Test methodunu kullaniyoruz
    public void testLastChar(){

        Main m = new Main();
      char result =  m.lastCharacter("Junit");  // char cevabini sonuc result esitledik
      char dogruCevap='t';

        Assert.assertEquals(dogruCevap,result);
        Assert.assertEquals(m.lastCharacter("Junit"),'t');
    }

    @Test
    public void testMaxNumberArray(){
        Main m= new Main();
        int[] Array = {20,15,6,9,8};
        int result = m.maxNumberArray(Array);  // result = sonuc;
        int expected = 20;  // expected = beklenen sonuc ;

        Assert.assertEquals("Methodun Hatali",expected,result);

    }
    @Test
    public void testFaktoriyelBul(){
        Main m = new Main();
        int result = m.faktoriyelBul(5);
        int expected = 120;

        Assert.assertEquals(expected,result);
    }
    @Test
    public void testDeneme1(){
        String s1= "Java";
        String s2 = "Java";
        boolean b = s1.equals(s2);

        Assert.assertTrue(b);  // sonuc True ise dogru sonuc verir

    }

    // true&& true=true;
    // true&& false=false;
    // false&& true=false;
    // false&& false=false;

    // true || true=true;
    // true|| false=true;
    // false|| true=true;
    // false || false=false;

    @Test
    public void testDeneme2(){
        String s1= "Java";
        String s2 = "Java";
        boolean b1 = true && false;

        Assert.assertFalse(b1);      // sonuc False ise dogru sonuc veriri
      //  Assert.assertTrue(b1);    // b1 cevabi false oldugu icin True mu diye sorduk false cikti.
        //  Testi gecemedi

    }
}
