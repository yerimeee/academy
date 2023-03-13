package generics;

public class Parking<E> { 
	//<E>: 자료형 타입 정의. 대문자 한 글자를 많이 씀
	//일반자료형은 들어올 수 없고 Object인 Wrapper클래스 또는 내가 만든 클래스 들어옴
	private E[] elemen;
	private int index;
	
	public Parking() {
		this.elemen = (E[]) new Object[16];
	}
	
	public void add(E e) {
		this.elemen[index++] = e;
		//인스턴스 변수 index는 초기화값 0부터이기 때문에 index++함
	}
	
	public E get(int index) {
		return this.elemen[index];
	}
	public int size() {
		return this.index;
	}
	
	public int indexOf(E e) {
		//반복문으로 elemen배열에서 객체 t를 검색하여 있으면 해당 인덱스 번호 반환
		for(int i=0; i<index; i++) {
			if(this.elemen[i].equals(e))
				return i;
		}
		//찾는 객체가 없으면
		return -1;
	}
}
