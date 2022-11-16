import java.util.Scanner;
import java.util.*;

class calculator {
    public static void main(String[] args) {

        Scanner measurements = new Scanner(System.in);
        System.out.println("What is your gender? (1 = Male, 2 = Female): ");
        double g = measurements.nextDouble();

        System.out.println("What is your height? (in inches): ");
        double h = measurements.nextDouble();

        System.out.println("What is your weight? (in pounds): ");
        double w = measurements.nextDouble();

        System.out.println("What is your activity level? (0 = Not Active, 1 = Semi-Active, 2 = Very Active): ");
        double a = measurements.nextDouble();

        System.out.println("How old are you?: ");
        double age = measurements.nextDouble();

        System.out.println("Would you like to lose or gain weight? (1 = Lose, 2 = Gain): ");
        double goal = measurements.nextDouble();

        if (g == 1 && a == 0) {
            System.out.println("You must consume " + MaleNA(w, h, age)
                    + " calories to maintain your current weight. If you would like to gain weight you should consume "
                    + (300 + MaleNA(w, h, age)) + " calories & if you would like to lose weight you should consume "
                    + (MaleNA(w, h, age) - 300) + " calories.");
        } else if (g == 1 && a == 1) {
            System.out.println("You must consume " + MaleSA(w, h, age)
                    + " calories to maintain your current weight. If you would like to gain weight you should consume "
                    + (300 + MaleSA(w, h, age)) + " calories & if you would like to lose weight you should consume "
                    + (MaleSA(w, h, age) - 300) + " calories.");
        } else if (g == 1 && a == 2) {
            System.out.println("You must consume " + MaleVA(w, h, age)
                    + " calories to maintain your current weight. If you would like to gain weight you should consume "
                    + (300 + MaleVA(w, h, age)) + " calories & if you would like to lose weight you should consume "
                    + (MaleVA(w, h, age) - 300) + " calories.");
        } else if (g == 2 && a == 0) {
            System.out.println("You must consume " + FemaleNA(w, h, age)
                    + " calories to maintain your current weight. If you would like to gain weight you should consume "
                    + (300 + FemaleNA(w, h, age)) + " calories & if you would like to lose weight you should consume "
                    + (FemaleNA(w, h, age) - 300) + " calories.");
        } else if (g == 2 && a == 1) {
            System.out.println("You must consume " + FemaleSA(w, h, age)
                    + " calories to maintain your current weight. If you would like to gain weight you should consume "
                    + (300 + FemaleSA(w, h, age)) + " calories & if you would like to lose weight you should consume "
                    + (FemaleSA(w, h, age) - 300) + " calories.");
        } else if (g == 2 && a == 2) {
            System.out.println("You must consume " + FemaleSA(w, h, age)
                    + " calories to maintain your current weight. If you would like to gain weight you should consume "
                    + (300 + FemaleSA(w, h, age)) + " calories & if you would like to lose weight you should consume "
                    + (FemaleSA(w, h, age) - 300) + " calories.");
        }

        if (goal == 1) {
            Food foodObj = new Food();
            foodObj.losetips();
        } else if (goal == 2) {
            Food foodObj = new Food();
            foodObj.gaintips();
        }

    }

    public static double MaleNA(double w, double h, double age) {
        double cals;
        cals = 1.2 * (66 + (6.23 * w) + (12.7 * h) - (6.8 * age));
        return cals;
    }

    public static double MaleSA(double w, double h, double age) {
        double cals;
        cals = 1.4 * (66 + (6.23 * w) + (12.7 * h) - (6.8 * age));
        return cals;
    }

    public static double MaleVA(double w, double h, double age) {
        double cals;
        cals = 1.6 * (66 + (6.23 * w) + (12.7 * h) - (6.8 * age));
        return cals;
    }

    public static double FemaleNA(double w, double h, double age) {
        double cals;
        cals = 1.2 * (655 + (4.35 * w) + (4.7 * h) - (4.7 * age));
        return cals;
    }

    public static double FemaleSA(double w, double h, double age) {
        double cals;
        cals = 1.4 * (655 + (4.35 * w) + (4.7 * h) - (4.7 * age));
        return cals;
    }

    public static double FemaleVA(double w, double h, double age) {
        double cals;
        cals = 1.6 * (655 + (4.35 * w) + (4.7 * h) - (4.7 * age));
        return cals;
    }

}