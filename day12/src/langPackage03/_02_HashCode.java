package langPackage03;

public class _02_HashCode {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));	//값이 같은가? ㅇㅇ
		System.out.println(str1 == str2); //주소가 같은가? ㄴㄴ
		System.out.println(str1.hashCode()); //해시코드는 같은가? ㅇㅇ
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));	//고유로 가지고 있는 해시코드
		System.out.println(System.identityHashCode(str2));
		
		//값이 다 다르기 때문에 오버라이딩을 해줌으로써 모두 동일한 결과가 나오도록 함. 고유 해시코드는 고유라서 안 바뀜
	}

}
