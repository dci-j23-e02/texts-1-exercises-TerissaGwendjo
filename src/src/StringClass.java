import java.util.Scanner;

public class StringClass {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write your code here: ");
        String input = scanner.nextLine();
        System.out.println(input.toUpperCase());
        scanner.close();
    }

}
