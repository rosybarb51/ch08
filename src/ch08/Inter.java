package ch08;

public interface Inter {
//	인터페이스의 멤버 : 상수(static final..), 정적메서드, 디폴트 메서드(1.8에서 추가), 추상메서드
//	객체 생성 불가 - 그래서 static이 붙은 상수와 정적메서드 사용 가능함, 디폴트 메서드는 추가 기능을 위해 추가됨.
	
//	접근제한자는 public, 반환값은 없고, 메서드의 원형, 선언부만 만들어줌.
//	public 생략해도 자동으로 인식함.
	public void method1();
	public void method2();
	public void method3();
}
