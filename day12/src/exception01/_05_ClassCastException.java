package exception01;
class Animal{};
class Dog extends Animal{};
class Cat extends Animal{};

public class _05_ClassCastException {
	public static void main(String[] args) {
	try {
		Dog dog = new Dog();
		Animal ani = dog;	//자식을 부모타입으로 변환
		Dog dog1 = (Dog)ani;	//부모타입을 자식타입으로 강제 변환
		System.out.println("Dog 타입으로 변경");
		
		Animal ani2 = new Animal();
		Cat cat = (Cat)ani2;	//부모타입을 바로 자식타입으로 강제 변환해서 오류.
		System.out.println("Cat 타입으로 변경");
	}catch(ClassCastException e) {
			System.out.println("클래스 타입 변경 불가");
		}
	}

}
