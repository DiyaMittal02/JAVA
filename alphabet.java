import java.util.Scanner;
public class alphabet{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your charachter");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'O' || ch == 'U' || ch == 'I')
        {
            System.out.println("your charachter is a vowel");
        }
        else{
            System.out.println("Your charachter is a consonant");
        }
    }
}