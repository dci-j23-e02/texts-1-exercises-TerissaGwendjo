import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please create your bridge string :");
        String BridgeStatus = scanner.nextLine();
        if(new Ex3().isSafeBridge(BridgeStatus)){
            System.out.println("Bridge s safe ");
        } else {
            System.out.println("The bridge is not safe");
        }

    }

    //
    public boolean isSafeBridge (String str){
        return str.indexOf(" ") == -1;
    }
}