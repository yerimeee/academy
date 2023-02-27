package abstract01;

public class AnimalTest {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		Pish pish = new Pish();
		
		dog.sound();
		cat.sound();
		pish.sound();
		System.out.println("----------------------------");
		
		//추상클래스는 객체 생성 안 됨.
		//Animal a = new Animal();
		
		//자식을 부모로 형변환은 가능
		Animal ani = dog;	// 오버라이딩은 무조건 자식의 값이 호출됨
		ani.sound();
		
		ani = cat;
		ani.sound();
		
		ani = pish;
		ani.sound();
		System.out.println("----------------------------");
		
		aniSound(new Cat());
		aniSound(new Dog());
		aniSound(new Pish());
	}
	static void aniSound(Animal ani) {	//여러번 호출하는 것들은 메소드로 정의해놓고 여러번 호출 가능
		ani.sound();
	}

}
