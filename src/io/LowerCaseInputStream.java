package io;

import java.io.*;

/*
 * This is a stream that converts all letters to lower case
 */
public class LowerCaseInputStream extends FilterInputStream {

	public LowerCaseInputStream(InputStream in) {
		super(in);
	}
 
	/*
	 * Reading a character
	 */
	public int read() throws IOException {
		int c = in.read();
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}
	
	/*
	 * Reading raw bytes
	 */		
	public int read(byte[] b, int offset, int len) throws IOException {
		int result = in.read(b, offset, len);
		for (int i = offset; i < offset+result; i++) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}
}
