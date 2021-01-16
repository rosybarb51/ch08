package ch08;
// 위의 RemoteControl 인터페이스와 사실 똑같지만, 얘는 클래스라서 다중상속이 안된다. 단일상속만 된다.

// 추상 클래스로 선언한 RemoteControl
public abstract class RemoteControlClass {
	public final static int MAX_VOLUME = 10;
	public final static int MIN_VOLUME = 0;
	
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	public void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		}
		else {
			System.out.println("무음 해체합니다.");
		}
	}
	
	public static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
}
