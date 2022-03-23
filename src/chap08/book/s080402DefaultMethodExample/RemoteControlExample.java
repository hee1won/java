package chap08.book.s080402DefaultMethodExample;

import chap08.book.s080205StaticMethod.RemoteControl;
import chap08.book.s080301Implements.Television;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOff();
		rc.setMute(false);
	}

}
