package com.chris;

public class Person {

    String name;
    float weight;
    float height;
    private float bmi;
    public Person(float weight, float height){
        this.weight = weight;
        this.height = height;
    }
    public Person(String name, float weight, float height){
        this(weight,height);
        this.name = name;
    }

    public float bmi() {
        bmi = weight / (height*weight);
        return bmi;
    }


    public void Hello() {
        System.out.println("Hello Person");
    }
}
