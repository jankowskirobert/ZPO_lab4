/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zpo_lab4;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/**
 *
 * @author init0
 */
public class ZPO_LAB4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }

    public static void sortStrings(Collator collator, String[] words) {
        String tempStr;

        for (int t = 0; t < words.length - 1; t++) {
            for (int i = 0; i < words.length - t - 1; i++) {
                if (collator.compare(words[i + 1], (words[i])) < 0) {
                    tempStr = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = tempStr;
                }
            }
        }
        

    }

    public static void fastSortStrings(Collator collator, String[] words) {
        Arrays.sort(words, new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                 return collator.compare(o1, o2);
            }
            
        });
    }

    public static void fastSortStrings2(Collator collator, String[] words) {
                Arrays.sort(words, (String o1, String o2) -> collator.compare(o1,o2));
    }

}
