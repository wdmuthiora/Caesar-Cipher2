import java.util.Scanner;

public class Encode {
    public static final String alphabetInLowerCase = "abcdefghijklmnopqrstuvwxyz";
    public static final String alphabetInUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encoding(String userInput, int encryptionKey){
        String encryptedUserInput = "";
        for (int i=0; i<userInput.length(); i++){
            int characterCurrentIndexPosition= alphabetInLowerCase.indexOf(userInput.charAt(i));
            int shiftedCharacterIndexPosition =(encryptionKey+characterCurrentIndexPosition)%26;
            char newShiftedCharacter = alphabetInUpperCase.charAt(shiftedCharacterIndexPosition);
            encryptedUserInput= encryptedUserInput+newShiftedCharacter;
        }
        return encryptedUserInput;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the text message to be encrypted ");
        String msg = new String();
        msg = scan.next();
        System.out.println(" Encrypted Text : " + encoding(msg, 1));

        scan.close();
    }
}

