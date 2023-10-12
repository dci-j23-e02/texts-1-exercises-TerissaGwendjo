import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = scanner.nextLine();
        //comparing strings in java doesn't work with == so this name == "Terissa" won't print out Terissa as favourite student
        if (name.compareTo("Terissa")>-1)T{ //(name.compareTo("Terissa")>-1) which returns -1 if tit it's false...prints out you are my favourite student
            System.out.println("Hello " + name + ", you are my favourite student");
        } else {
            System.out.println("Hello " + name +", you are one of my students");
        }
    }

}
