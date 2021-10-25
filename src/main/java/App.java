import java.io.Console;

public class App {
    Console myConsole= System.console();
    public void App() {
        System.out.println("Enter a word to encrypt: ");
        String stringWord = myConsole.readLine();
        System.out.println("Enter a number between 0 and 25: ");
        String key = myConsole.readLine();
        int encodingKey = Integer.parseInt(key);
    }

    public static void main(String[] args){}

}

