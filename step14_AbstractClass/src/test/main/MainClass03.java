package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass03 {
	//inner class
	public static class OurWeapon extends Weapon{
		@Override
		public void attack() {
			System.out.println("지상이를 오지게 공격해요 ");
			
		}
	}
	
	public static void main(String[] args) {
		new OurWeapon();
		
		//추상 클래스 type 지역 변수 만들기
		Weapon w1=new OurWeapon();
		doSomething(w1);
	}
	
	//추상 클래스 type 의 참조값을 전달해야 호출할 수 있는 메소드
	public static void doSomething(Weapon w) {
		w.prepare();
		w.attack();
	}
}
