/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zpo_lab4;

import java.text.Collator;
import java.util.Locale;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author init0
 */
public class ZPO_LAB4Test {

    public ZPO_LAB4Test() {
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
        System.out.println("sortStrings");
        Locale locale = Locale.getDefault();
        Collator collator = Collator.getInstance(new Locale("pl", "PL"));
        String[] words = {"Łukasz", "Ścibor", "Stefania", "Bolek", "Agnieszka",
            "Zyta", "Órszula"};
        ZPO_LAB4.sortStrings(collator, words);

        for (String word : words) {
            System.out.println(word);
        }
        String[] words_sorted = {"Agnieszka", "Bolek", "Łukasz", "Órszula", "Stefania",
            "Ścibor", "Zyta"};
        Assert.assertArrayEquals(words_sorted, words);

    }

    /**
     * Test of fastSortStrings method, of class ZPO_LAB4.
     */
    @Test
    public void testFastSortStrings() {
        System.out.println("fastSortStrings");
        Locale locale = Locale.getDefault();
        Collator collator = Collator.getInstance(new Locale("pl", "PL"));
        String[] words = {"Łukasz", "Ścibor", "Stefania", "Bolek", "Agnieszka",
            "Zyta", "Órszula"};

        ZPO_LAB4.fastSortStrings(collator, words);
        for (String word : words) {
            System.out.println(word);
        }
        String[] words_sorted = {"Agnieszka", "Bolek", "Łukasz", "Órszula", "Stefania",
            "Ścibor", "Zyta"};
        Assert.assertArrayEquals(words_sorted, words);

    }

    /**
     * Test of fastSortStrings2 method, of class ZPO_LAB4.
     */
    @Test
    public void testFastSortStrings2() {
        System.out.println("fastSortStrings2");
        Locale locale = Locale.getDefault();
        Collator collator = Collator.getInstance(new Locale("pl", "PL"));
        String[] words = {"Łukasz", "Ścibor", "Stefania", "Bolek", "Agnieszka",
            "Zyta", "Órszula"};

        ZPO_LAB4.fastSortStrings2(collator, words);

        for (String word : words) {
            System.out.println(word);
        }
        String[] words_sorted = {"Agnieszka", "Bolek", "Łukasz", "Órszula", "Stefania",
            "Ścibor", "Zyta"};
        Assert.assertArrayEquals(words_sorted, words);

    }

}
