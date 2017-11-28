package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		//추상 클래스 type 지역변수 만들기
		Weapon w1=null;
		//추상 클래스 는 객체 생성이 안된다. 추상메소드를 가지고 있어서 단독 객체생성이 안됨
		//자식 객체를 부모 타입으로 받아야함.
		w1=new MyWeapon();
		//추상 클래스 type 의 참조값이 필요 하다면?
		doSomething(w1);
	}
	//추상 클래스 type 의 참조값을 전달해야 호출할 수 있는 메소드
	public static void doSomething(Weapon w) {
		w.prepare();
		w.attack();
	}
}
