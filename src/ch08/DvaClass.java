package ch08;

// 인터페이스가 아닌 클래스를 여러 개 상속 받고 싶을 땐, 다중 상속이 안되기 때문에, 어택클래스를 무브먼트 클래스에 상속 받게 하고, 그 어택클래스를 우리가 사용할 디바클래스가 다시 상속 받으면 아래로 다 상속받아서 된다.

// 그러나 여기서 체력이라는 클래스를 추가적으로 사용하고 싶다면, 복잡해진다. 
public class DvaClass extends AttackClass {
	@Override
	public void left() {
		System.out.println("디바가 왼쪽으로 이동합니다.");
	}
	
	@Override
	public void right() {
		System.out.println("디바가 오른쪽으로 이동합니다.");
	}
	
	@Override
	public void forward() {
		System.out.println("디바가 앞으로 전진합니다.");
	}
	
	@Override
	public void backward() {
		System.out.println("디바가 뒤로 후진합니다.");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("디바가 공격합니다.");
	}

	@Override
	public void skill() {
		// TODO Auto-generated method stub
		System.out.println("디바가 스킬을 사용합니다.");
	}

	@Override
	public void specialSkill() {
		// TODO Auto-generated method stub
		System.out.println("디바가 궁극기를 사용합니다.");
	}
}
