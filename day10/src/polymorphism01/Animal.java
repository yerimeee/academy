package polymorphism01;
class Animals {
	void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	void sound() {
		System.out.println("소리를 냅니다.");
	}
}
class Dog extends Animals {
	@Override
	void sound() {
		System.out.println("멍멍");
	}
}
class Cat extends Animals {
	@Override
	void sound() {
		System.out.println("야옹야옹");
	}
}

public class Animal {

	public static void main(String[] args) {
		Animals ani;
		Dog puppy = new Dog();
		Cat spinks = new Cat();
		
		ani = puppy;
		ani.sound();
		
		puppy = (Dog)ani; 
		
		
		ani = spinks;	//ani가 spinsd의 주소를 가지게 되고 spinks객체를 안 쓰고 ani를 쓰겠다는 말임.
		ani.sound();
		/*
		 * puppy = (Dog)ani; 
		 * 이게 여기서는 출력이 오류나는 이유는 지금 ani에 spiks의 주소가 들어있는데
		 * ani를 Dog로 형변환 하려니 puppy가 없어서 안 됨.
		 */
		spinks = (Cat)ani;	//Animals와 Cat 객체 모두 사용한다는 말임
		
		/*Animals ani2 = new Animals();	
		spinks = (Cat)ani2;	//ani2 새로 만들면 Animals 객체만있기 때문에 강제형변환이 안 됨.
		*/
		//instanceof
		Animals a3 = new Cat();
		if(a3 instanceof Cat) {
			Cat cat1 = (Cat)a3;
			System.out.println("자식 클래스로 변환됨");
		}else {
			System.out.println("자식 클래스로 강제형변환할 수 없음");
		}
		
		Animals a4 = new Animals();
		if(a4 instanceof Cat) {
			Cat cat1 = (Cat)a4;
			System.out.println("자식 클래스로 변환됨");
		}else {
			System.out.println("자식 클래스로 강제형변환할 수 없음");
		}
	}

}
