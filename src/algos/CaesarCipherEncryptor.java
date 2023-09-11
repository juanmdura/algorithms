package algos;

import java.util.Arrays;

public class CaesarCipherEncryptor {

	private static String caesarCypherEncryptor(String str, int key) {
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] strArray = str.toCharArray();
		char[] result = new char[str.length()];
		int index = 0;

		for (int i = 0; i < alphabet.length; i++) {
			if (index < strArray.length && alphabet[i] == strArray[index]) {
				System.out.print("" + alphabet[i]);

				int newIndex = i+key;
				while (newIndex >= alphabet.length) {
					newIndex = newIndex - alphabet.length;
				}
				char shifted = alphabet[newIndex];
				result[index] = shifted;
				index++;
				i=-1;
			}
		}

		System.out.print(" - " + String.valueOf(result));
		//System.out.println(" ");
		return String.valueOf(result);
	}

	public static void main(String[] args) {	
		String text = "CNF Campeon del mundo"; 
		String[] splitted = text.split("del");
		
		String output = "";
		for (int i = 0; i < splitted.length; i++) {
			output += splitted[i];
		}
		
		System.out.println(output);		
		caesarCypherEncryptor("ovmqbwtujqmfkao", 52);
	}
}
