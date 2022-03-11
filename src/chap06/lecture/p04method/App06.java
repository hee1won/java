package chap06.lecture.p04method;

public class App06 {

	public static void main(String[] args) {
		
		Calculator2 c = new Calculator2();
		
		c.sum();
		c.sum(1);
		c.sum(10, 20, 30);
		c.sum(30, 100, 200, 1000, 1);
		
		int sum = c.sum(33, 44, 55, 66, 77);
		System.out.println(sum);

		
		c.concat("java", "spring", "sql");	// javaspringsql
		c.concat("a", "b", "c");	// abc
		c.concat("mysql");	  // mysql
		
	}

}
