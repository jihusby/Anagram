/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package no.husby.anagram;

import junit.framework.TestCase;

/**
 *
 * @author jihusby
 */
public class AnagramTest extends TestCase {
    
    public AnagramTest(String testName) {
        super(testName);
    }
    
    public void testEmptyAnagram() throws Exception {
        Anagram a = new Anagram();
        assertEquals("", a.getAnagram(""));
    }
    
    public void testOneCharAnagram() throws Exception {
        Anagram a = new Anagram();
        String input = "a";
        assertEquals(input, a.getAnagram(input));
    }
    
}
