import java.util.Scanner;

public class Character {
    public static void main(StringClass[]args){
//        //is the character a letter?
//        System.out.println(java.lang.Character.isLetter('f'));
//        System.out.println(java.lang.Character.isLetter('1'));
//        System.out.println(java.lang.Character.isLetter('ß'));
//        System.out.println(java.lang.Character.isLetter('['));
//
//        //is the character a digit?
//        System.out.println(java.lang.Character.isDigit('f'));
//        System.out.println(java.lang.Character.isDigit('1'));
//        System.out.println(java.lang.Character.isDigit('9'));
//        System.out.println(java.lang.Character.isDigit('+'));
//
//        //is there a whitespace?
//        System.out.println(java.lang.Character.isWhitespace('f'));
//        System.out.println(java.lang.Character.isWhitespace(' '));
//        System.out.println(java.lang.Character.isWhitespace('&'));
//        System.out.println(java.lang.Character.isWhitespace('.'));

        //EXERCISE 1

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Username: ");
        char name = input.next().charAt(4);
        System.out.println(java.lang.Character.isLetter(name));

        //EXERCISE 2
        System.out.println(java.lang.Character.isDigit(name));

        //EXERCISE 3
        System.out.println(java.lang.Character.isWhitespace(name));

        System.out.println("Please enter your name ");
        String name1 = input.nextLine();
        System.out.println(name1.toLowerCase());

        //EXERCISE 4
        System.out.println(java.lang.Character.isWhitespace('.'));

        //EXERCISE 5
        System.out.println(name1.toUpperCase());

        input.close();




    }
}
