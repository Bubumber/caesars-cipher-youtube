package caesars.cipher;

public class Main {

	public static void main(String[] args) {
		
		String message = "how are you doing today";
		int offset = 12;
		
		//creating instance of class CaesarsCipher and naming is caesarsCipher
		CaesarsCipher caesarsCipher = new CaesarsCipher();
		//accessing method cipher from class
		String cipheredMessage = caesarsCipher.cipher(message, offset);
		
		System.out.println("Message: " + message);
		System.out.println("Offset: " + offset);
		System.out.println("Ciphered message: " + cipheredMessage);
	}

}
