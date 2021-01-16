package ch08;

public class OverWatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zarya z = new Zarya();
		Winston w = new Winston();
		Dva d = new Dva();
		
		z.forward();
		z.attack();
		z.skill();
		z.specialSkill();
		
		w.left();
		w.right();
		w.skill();
		w.attack();
		
		d.backward();
		d.skill();
		d.attack();
		d.specialSkill();
		
		
		
		System.out.println("\n---- 추상 클래스로 구현 ----\n");
		DvaClass dc = new DvaClass();
		dc.attack();
		dc.skill();
		
		
		System.out.println("\n ---- 인터페이스의 다중 상속 시 다형성 ---- \n");
		Movement vm = null;
		Attack va = null;
		
		vm = z; // 부모타입의 변수에다가 자식타입의 변수를 넣어서 부모타입의 것에 자식타입의 멤버를 넣어서 결과를 볼 수 있음
//		현재 vm 껍데기는 무브먼트 이지만 알맹이는 자리야 넣음 z
//		부모 인터페이스 타입의 변수에 구현 클래스 타입의 객체를 대입하였기 때문에 부모 인터페이스의 멤버만 사용이 가능. 
		vm.left();
		vm.right();
		vm.forward();
		vm.backward();
//		vm.skill();
//		vm.attack(); // 오류남 - attack(), skill() 은 Attack 인터페이스의 멤버이므로 오류가 발생
		
//		va는 어택이라서 사용 가능함
		va = z;
		va.attack();
		va.skill();
		va.specialSkill();
		
//		===> 위의 오류 문제 해결하려면 인터페이스에 구현 객체를 대입
		
//		인터페이스의 상속
		Character2 ch2 = null;
		ch2 = new Sombra();
		ch2.attack();
		ch2.left();
		ch2.right();
		ch2.specialSkill();
	}

}





















