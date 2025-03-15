package com.driver;

public class Main {
    // Task 1: Create a class Product inside Main
    static class Product {
        // Task 3: Create a method with two integer parameters
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Create an overloaded method with three integer parameters
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Create an overloaded method with two double parameters
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: Create an object of Product in Main function
        Product p = new Product();

        // Calling the methods and displaying results
        System.out.println("Product of 2 and 3: " + p.product(2, 3));
        System.out.println("Product of 2, 3, and 4: " + p.product(2, 3, 4));
        System.out.println("Product of 2.5 and 3.5: " + p.product(2.5, 3.5));
    }
}