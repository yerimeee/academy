package variable01;

public class Operator {
	int num1 = 1;
	int num2 = 1;
	
	int add(int num1) {	//num1은 지역변수
		this.num1 = num1; // this: 현재 속해있는 객체를 가리키는 키워드
		return this.num1 + num2; //num2는 전역변수(class에 있는지 찾음)
	}
/*	int subtract(int num1) {
		num2 = num1; //전역변수의 num2에 사용자가 할당한 num1값을 넣음
		return this.num1 + num2;
	}*/
	
	int subtract(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		return num1 + num2;
	}
}
