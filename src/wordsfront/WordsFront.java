/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsfront;

import java.util.Arrays;

/**
 *
 * @author Lucas
 */
public class WordsFront {

    public static String[] wordsFront( String[] words, int n )
    {
        String[] result = new String[n];

        for ( int i = 0; i < n; i++ )
        {
            result[i] = words[i];
        }

        return result;
    }
    
    public static void main(String[] args) {
       String words[] = { "a", "b", "c", "d" };
       System.out.println(Arrays.toString(wordsFront(words, 3)));
    }
    
}
