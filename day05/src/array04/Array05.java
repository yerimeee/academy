package array04;

public class Array05 {

	public static void main(String[] args) {

		// 서로 자리바꿈
		int a = 10;
		int b = 35;
		int chan = 0;
		
		chan = a;
		a = b;		//넣은 값이 앞으로 오면 됨ㅋ. a 넣었으니 a로 정의
		b = chan;	// 넣은 값이 b니까 b로 정의
		
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		
		// 로또 1~45 , 1. 배열 45개에 1~45까지 값 넣기 2. for문으로 index번호를 랜덤으로 추출하여 자리바꿈 하기
		int[] lotto = new int[45];
		for(int i=0; i<lotto.length; i++)
			lotto[i] = i+1;
		
		for(int i=0; i<6; i++) {		//로또가 6개 숫자니까 
			int index = (int)(Math.random()*45); //+1 안 하는 이유는 인덱스 번호를 추출하기 때문에 0~44까지 나와야해서.
			int tmp = lotto[i];
			lotto[i] = lotto[index];
			lotto[index] = tmp;		//여기까지는 랜덤으로 뽑힌 숫자들을 자리바꿈 한 것.
		}
		for(int i=0; i<6; i++)
			System.out.print(lotto[i] + ", ");
		
		System.out.println(" ");
		System.out.println("======================");
		
		// 중복제거로 6개만 추출
		int lotto2[] = new int[6];	//만들기만 하면 6개의 모든 칸은 0으로 들어가있음
		for(int i=0; i<lotto2.length; i++) {
			lotto2[i] = (int)(Math.random()*45)+1; //여기는 인덱스가 아니고 로또2에 값을 넣는 거라 로또는 0이 없고 1~45까지 필요.
			for(int j=0; j<i; j++) {	//j<i 거짓이거나 for문이 끝나면 j의 데이터는 사라지고 다시 0부터 시작됨.
				if(lotto[i] == lotto[j]) {
					i--;		//i와j가 같으면 인덱스값 i-1을 하고 for문 나와서 i-1 자리의 값과 또 비교해서 새로운 번호를 넣음.
					break;
				}
			}
		}
		for(int i=0; i<lotto2.length; i++)
		System.out.print(lotto[i] + ", ");
	}

}
