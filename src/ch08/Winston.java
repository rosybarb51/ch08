package ch08;

public class Winston implements Attack, Movement {

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("윈스턴이 왼쪽으로 이동합니다.");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("윈스턴이 오른쪽으로 이동합니다.");
	}

	@Override
	public void forward() {
		// TODO Auto-generated method stub
		System.out.println("윈스턴이 앞으로 전진합니다.");
	}

	@Override
	public void backward() {
		// TODO Auto-generated method stub
		System.out.println("윈스턴이 후진합니다.");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("윈스턴이 테슬라 캐논으로 공격합니다.");
	}

	@Override
	public void skill() {
		// TODO Auto-generated method stub
		System.out.println("윈스턴이 점프 팩을 사용합니다.");
	}

	@Override
	public void specialSkill() {
		// TODO Auto-generated method stub
		System.out.println("윈스턴이 궁극기인 원시의 분노를 사용합니다.");
	}

}
