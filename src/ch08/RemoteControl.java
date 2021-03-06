package ch08;

// 인터페이스가 가질 수 있는 멤버는 정적멤버(상수, 정적메서드), 추상메서드, 디폴트 메서드 
public interface RemoteControl {
//	static 키워드가 빠져도 상관없음
//	=>인터페이스가 가질 수 있는 멤버 변수는 상수 밖에 없기 때문에 final static 키워드가 빠져도 상관없음.
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
//	abstract 키워드 넣어도 되고, 빼도 상관 없음.
//	=>인터페이스가 가질 수 있는 메서드는 추상 메서드밖에 없기 때문에 abstract 키워드를 제거해도 상관없음.
//	밑에처럼 abstract 빼면 상수 혹은 static 이 아닌 것 확인하고 자동으로 abstract로 처리함.
	public abstract void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
//	default 메서드는 일반 메서드와 동일하게 사용함.
//	default 키워드를 !반드시! 사용, public 접근제한자가 기본이다. 
	public default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		}
		else {
			System.out.println("무음 해체합니다.");
		}
	}
	
//	정적 메서드도 인터페이스의 멤버
//	public 접근제한자가 기본임.
	public static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
	
}





























