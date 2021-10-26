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

//    The return type of this method is a String of decoded characters
    public static String decoding( String stringToBeDecrypted, int decryptionKey){

//       String to be returned, in decrypted form.
        String decryptedString ="";

//        Introduce loop to iterate for each stringToBeDecrypted character.
        for (int i=0; i<stringToBeDecrypted.length(); i++){
            char singleCharacter = stringToBeDecrypted.charAt(i);

//            If singleCharacter is a letter
            if (Character.isLetter(singleCharacter)){

//               Lowercase.
                if (Character.isLowerCase(singleCharacter)){

//                   Create a new decoded character, using casting.
                    char decodedSingleCharacter = (char)(singleCharacter-decryptionKey);

//                   Make sure the encoded character falls within the uppercase alphabet bounds of ASCII.
                    if (decodedSingleCharacter<'a'){
                        decryptedString += (char)(singleCharacter-(decryptionKey-26));
                    }else{
                        decryptedString += decodedSingleCharacter;
                    }
                }

//               Uppercase.
                else if (Character.isUpperCase(singleCharacter)){
//                   Create a new decoded character, using casting.
                    char decodedSingleCharacter = (char)(singleCharacter-decryptionKey);

//                   Make sure the encoded character falls within the uppercase alphabet bounds of ASCII.
                    if (decodedSingleCharacter<'A'){
                        decryptedString += (char)(singleCharacter-(decryptionKey-26));
                    }else{
                        decryptedString += decodedSingleCharacter;
                    }
                }

            }

//           If singleCharacter is not a letter, push that character into encryptedString.
            else {
                decryptedString += singleCharacter;
            }
        }
        return decryptedString;
    }
}
