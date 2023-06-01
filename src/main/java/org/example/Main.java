package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        double hight = 1.87;
        int weight = 98;
        int miles = service.calculate(hight, weight); // должно получиться 500
        System.out.println(miles);
    }
}