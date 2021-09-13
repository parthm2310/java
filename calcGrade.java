package grade;

import java.util.Scanner;

public class calcGrade {

    public static void main(String[] args) {
        System.out.println("***** program to calculate your grade *****");
        System.out.println("Enter your score :");
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();
        if(score<0 || score >100) {
            System.out.println("*****Invalid score*****");
        }else{
            switch (score/10) {
                case 10:
                case 9:
                    System.out.println("Grade : A\n");
                    break;
                case 8:
                    System.out.println("Grade : B\n");
                    break;
                case 7:
                    System.out.println("Grade : C\n");
                    break;
                case 6:
                    System.out.println("Grade : D\n");
                    break;
                default:
                    System.out.println("Grade : F\n");
            }
        }
    }
}
