import java.util.Scanner;
public class Decode {
    public static void main(String[] args) {

//        Use Scanner instead for user interface.
        Scanner scan = new Scanner(System.in);

//        Ask user for encryptedText.
        System.out.println("Enter the text message to be decrypted: ");
        String stringToBeDecrypted = new String();
        stringToBeDecrypted = scan.next();

//        Ask user for decryption key
        System.out.println("Enter a number between 0 and 26: ");
        String decryptionKey = new String();
        decryptionKey = scan.next();
        Integer key =Integer.parseInt(decryptionKey);
        System.out.println(" Decrypted Text : " + decoding(stringToBeDecrypted, key));
        scan.close();
    }
}
