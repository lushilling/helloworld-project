package com.qa.HelloWorld;

import java.util.Arrays;
import java.util.HashMap;

public class App {
	private static String sentence = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";
	public static void main(String[] args) {
		System.out.println("Hello world to the standard out");
	
		
		
		HashMap<String, String> map = new HashMap<>();
		map.put("/", " ");
		map.put(".-", "A");
		map.put("-...", "B");
		map.put("-.-.", "C");
		map.put("-..", "D");
		map.put(".", "E");
		map.put("..-.", "F");
		map.put("--.", "G");
		map.put("....", "H");
		map.put("..", "I");
		map.put(".---", "J");
		map.put("-.-", "K");
		map.put(".-..", "L");
		map.put("--", "M");
		map.put("-.", "N");
		map.put("---", "O");
		map.put(".--.", "P");
		map.put(" --.-", "Q");
		map.put(".-.", "R");
		map.put("...", "S");
		map.put("-", "T");
		map.put("..-", "U");
		map.put("...-", "V");
		map.put(".--", "W");
		map.put("-..-", "X");
		map.put("-.--", "Y");
		map.put("--..", "Z");

		java.util.List<String> code = Arrays.asList(sentence.split(" "));
		
		for (String s1 : code) {
			System.out.print(map.get(s1));
		}

	}

}
