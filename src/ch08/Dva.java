package ch08;

public class Dva implements Attack, Movement {

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("디바가 왼쪽으로 이동합니다.");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("디바가 오른쪽으로 이동합니다.");
	}

	@Override
	public void forward() {
		// TODO Auto-generated method stub
		System.out.println("디바가 전진합니다.");
	}

	@Override
	public void backward() {
		// TODO Auto-generated method stub
		System.out.println("디바가 후진합니다.");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("디바가 융합포로 공격합니다.");
	}

	@Override
	public void skill() {
		// TODO Auto-generated method stub
		System.out.println("디바가 방어 매트릭스를 사용합니다.");
	}

	@Override
	public void specialSkill() {
		// TODO Auto-generated method stub
		System.out.println("디바가 궁극기인 자폭을 사용합니다.");
	}

}
