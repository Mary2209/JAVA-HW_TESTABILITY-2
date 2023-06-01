package org.example;

public class BMIService {
    public int calculate(double hight, int weight) {
        return (int) (weight/(hight*hight));
    }
}
