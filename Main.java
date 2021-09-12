package main;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter number of minutes :");
        int min = a.nextInt();
        int day,year,y = 525600;
        day = (min/60/24)%365;
        year = min/y;
        System.out.println(min+" mins is approximately "+day+" days and "+year+" years.");
    }
}
