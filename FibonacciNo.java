import java.util.Scanner;

class FibonacciNo {

    public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    int n1=0,n2=1,n3,i,count;
    System.out.println("enter the length of fibonacci series you want to print (in number) :");
    count = s.nextInt();
    System.out.print(n1+" "+n2);
    count=count-3;
    for(i=0;i<=count;i++)
    {
        n3=n1+n2;
        System.out.print(" "+n3);
        n1=n2;
        n2=n3;
    }

}
}
