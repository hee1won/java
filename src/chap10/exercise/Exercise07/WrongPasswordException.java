package chap10.exercise.Exercise07;

public class WrongPasswordException extends Exception{
	public WrongPasswordException() {
		
	}
	
	public WrongPasswordException(String message) {
		super(message);
	}

}
