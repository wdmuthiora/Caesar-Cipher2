import java.util.Scanner;
class Encode {
    public static void main(String[] args) {

//        Use Scanner instead for user interface.
        Scanner scan = new Scanner(System.in);

//        Ask user for plainText.
        System.out.println("Enter the text message to be encrypted: ");
        String stringToBeEncrypted = new String();
        stringToBeEncrypted = scan.next();

//        Ask user for key
        System.out.println("Enter a number between 0 and 26: ");
        String encryptionKey = new String();
        encryptionKey = scan.next();
        Integer key =Integer.parseInt(encryptionKey);
        System.out.println(" Encrypted Text : " + encoding(stringToBeEncrypted, key));
        scan.close();
    }

    private static String encoding(String stringToBeEncrypted, int encryptionKey) {

//        String to be returned, in encrypted form.
        String encryptedString ="";

//        Introduce loop to iterate for each stringToBeEncrypted character.
        for (int i=0; i<stringToBeEncrypted.length(); i++){
            char singleCharacter = stringToBeEncrypted.charAt(i);

//            If singleCharacter is a letter
            if (Character.isLetter(singleCharacter)){

//               Check if singleCharacter is uppercase/lowercase using ASCII values
                if (Character.isLowerCase(singleCharacter)){

//                   Create a new encoded character, using casting.
                    char encodedSingleCharacter = (char)(singleCharacter+encryptionKey);

//                   Make sure the encoded character falls within the lowercase alphabet bounds of ASCII.
                    if (encodedSingleCharacter>'z'){
                        encryptedString += (char)(singleCharacter-(26-encryptionKey));
                    }else{
                        encryptedString += encodedSingleCharacter;
                    }
                }
                else if (Character.isUpperCase(singleCharacter)){

//                   Create a new encoded character, using casting.
                    char encodedSingleCharacter = (char)(singleCharacter+encryptionKey);

//                   Make sure the encoded character falls within the lowercase alphabet bounds of ASCII.
                    if (encodedSingleCharacter>'Z'){
                        encryptedString += (char)(singleCharacter-(26-encryptionKey));
                    }else{
                        encryptedString += encodedSingleCharacter;
                    }
                }
            }

//           If singleCharacter is not a letter, push that character into encryptedString.
            else {
                encryptedString += singleCharacter;
            }
        }
        return encryptedString;
    }
}