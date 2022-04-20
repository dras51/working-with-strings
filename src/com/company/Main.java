package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myText = "This is a simple text";

        String text1 = "My name is ";
        String text2 = "John Doe";

        String finalText = text1 + text2;
        System.out.println(finalText);
        
        String text3 = "This is ";
        String text4 = "a test";

        String finalText2 = text3.concat(text4);
        System.out.println(finalText2);

        String text5 = "Text to compare";
        String text6 =  "text to compare";

        System.out.println(text5.equals(text6));
        System.out.println(text5.equalsIgnoreCase(text6));

        System.out.println(text5.length());
        System.out.println(text6.toUpperCase());
        System.out.println(text5.toLowerCase());

        System.out.println(finalText2.indexOf("is"));

        System.out.println(text5.replaceAll("e", "i"));
        System.out.println("Test 1 ");
        System.out.println("Test 2");

//        System.out.print("100.0 / 3.0 = 5.2f" + 100 / 3);

        String intStrValue = "1";
        String floatStrValue = "2.0";
        String doubleStrValue = "2.3434343434";
        String booleanStrValue = "true";
        String longStrValue = "100000000000000";

        int intValue = Integer.parseInt(intStrValue);
        float floatValue = Float.parseFloat(floatStrValue);
        double doubleValue = Double.parseDouble(doubleStrValue);
        boolean booleanValue = Boolean.parseBoolean(booleanStrValue);
        long longValue = Long.parseLong(longStrValue);

        System.out.println(intValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(booleanValue);
        System.out.println(longValue);
    }
}
