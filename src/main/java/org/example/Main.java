package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Додавання: " + calculator.add(3, 3));
        System.out.println("Віднімання: " + calculator.subtract(3, 2));
        System.out.println("Множення: " + calculator.multiply(1, 3));
        System.out.println("Ділення: " + calculator.divide(4, 2));
    }
}