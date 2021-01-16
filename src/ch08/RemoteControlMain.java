package ch08;

public class RemoteControlMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		Audio audio = new Audio();
		
//		인터페이스의 멤버(코드블럭 X) 오버라이딩하여 사용.
		tv.turnOn();
		tv.setVolume(15);
		tv.setMute(true);
		tv.turnOff();
		
		audio.turnOn();
		audio.setMute(false);
		audio.setVolume(-10);
		audio.turnOff();
		
//		->tv, audio의 기본 사용방식이 통일됨."인터페이스"에 의해서!!
//		->규격화됨.
		
//		추상클래스도 규격화되지만, 인터페이스를 사용하는 이유는
//		추상클래스는 일반메서드도 추가 할 수 있어서 완벽한 형태의 규격화를 할 수 없다.
//		그래서 인터페이스를 사용함.
		

		System.out.println("------ interface의 다형성 ------");
//		인터페이스도 다형성 구현이 가능함
//		->인터페이스 타입의 변수는 생성이 가능함(new해서 객체화는 불가)
//		인터페이스 타입의 변수에 구현 클래스 타입의 객체를 대입할 수 있음
		
//		부모 타입의 멤버를 이용해서 자식 타입의 객체를 사용할 수 있는 것처럼..
		RemoteControl rc;
		rc = tv; 
		rc.turnOn();
		rc.setMute(true);
		rc.setVolume(5);
		rc.turnOff();
		
		rc = audio;
		rc.turnOn();
		rc.setMute(false);
		rc.setVolume(8);
		rc.turnOff();
		

		System.out.println("------ 추상 클래스로 구현한 RemoteControl ------");
		
		Television tv2 = new Television();
		Audio audio2 = new Audio();
		
		tv2.turnOn();
		tv2.setVolume(15);
		tv2.setMute(true);
		tv2.turnOff();
		
		audio2.turnOn();
		audio2.setMute(false);
		audio2.setVolume(-10);
		audio2.turnOff();
		
		System.out.println("------ 추상 클래스로 구현한 RemoteControl의 다형성 ------");
		
		RemoteControlClass rcc;
		
//		rcc = tv2; 
//		rcc.turnOn();
//		rcc.setMute(true);
//		rcc.setVolume(5);
//		rcc.turnOff();
//		
//		rcc = audio2;
//		rcc.turnOn();
//		rcc.setMute(false);
//		rcc.setVolume(8);
//		rcc.turnOff();
		
		System.out.println("\n---- 익명 구현 객체 사용 ----\n");
		
//		익명 구현 객체 사용
//		익명 구현 객체도 클래스임. 
//		이름이 없을 뿐이지..
//		익명이기 때문에 상속이 안됨, 인터페이스로부터 상속받은 모든 추상메서드를 필수로!! 구현해야함.
		
		RemoteControl rc1 = new RemoteControl() {
			private int volume; // 클래스의 멤버 변수, 내부적으로 사용하는 것만 허락.
			
			@Override
			public void turnOn() {
				System.out.println("전원이 켜집니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("전원이 꺼집니다.");
			}
			
			@Override
			public void setVolume(int volume) {
				if (volume > RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
					}
				else if (volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				}
				else {
					this.volume = volume;
				}
				
				System.out.println("현재 볼륨은 " + this.volume);
			}
		};
		
//		사용 방법은 동일함
		rc1.turnOn();
		rc1.setVolume(10);
		rc1.setMute(true);
		rc1.turnOff();
		
		
	}

}














































