import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the content of the email:");
        String content = scanner.nextLine();
        System.out.println("Enter the word to be searched:");
        String wordToSearch = scanner.nextLine();
        int index = content.indexOf(wordToSearch);
        if (index !=-1){
            System.out.println("The word is found "+ index);
        } else  {
            System.out.println("The word cannot be found!");
        }
    }


    }
