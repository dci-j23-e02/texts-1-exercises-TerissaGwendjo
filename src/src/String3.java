import java.util.Scanner;

public class String3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the bridge status: ");
        String BridgeStatus = scanner.nextLine();
        // write your code here
        boolean isSafe = isSafeBridge(BridgeStatus);

        if (isSafe) {
            System.out.println("The bridge is safe to walk on.");
        } else {
            System.out.println("The bridge is not safe to walk on.");
        }

    }

    public static boolean isSafeBridge(String bridge) {
        // Iterate through each character in the bridge string
        for (char c : bridge.toCharArray()) {
            // If a space (' ') is found, return false (unsafe bridge)
            if (c == ' ') {
                return false;
            }
        }
        // If no spaces are found, return true (safe bridge)
        return true;
    }

    // write your isSafeBridge method here
}

