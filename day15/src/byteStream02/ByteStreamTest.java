package byteStream02;

public class ByteStreamTest {
	/*
	 * 스트림의 특징
	 * - 단방향: 입력과 출력이 따로 존재
	 * - 선입선출(FIFO)
	 * - 딜레이 생길 수 있음
	 * 
	 * 스트림의 구분
	 * > 통로의 사이즈(1byte/2byte)
	 * - 바이트 스트림: 1Byte 단위로만 보내고 받을 수 있음
	 * - 문자 스트림: 2Byte 단위로만 보내고 받을 수 있음
	 * > 외부매체와 직접 연결 유무
	 * - 기반 스트림: 외부매체와 직접 연결 통로(필수)
	 * - 보조 스트림: 보조 역할만. 반드시 기반 스트림으로 연결이 돼있어야 사용가능
	 * 			   단독으로 사용 불가
	 * 
	 */

	public static void main(String[] args) {
		ByteStreamAPI bs = new ByteStreamAPI();
		//bs.fileSave();
		bs.fileRead();
	}
}
