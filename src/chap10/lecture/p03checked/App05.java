package chap10.lecture.p03checked;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App05 {
	public static void main(String[] args) {
		// 하나의 try블럭 사용
		// 여러 catch 블럭 사용

		try {
			FileReader fr = new FileReader("");
			try {
				fr.read();

			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
