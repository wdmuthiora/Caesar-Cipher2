import java.io.Console;

public class Encode {

    public Encode(){
        Console myConsole = System.console();
        System.out.println("Enter a word to encrypt: ");
        String userInput = myConsole.readLine();
        System.out.println("Enter a number between 0 and 25: ");
        int userKey = Integer.parseInt(myConsole.readLine());
    }
    public static void main(String[] args) {

    }

}

