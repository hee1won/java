package chap09.exercise.p06;

public class Chatting {
	void startChat(String chatId) {
		
		String nickName = chatId;
		
		Chat chat = new Chat() {
			@Override
			void start() {
				while (true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
				}
			}
		};
		chat.start();
		
	}
	
	class Chat{
		void start() {
			
		}
	}
	
	void sendMessage(String message) {
		
	}

}