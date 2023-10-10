## A- Character Class Exercises 

### Exercise 1: Check if a character is a letter
**Scenario:** John is creating a registration form for a new social media platform. He wants to ensure that the user's name only contains letters. He needs a function to check if a character is a letter.

**Instructions:** Write a function named "isLetter" that takes a character as input. Use the Character.isLetter() method to check if the character is a letter. The function should return true if the character is a letter, and false otherwise. Test your function with different characters to ensure it's working correctly.

**Starter code:**
```java
public class Main {
    public static void main(String[] args) {
        // Your code here
    }
}
```

### Exercise 2: Check if a character is a digit
**Scenario**: Mary is developing a banking app. She needs to validate the user's input when they are entering their account number. She needs a function to check if a character is a digit.

**Instructions**: Write a function named "isDigit" that takes a character as input. Use the Character.isDigit() method to check if the character is a digit. The function should return true if the character is a digit, and false otherwise. Test your function with different characters to ensure it's working correctly.

**Starter code:**
```java
public class Main {
    public static void main(String[] args) {
        // Your code here
    }
}
```

### Exercise 3: Check if a character is a whitespace
**Scenario**: Tom is creating a document formatting tool. He needs a function to check if a character is a whitespace.

**Instructions**: Write a function named "isWhitespace" that takes a character as input. Use the Character.isWhitespace() method to check if the character is a whitespace. The function should return true if the character is a whitespace, and false otherwise. Test your function with different characters to ensure it's working correctly.

**Starter code:**
```java
public class Main {
    public static void main(String[] args) {
        // Your code here
    }
}
```

### Exercise 4: Convert a character to uppercase
**Scenario**: Alice is developing a chat application. She wants to add a feature that allows users to send messages in all uppercase letters.

**Instructions**: Write a function named "toUppercase" that takes a character as input. Use the Character.toUpperCase() method to convert the character to uppercase. The function should return the uppercase version of the character. Test your function with different characters to ensure it's working correctly.

**Starter code:**
```java
public class Main {
    public static void main(String[] args) {
        // Your code here
    }
}
```

### Exercise 5: Convert a character to lowercase
**Scenario**: Bob is creating a password generator tool. He wants to ensure that all generated passwords are in lowercase.

**Instructions**: Write a function named "toLowerCase" that takes a character as input. Use the Character.toLowerCase() method to convert the character to lowercase. The function should return the lowercase version of the character. Test your function with different characters to ensure it's working correctly.

**Starter code:**
```java
public class Main {
    public static void main(String[] args) {
        // Your code here
    }
}
```


## B- String Class Exercises 

### Exercise 1:
**Scenario :** 
"John is learning Java and he wants to convert every input of string to uppercase letters. Can you help him?"

**Instructions:**
1. You need to write a Java program that takes a string as an input.
2. Convert the string to uppercase.
3. Print the result.

**Starter code:**
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    // write your code here
  }
}
```


### Exercise 2:
**Scenario :** 
"Laura receives many emails per day and she wants to find out if certain word is found in the content. Can you help her?"

**Instructions:**
1. You need to write a Java program that takes two string inputs: the content of the email and the word to be searched.
2. Find the index where the word is found for the first time in the content.
3. If the word is not found, print an appropriate message.

**Starter code:**
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the content of the email:");
    String content = scanner.nextLine();
    System.out.println("Enter the word to be searched:");
    String wordToSearch = scanner.nextLine();
    // write your code here
  }
}
```

### Exercise 3:
**Scenario :** 
"Lucas is a game developer. He is developing a fantasy game where the hero has to cross several bridges. But the twist is, some bridges are broken. A bridge is represented as a String where '#' character is a safe part and any space (' ') is a broken part. Can you help Lucas to write a function which validates whether a bridge is safe to walk on?"

**Instructions:**
1. You need to write a Java program that takes a string as an input where '#' character represents a safe part of the bridge and ' ' represents a broken part.
2. Write a method called isSafeBridge which takes the bridge string as an argument and returns a boolean; true if the bridge is safe (i.e. has no gaps), false if it is not.
3. Call the method with the input string and print the result.

**Starter code:**
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String BridgeStatus = scanner.nextLine();
    // write your code here
  }

  // write your isSafeBridge method here
}
```

### Exercise 4:
**Scenario :** 
"As a programmer, Anna frequently has to convert string numbers into a concatenated string. She is tired of doing this manually. Can you help her to automate this?"

**Instructions:**
1. You need to write a Java program that takes two string numbers as an input.
2. Concatenate the two string numbers.
3. Print the result.

**Starter code:**
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String num1 = scanner.nextLine();
    String num2 = scanner.nextLine();
    // write your code here
  }
}
```

### Exercise 5:
**Scenario :** 
"Mike is a school teacher and he wants to greet his students differently based on their names. Can you help him?"

**Instructions:**
1. You need to write a Java program that takes a string as an input.
2. If the input string is "Mike", print "Hello, Mike! You are my favorite student."
3. For any other input, print "Hello, [name]! You are one of my students."
4. Replace [name] with the input string.

**Starter code:**
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    // write your code here
  }
}
```
