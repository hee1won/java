package chap18.book.s180403FileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception{
		
		String originalFileName = "src/chap18/book/s180402FileOutputStream/FileOutputStreamExample.java";
		String targetFileName = "output/참조타입02.png";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read()) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다!");
	}

}
