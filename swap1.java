import java.util.Scanner;
public class swap1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = sc.nextInt();
        System.out.println("Enter second number: ");
        int second = sc.nextInt();
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println("First: " + first);
        System.out.println("Second" + second);
    }
}