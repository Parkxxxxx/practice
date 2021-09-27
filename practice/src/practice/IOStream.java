package practice;
import java.io.*;

public class IOStream {
	
	public void ReadChar() throws IOException {
		char c;
		System.out.println("input char");
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		do {
			c = (char) br.read();	
			System.out.println(c);
		} while (c != 'q');
	}
	
	public void ReadString() throws IOException {
		String str;
		System.out.println("input String");
		BufferedReader brr = new BufferedReader (new InputStreamReader (System.in));
		do {
			str = brr.readLine();
			System.out.println(str);
		} while (!str.equals("end"));
	}

}
