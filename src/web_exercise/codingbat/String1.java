package web_exercise.codingbat;

public class String1 {

	public String nTwice(String str, int n) {
		  String front = str.substring(0, n);
		  String end = str.substring(str.length() -n);
		  return  front+end;
		  
		}
	
	public String firstTwo(String str) {
		if (str.length() < 2) {
			return str;
		}
		return str.substring(0, 2);
	}
	
	public boolean hasBad(String str) {
		  int i = str.indexOf("bad");
		  
		  return(i == 0) || (i == 1);
		}
	
	public boolean frontAgain(String str) {
		  if (str.length() < 2){
		    return false;
		  } else {
		  String end = str.substring(str.length()-2);
		  int i = str.indexOf(end);
		  return i == 0;
		  }
		}
	
	public String seeColor(String str) {
		  if(str.indexOf("red")==0){
		    return "red";
		  }
		  
		  if(str.indexOf("blue")==0){
		    return "blue";
		  }
		  
		  return "";
		}
	
	public String doubleChar(String str) {

		  String result = "";
		  
		  for(int i = 0; i < str.length(); i++){
		    result += str.charAt(i);
		    result += str.charAt(i);
		  }
		  
		  return result;
		}
	
	public int countHi(String str) {
		  int cnt = 0;
		  for(int i = 0; i < str.length()-1; i++){
		    String sub = str.substring(i, i+2);
		    if(sub.equals("hi")){
		      cnt++;
		    }
		  }
		  
		  
		  return cnt;
		}

}
