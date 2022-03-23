package chap08.book.s080401Implements;

import chap08.book.s080205StaticMethod.RemoteControl;
import chap08.book.s080301Implements.Audio;
import chap08.book.s080301Implements.Television;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
	}

}
