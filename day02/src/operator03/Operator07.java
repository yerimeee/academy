package operator03;

public class Operator07 {

	public static void main(String[] args) {

		int x, y, z;
		int absX, absY, absZ;
		
		x=40;
		y=-9;
		z=0;
		
		absX = x >= 0 ? x : -x;
		System.out.println(absX);
		absY = y >= 0 ? y : -y;
		System.out.println(absY);
		System.out.println("=======");
		
		// 양수일 땐 + 기호를, 음수일 땐 - 기호를, 0은 0으로 출력하시오.
		String signX = x > 0 ? "+" + x : "" + x;				
		System.out.println(signX);
		 String signY = y > 0 ? "+" + y : "" + y;
		System.out.println(signY);
		String signZ = z > 0 ? "+" + z : (z==0 ? "" + z : "" + z);
		// signZ = z > 0 ? "+" + z : "" + z; 도 가능
		System.out.println(signZ);		
		//이거 개어렵다..............
	}

}
