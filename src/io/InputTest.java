package io;

import java.io.*;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;
		
		/*
		 * Version 1: the stream variable is declared outside of the try/catch
		 * You need to explicitly close the stream in the 'finally' block.
		 */
		InputStream in = null;
		try {
			in = 
				new LowerCaseInputStream( 
					new BufferedInputStream(
						new FileInputStream("test.txt")));

			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) { in.close(); }
		}
		
		/*
		 * Version 2: the stream variable is declared in the try block
		 * The stream is closed because the variable's scope is closed.
		 */		
		
		System.out.println();
		try (InputStream in2 = 
				new LowerCaseInputStream(
					new BufferedInputStream(
						new FileInputStream("test.txt")))) 
		{
			while((c = in2.read()) >= 0) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}