package userException02;

public class NotSufficientException extends Exception {
	NotSufficientException() { } //사용자가 아무것도 안 넣어도 객체 생성해야되니까
	NotSufficientException(String msg) {
		super(msg);
	}
}
