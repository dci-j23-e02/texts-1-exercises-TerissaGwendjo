import java.util.Scanner;

public class Ex1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your string : ");
        String input = scanner.nextLine();
        System.out.println(input.toUpperCase());
    }
}
