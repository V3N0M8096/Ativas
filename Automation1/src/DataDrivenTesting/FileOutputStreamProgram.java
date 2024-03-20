package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamProgram {
	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\IRAYYA\\OneDrive\\Desktop\\write.properties";
		FileOutputStream fos=new FileOutputStream(path);
		String text="browser chrome";
		fos.write(text.getBytes());
		
	}

}
