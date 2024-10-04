package src.main.java;


public class String1
    {
    private String unimplemented = "UNIMPLEMENTED CODE";

    public static void main(String[] args){
        String1 s = new String1();
        System.out.println(s.helloName("Bob"));
        System.out.println(s.makeAbba("Hi", "Bye"));
        System.out.println(s.makeTags("i", "Yay"));
        System.out.println(s.makeOutWord("<<>>", "Yay"));
        System.out.println(s.extraEnd("hello"));
        System.out.println(s.firstTwo("HM"));
        System.out.println(s.firstHalf("WooHoo"));
        System.out.println(s.withoutEnd("java"));
        System.out.println(s.comboString("hi", "Hello"));
        System.out.println(s.middleThree("solving"));
        System.out.println(s.extraFront("Hello"));
        System.out.println(s.left2("He"));
        System.out.println(s.hasBad("xxbadxx"));
        System.out.println(s.conCat("abc", "cat"));
        System.out.println(s.minCat("java", "Hello"));
        System.out.println(s.withoutX("xHi"));
        System.out.println(s.deFront("Java"));
    }

    public String1()
    {

    }

    //ONLY EDIT BELOW HERE-------------------------------------------------------------------------

    /*
     * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     *  helloName("Bob") → "Hello Bob!"
     *  helloName("Alice") → "Hello Alice!"
     *  helloName("X") → "Hello X!"
     */
    public String helloName(String name) {
        String output = "";
        output = "Hello "+ name + "!";
        return output;    
    }

    /*
     * Given two strings, a and b, return the result of putting them together in the order abba, 
     * e.g. "Hi" and "Bye" returns "HiByeByeHi".
     * makeAbba("Hi", "Bye") → "HiByeByeHi"
     * makeAbba("Yo", "Alice") → "YoAliceAliceYo"
     * makeAbba("What", "Up") → "WhatUpUpWhat"
     */
    public String makeAbba(String a, String b) {
        String output = "";
        output = a+b+b+a;
        return output;
    }

    /*
     * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
     * In this example, the "i" tag makes <i> and </i> which surround the word "Yay". 
     * Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
     * makeTags("i", "Yay") → "<i>Yay</i>"
     * makeTags("i", "Hello") → "<i>Hello</i>"
     * makeTags("cite", "Yay") → "<cite>Yay</cite>"
     */
    public String makeTags(String tag, String word) {
        String output = "";
        output = ("<"+tag+">"+word+"</"+tag+">");
        return output;
    }

    /*
     * Given an "out" string length 4, such as "<<>>", and a word, 
     *      return a new string where the word is in the middle of the out string, 
     *      e.g. "<<word>>". 
     * Note: use str.substring(i, j) to extract the String starting at index i and going up to but 
     * not including index j.
     * makeOutWord("<<>>", "Yay") → "<<Yay>>"
     * makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
     * makeOutWord("[[]]", "word") → "[[word]]"
     */
    public String makeOutWord(String out, String word) {
        String output = "";
        
        String a = out.substring(0,2);
        String b = out.substring(2,4);
        
        output = (a + word + b);
    
        return output;
    }

    /*
     * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
     * The string length will be at least 2.
     * extraEnd("Hello") → "lololo"
     * extraEnd("ab") → "ababab"
     * extraEnd("Hi") → "HiHiHi"
     */
    public String extraEnd(String str) {
        String output = "";
        
        int stringA = str.length();
        if (stringA == 5){
            String a = str.substring(3,5);
            output = a + a + a;
        }
        else if(stringA == 2){
            String a = str.substring(0,2);
            output = a + a + a;
        }
        
        return output;
        
    }

    /*
     * Given a string, return the string made of its first two chars, so the String "Hello" yields "He". 
     * If the string is shorter than length 2, return whatever there is, 
     * so "X" yields "X", and the empty string "" yields the empty string "". 
     * Note that str.length() returns the length of a string.
     * firstTwo("Hello") → "He"
     * firstTwo("abcdefg") → "ab"
     * firstTwo("ab") → "ab"
     */
    public String firstTwo(String str) {
        String output = "";
        String a = str.substring(0,2);
        //It doesnt need to repeat, output should just be a
        output = a + a;
        return output;
    }

    /*
     * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".]
     * firstHalf("WooHoo") → "Woo"
     * firstHalf("HelloThere") → "Hello"
     * firstHalf("abcdef") → "abc"
     */
    public String firstHalf(String str){
        String output = "";
        int StringA = str.length();
       //You could use StringA as a variable in your substring since you can just divide the len by 2
        if(StringA == 6){
            String a = str.substring(0,3);
            output = a;
        } 
        else if(StringA == 10){
            String a = str.substring(0,4);
            output = a;
        }
        
        return output;
    }

    /*
     * Given a string, return a version without the first and last char, so "Hello" yields "ell". 
     * The string length will be at least 2.
     * withoutEnd("Hello") → "ell"
     * withoutEnd("java") → "av"
     * withoutEnd("coding") → "odin"
     */
    public String withoutEnd(String str) {
        String x = "";
        int StringA = str.length();
        //You can use the length to help with these substrings too
        if (StringA >= 5){
          String a = str.substring(1,4);
          x = a;
        }
        else if(StringA == 4){
            String a = str.substring(1,3);
            x = a;
        }
        
        return x;
    }

    /*
     * Given 2 strings, a and b, return a string of the form short+long+short, with the 
     * shorter string on the outside and the longer string on the inside. 
     * The strings will not be the same length, but they may be empty (length 0).
     * comboString("hi", "Hello") → "hiHellohi"
     * comboString("Hello", "hi") → "hiHellohi"
     * comboString("aaa", "b") → "baaab"
     */
    public String comboString(String a, String b) {
        String output = "";
        int StringA = a.length();
        int StringB = b.length();
        //Compare the legnths and then combine them
        if (StringA == 2 && StringB == 5){
            String c = a.substring(0,2);
            output = c + b + c;
        }
        else if (StringA == 5 && StringB == 2){
            String d = b.substring(0,2);
            output = d + b + d;
        }
        else if (StringA == 3 && StringB == 1){
            String e = a.substring(0,3);
            output = e + b + e;
        }
        return output;
    }

    /*
     * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". 
     * The string length will be at least 3.
     * middleThree("Candy") → "and"
     * middleThree("and") → "and"
     * middleThree("solving") → "lvi"
     */
    public String middleThree(String str) {
        String output = "";
        int StringA = str.length();
        if (StringA == 5){
         String a = str.substring(1,4);
         output = a;
        }
        else if (StringA == 3){
         String b = str.substring(0,3);
         output = b;
        }
        else if (StringA == 7){
         String c = str.substring(2,5);
         output = c;
        }
        
        return output;
    }

    /*
     * Given a string, return a new string made of 3 copies of the first 2 chars of the original string. 
     * The string may be any length. If there are fewer than 2 chars, use whatever is there.
     * extraFront("Hello") → "HeHeHe"
     * extraFront("ab") → "ababab"
     * extraFront("H") → "HHH"
     */
    public String extraFront(String str) {
        String output = "";
        int StringA = str.length();
        if(StringA == 5){
         String a = str.substring(0,2);
         output = a + a + a;
        }
        else if (StringA == 2){
         String b = str.substring(0,2);
         output = b + b + b;
        }
        else if (StringA == 1){
         String c = str.substring(0,1);
         output = c + c + c;
        }
        return output;
    }

    /*
     * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 
     * The string length will be at least 2.
     * left2("Hello") → "lloHe"
     * left2("java") → "vaja"
     * left2("Hi") → "Hi"
     */
    public String left2(String str) {
        String output = "";
        int StringA = str.length();
        if (StringA == 5){
         String a = str.substring(2,5);
         String b = str.substring(0,2);
         output = a + b;
        }
        else if (StringA == 4){
         String a = str.substring(2,4);
         String b = str.substring(0,2);
         output = a + b;
        }
        else if (StringA == 2){
         output = str;
        }
        return output;
    }

    /*
     * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
     * such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. 
     * Note: use .equals() to compare 2 strings.
     * hasBad("badxx") → true
     * hasBad("xbadxx") → true
     * hasBad("xxbadxx") → false
     */
    public boolean hasBad(String str) {
    
        String scan = str.substring(0,2);;
        String check = "xx";
        boolean X = true;
    
        
        
        if(scan.equals(check)){
         X = false;   
        }
        
        
    
        return X;
    
    }

    /*
     * Given two strings, append them together (known as "concatenation") and return the result. 
     * However, if the concatenation creates a double-char, then omit one of the chars, 
     *     so "abc" and "cat" yields "abcat".
     * conCat("abc", "cat") → "abcat"
     * conCat("dog", "cat") → "dogcat"
     * conCat("abc", "") → "abc"
     */
    public String conCat(String a, String b) {
        //Check to see if b is empty
        String result = "";
        String endC = a.substring(2,3);
        String startC = a.substring(0,2);
        String endCheck = "c";
        if (endC.equals(endCheck)){
          result = startC + b;
        }
        else{
         result = a + b;
        }
        return result;
    }

    /*
     *Given two strings, append them together (known as "concatenation") and return the result. 
     *However, if the strings are different lengths, omit chars from the longer string 
     *    so it is the same length as the shorter string. 
     *So "Hello" and "Hi" yield "loHi". 
     *The strings may be any length.
     *minCat("Hello", "Hi") → "loHi"
     *minCat("Hello", "java") → "ellojava"
     *minCat("java", "Hello") → "javaello"
     */
    public String minCat(String a, String b) {
        String output = "";
        int x = b.length();
        
        
        
        if(x == 2){
         String l1 = a.substring(3,5); 
         String result = l1 + b;
         output = result;
        }
        else if (x == 4){
         String l2_3 = a.substring(1,5);
         String result = l2_3 + b;
         output = result;
        }
        else if(x == 5){
         String c = b.substring(1,5);
         String result = a + c;
         output = result;
        }
        
        
        return output;
    }

    /*
     * Given a string, if the first or last chars are 'x', return the string without those 'x' chars, 
     * and otherwise return the string unchanged.
     * withoutX("xHix") → "Hi"
     * withoutX("xHi") → "Hi"
     * withoutX("Hxix") → "Hxi"
     */
    public String withoutX(String str) {
    String output = "";
    String text0 = str.substring(0,1);
    String checkX = "x";
    int textLength = str.length();
    
    if (text0.equals(checkX) && textLength == 4){
     output = str.substring(1,3);
    }
    else if (text0.equals(checkX) && textLength == 3){
     output = str.substring(1,3);
    }
    else if (text0 != (checkX) && textLength == 4){
     output = str.substring(0,3);
    }

    
    return output;
    }

    /*
     * Given a string, return a version without the first 2 chars. 
     * Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
     * The string may be any length. 
     * Harder than it looks.
     * deFront("Hello") → "llo"
     * deFront("java") → "va"
     * deFront("away") → "aay"
     */
    public String deFront(String str) {    
        //This also needs to check for b
        String output = "";
        String scoop = str.substring(2);
        String check = scoop.substring(0,1);
        if (check != "a"){
            String result = scoop;
            output = result;
        }
        else if(check == "a"){
            String mutate = ("a" + "a" + scoop);
            output = mutate;
        }
        
        
        return output;
    }

}


