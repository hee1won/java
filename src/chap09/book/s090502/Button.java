package chap09.book.s090502;

public class Button {
	
	interface OnClickListener {
		void onClick();
	}

	OnClickListener listener;

	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

}
