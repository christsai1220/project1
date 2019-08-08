package com.chris;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello Java");
        String s = "abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.substring(3));
        System.out.println(s.substring(1,3));
        Person P = new Person("Chris",67.5f, 1.7f);
        P.Hello();
       /* P.weight = 65f;
        P.height = 1.7f;*/
        System.out.println(P.bmi());
        int score=78;
        System.out.println(score<80 || score > 90);
        /*int age = 19;
        Integer age2 = 19;
        age2.byteValue();
        char c = '我';
        Character c2 = '我';
        float weight = 66.5f;
        Float weg2 = 66.5f;
        double d = 1.7;
        Double d2 = 1.7;
        boolean adult = true;
        Boolean ad2 = true;*/
    }
}
