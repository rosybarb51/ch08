package ch08;

public class OverWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		인터페이스의 다형성
//		클래스의 다형성은 자식클래스에서 또 새로 메서드를 만들 수 도 있기 때문에 지저분하게 나온다.
//		이렇게 인터페이스를 사용하면 똑같은 형태만 사용해야해서 깔끔하다. 
		Player player = new Player();
		Character ch;
		ch = new McCree();
		
		player.cMove(ch);
		player.cStop(ch);
		player.cAttack(ch);
		player.cSkill(ch);
		
		ch = new Genzi();
		
		player.cMove(ch);
		player.cStop(ch);
		player.cAttack(ch);
		player.cSkill(ch);
	}

}
