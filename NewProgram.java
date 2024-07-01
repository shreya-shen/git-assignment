import java.util.Scanner;
public class NewProgram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt(),b=sc.nextInt(),sum=0;
        sum=a+b;
        System.out.println("Sum="+sum);
        sc.close();
    }
}