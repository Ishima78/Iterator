package org.example;

public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(2, 9)) {
            System.out.println("- + " + r);
            if (r == 9) {
                System.out.println(" МАКСИМУМ ");
                break;
            }
        }
    }
}