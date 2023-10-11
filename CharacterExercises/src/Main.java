import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Exercise1 e1 = new E1
        System.out.println(Exercise1.CheckIsLetter('D')); // Instance name(e1) . method name(CheckIsLetter) E1.CheckIsLetter is possible only if CheckIsLetter is defined as static without defining the class Exer1 e1 = new E1
        System.out.println(Exercise1.CheckIsLetter('7'));
        System.out.println(Exercise1.CheckIsDigit('7'));
        System.out.println(Exercise1.CheckIsDigit('a'));
        System.out.println(Exercise1.CheckIsWhitespace('7'));
        System.out.println(Exercise1.CheckIsWhitespace('7'));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name in lowercase and the first letter will be printed in uppercase");
        String name = scanner.nextLine();
        char ch = name.charAt(0);
        System.out.println(E4.ConvertToUpperCase(ch));
        System.out.println(E4.ConvertToUpperCase('b'));



    }
}