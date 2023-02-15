package operator03;

public class Ex02 {

	public static void main(String[] args) {

		int myAge = 23; //변수에 23을 대입하시오.
		int teacherAge = 38;
		
		boolean value = (myAge > 25);
		System.out.println(value);
		System.out.println(myAge <= 25);
		System.out.println(myAge == teacherAge); //같은지 비교하시오.
		
		char ch;
		ch = (myAge > teacherAge) ?	'T' : 'F'; //조건(삼항)연산자를 쓰시오.
		System.out.println(ch);
	}

}
