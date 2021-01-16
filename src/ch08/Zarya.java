package ch08;

public class Zarya implements Movement, Attack {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("자리야가 입자포로 공격합니다.");
	}

	@Override
	public void skill() {
		// TODO Auto-generated method stub
		System.out.println("자리야가 입자 방벽을 사용합니다.");
	}

	@Override
	public void specialSkill() {
		// TODO Auto-generated method stub
		System.out.println("자리야가 궁극인 중력자탄을 사용합니다.");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("자리야가 왼쪽으로 이동합니다.");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("자리야가 오른쪽으로 이동합니다.");
	}

	@Override
	public void forward() {
		// TODO Auto-generated method stub
		System.out.println("자리야가 전진합니다.");
	}

	@Override
	public void backward() {
		// TODO Auto-generated method stub
		System.out.println("자리야가 후진합니다.");
	}
	
	

}
