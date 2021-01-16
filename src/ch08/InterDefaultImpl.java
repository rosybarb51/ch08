package ch08;

// 디폴트메소드가 포함된 인터페이스를 상속받은 클래스
public class InterDefaultImpl implements InterDefault {

	@Override
	public void method1() {
		System.out.println("오버라이딩된 method1");
	}

	@Override
	public void method2() {
		System.out.println("오버라이딩된 method2");
	}
	
//	InterDefault 를 상속받았는데, 그 안의 default를 붙인 디폴트 메소드를 오버라이딩 안 해줘도 오류가 안 난다. 
//	default가 붙은 것은 일반적인 메소드이기 때문에 인터페이스를 상속받았을 경우 오버라이딩으로 재정의해줄 필요가 없음. 
//	부모의 메서드이기 때문에 오버라이딩해서 사용할 수 있음

	@Override
	public void defaultMethod() {
		System.out.println("InterDefaultImpl 클래스에서 오버라이딩한 defaultMethod");
	}
	
//	오버라이딩하여 추상 메서드로 변경할 수 있음(abstract 키워드 붙여서)
//	@Override
//	public abstract void defaultMethod();
	
}
