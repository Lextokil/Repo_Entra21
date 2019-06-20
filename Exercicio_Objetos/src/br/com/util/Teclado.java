package br.com.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado {

	private static BufferedReader teclado = new BufferedReader(
			new InputStreamReader(System.in));

	public static String ReadText(String texto) {
		try {
			System.out.println(texto);
			return teclado.readLine();
		} catch (IOException e) {
			return null;
		}
	}

	public static int ReadInt(String texto) {
		return Integer.parseInt(ReadText(texto));
	}

	public static double ReadDouble(String texto) {
		return Double.parseDouble(ReadText(texto));
	}
}
