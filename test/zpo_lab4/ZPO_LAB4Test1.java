/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zpo_lab4;

import java.text.Collator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author init0
 */
public class ZPO_LAB4Test1 {

    public ZPO_LAB4Test1() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of sortStrings method, of class ZPO_LAB4.
     */
    @Test
    public void testSortStrings() {
        long timeBefore = System.nanoTime();
        for (int i = 0; i < 100000; i++) {

            Locale locale = Locale.getDefault();
            Collator collator = Collator.getInstance(new Locale("pl", "PL"));
            String[] words = {"Łukasz", "Ścibor", "Stefania", "Bolek", "Agnieszka",
                "Zyta", "Órszula"};
            ZPO_LAB4.sortStrings(collator, words);

            String[] words_sorted = {"Agnieszka", "Bolek", "Łukasz", "Órszula", "Stefania",
                "Ścibor", "Zyta"};
            Assert.assertArrayEquals(words_sorted, words);
        }
        long timeAfter = System.nanoTime();
        System.out.println(TimeUnit.MILLISECONDS.convert(timeAfter-timeBefore, TimeUnit.NANOSECONDS)
        );
    }

    /**
     * Test of fastSortStrings method, of class ZPO_LAB4.
     */
    @Test
    public void testFastSortStrings() {
        long timeBefore = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            Locale locale = Locale.getDefault();
            Collator collator = Collator.getInstance(new Locale("pl", "PL"));
            String[] words = {"Łukasz", "Ścibor", "Stefania", "Bolek", "Agnieszka",
                "Zyta", "Órszula"};

            ZPO_LAB4.fastSortStrings(collator, words);

            String[] words_sorted = {"Agnieszka", "Bolek", "Łukasz", "Órszula", "Stefania",
                "Ścibor", "Zyta"};
            Assert.assertArrayEquals(words_sorted, words);
        }
        long timeAfter = System.nanoTime();
        System.out.println(TimeUnit.MILLISECONDS.convert(timeAfter-timeBefore, TimeUnit.NANOSECONDS)
        );
    }

    /**
     * Test of fastSortStrings2 method, of class ZPO_LAB4.
     */
    @Test
    public void testFastSortStrings2() {
        long timeBefore = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            Locale locale = Locale.getDefault();
            Collator collator = Collator.getInstance(new Locale("pl", "PL"));
            String[] words = {"Łukasz", "Ścibor", "Stefania", "Bolek", "Agnieszka",
                "Zyta", "Órszula"};

            ZPO_LAB4.fastSortStrings2(collator, words);

            String[] words_sorted = {"Agnieszka", "Bolek", "Łukasz", "Órszula", "Stefania",
                "Ścibor", "Zyta"};
            Assert.assertArrayEquals(words_sorted, words);
        }
        long timeAfter = System.nanoTime();
        System.out.println(TimeUnit.MILLISECONDS.convert(timeAfter-timeBefore, TimeUnit.NANOSECONDS)
        );
    }

}
