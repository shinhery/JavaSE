package Section08;

public class Method03 {
	public static void main(String[] args) {
		
		
	int result = odd(10, 5)
			System.out.println("result: " + result);
	}
	
	// 7. 인자 o 리턴 i -> 인자값을 받아 실행(연산)한 후 반환값을 준다.
	public static int add(int a, int b) {
		return a + b;
	}

	// 오버로딩 메서드
	public static in add(int a, int b, int c) {
		int result = a + b + c;
		
		return result;
	}
}
