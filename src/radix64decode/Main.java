package radix64decode;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Base64;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("r64.txt"));
		ArrayList<Byte> inAL = new ArrayList<>();
		for(int x=bis.read();x!=-1;x=bis.read())
			inAL.add((byte) x);
		byte[] in = new byte[inAL.size()];
		for(int x=0;x<in.length;x++)
			in[x]=inAL.get(x);
		bis.close();
		byte[] out = Base64.getDecoder().decode(in);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("out.txt"));
		bos.write(out);
		bos.close();
	}
}