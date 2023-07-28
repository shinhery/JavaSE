package Section08;

/*
 * VO(Value Object), DTO(Data Transfer Object)
 * 	값 오브젝트로써 목적의 맞는 변수의 집합.
 * Database 또는 네트워크 통신 값 운반용으로 사용.
 * 
 * 캡슐화(정보은닉) - 객체의 속성과 행위를 하나로 묶고 외부로부터 내부를 감싸 숨겨 은닉한다.
 * 
 * strName -> 낙타표기법(
 */

public class Method05 {
	private static void main(String[] args) {
		MemberVO memberVO = new MemberVO();
		
		String id = memberVO.getId();
		String name = memberVO.getName();
		int age = memberVO.getAge();
		
		System.out.println("id: " + id);
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		
	}

}