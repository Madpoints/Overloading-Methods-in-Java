package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(7, 5));
        System.out.println(calcFeetAndInchesToCentimeters(11));
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0) {
            return -1;
        } else if (inches < 0 || inches > 12) {
            return -1;
        }

        double centimeters = (feet * 12 + inches) * 2.54;

        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) {
            return -1;
        }

        int feet = inches / 12;
        inches = inches % 12;

        return calcFeetAndInchesToCentimeters(feet, inches);
    }

    /* Overloading Methods*/
//    public static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score) {
//        System.out.println("Unnamed player scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore() {
//        System.out.println("Game Over");
//        return 0;
//    }
}
