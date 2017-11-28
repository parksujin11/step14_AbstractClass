package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass04 {
	public static void main(String[] args) {
		class GuraWeapon extends Weapon{
			@Override
			public void attack() {
				System.out.println("구라를 공격해요 ");				
			}
		}
		Weapon w1=new GuraWeapon();
		doSomething(w1);
		
		//익명의 local inner class를 이용해서 Weapon type 객체 생성해서 참조값을 weapon type 변수에 담기
		Weapon w2=new Weapon(){
			//new 햐고 중괄호 안에
			@Override
			public void attack() {
				System.out.println("아무나 공격");
				 
			}
		};
		doSomething(w2);
	}
	//추상 클래스 type 의 참조값을 전달해야 호출할 수 있는 메소드
	public static void doSomething(Weapon w) {
		w.prepare();
		w.attack();
	}
}
