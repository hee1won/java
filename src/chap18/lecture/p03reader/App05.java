package chap18.lecture.p03reader;

import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

public class App05 {
	public static void main(String[] args) throws Exception {
		
		String file = "src/chap18/lecture/p03reader/App05.java";
		Reader rd = new FileReader(file);
		
		char[] datas = new char[10];
		int len = 0;
		
		while((len = rd.read(datas)) != -1) {
			System.out.println(Arrays.toString(datas));
		}
		
		rd.close();
	}

}

// 텍스트 데이터를 파일에 저장할때 사용하는 문자기반 스트림이다.
