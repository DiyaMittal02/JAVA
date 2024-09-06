import java.util.Scanner;
public class swap{
    public static void main(String[] args){
        int temp, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter another number");
        int b = sc.nextInt();
        temp = a;
        a = b; 
        b = temp;
        System.out.println("first number " + a);
        System.out.println("Second number" + b);
    }
}