package com.corejava.zemoso;
import java.util.Scanner;
public class Project01_01_LearningPackages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which package you want to enroll? 1, 2 or 3?");
        int packageNumber = scanner.nextInt();

        System.out.println("Enter the number of extra courses you want to enroll");
        int extraCourses = scanner.nextInt();

        int monthlyCost = 0;
        switch (packageNumber){
        case 1:
            monthlyCost = (extraCourses*6)+10;
            break;
        case 2:
            monthlyCost = (extraCourses*4)+12;
            break;
        case 3:
            monthlyCost = (extraCourses*3)+15;
            break;
        default:
            System.out.println("You've entered wrong choice");
        }
        System.out.println("Monthly Cost:\t"+monthlyCost);
    }
}
