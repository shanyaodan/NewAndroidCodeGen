package com.dyc.codegen.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public final class Utils {
	public static String fromInputStreamToString(InputStream inputStream) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
		String readLine = "";
		StringBuilder stringBuilder = new StringBuilder();
		try {
			while ((readLine = bufferedReader.readLine()) != null) {
			stringBuilder.append(readLine + "\n");
			}
			inputStream.close();
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stringBuilder.toString();
	}
}
