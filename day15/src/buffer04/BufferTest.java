package buffer04;

public class BufferTest {
	/*
	 * 보조 스트림: 기반스트림만으로는 부족한 성능을 보다 향상 시켜주는 스트림
	 * 			기반스트림에서 제공하지 않는 추가적인 메소드 제공
	 * 			속도 향상 등등
	 * 	>>외부매체와 직접 연결 안 됨
	 * 		단독사용 불가(반드시 기반 스트림과 함께)
	 */
	public static void main(String[] args) {
		BufferAPI bf = new BufferAPI();
		bf.fileSave();//한 번 저장하면 주석 처리해도 됨
		bf.fileRead();
	}
}
