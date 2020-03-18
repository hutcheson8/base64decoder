package radix64decode;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Base64;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("r64.txt"));
		byte[] in = bis.readAllBytes();
		bis.close();
		byte[] out = Base64.getDecoder().decode(in);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("out.txt"));
		bos.write(out);
		bos.close();
	}
}