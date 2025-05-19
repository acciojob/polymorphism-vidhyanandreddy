package com.driver;

public class Main {
    public static class Product {
        public int product(int x, int y) {
            return x * y;
        }
        public int product(int x, int y, int z) {
            return x * y * z;
        }
        public double product(double x, double y) {
            return x * y;

        }
    }
    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.product(10, 35));
        System.out.println(p.product(10, 34, 2));
        System.out.println(p.product(12.5, 1.1));
    }
}