package operator04;

public class Operator {

	int num1 = 1;
	int num2 = 1;
	
	//만약 메서드 오버로딩 기능이 없다면 각각 다른 기능들의 변수명add을 다르게 넣어줘야함.
	int add() {
		return num1+num2;
	}
	int add(int num1) {
		return num1+num2;
	}
	int add(int num1, int num2) {
		return num1+num2;
	}
	double add(double num1) {
		return num1+num2; 	//자동형변환 일어남. double+int라서
	}
	double add(double num1, double num2) {
		return num1+num2;
	}
	int sub() {
		return num1-num2;
	}
	int sub(int num1) {
		return num1-num2;
	}
	
	int sub(int num1, int num2) {
		return num1-num2;
	}
	int time() {
		return num1*num2;
	}
	int time(int num1, int num2) {
		return num1*num2;
	}
	double div(double num2) {
		return num1/num2;
	}
	int div(int num1, int num2) {
		return num1/num2;
	}
	int add(int[] arrInt) {
		int sum = 0;
		for(int i=0; i<arrInt.length; i++) {
			sum += arrInt[i];
		}
		return sum;
	}
}
