package stream.outputstream;

import java.io.FileOutputStream;

public class FileOutputStreamTest3 {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output3.txt")) {
			byte[] bs = new byte[26];
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
