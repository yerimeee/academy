package langPackage03;

public class Value {
	int value;
	Value(int value) {
		this.value = value;
	}
	
	@Override	//무조건 자식 것이 호출
	public boolean equals(Object o) {	//Override에선 Object로 써줘야함
		return value == ((Value)o).value;
		//Object 타입의 o를 자식 타입으로 변환시켜 Value타입의 객체 o가 가지고있는 변수 value값과 int value값과 같은가?
		
		/*
		if(o instanceof Value)	//부모에서 자식으로 강제형변환했기 때문에 instanceof를 써준 것임
			return value == ((Value)o).value;
		else
			return false;
			*/
	}
}
