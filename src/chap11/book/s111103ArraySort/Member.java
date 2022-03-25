package chap11.book.s111103ArraySort;

public class Member implements Comparable<Member>{
	String name;
	public Member(String name){
		this.name = name;
	}
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}
	
	

}
