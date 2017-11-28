package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass03 {
	//inner class
	public static class OurWeapon extends Weapon{
		@Override
		public void attack() {
			System.out.println("�����̸� ������ �����ؿ� ");
			
		}
	}
	
	public static void main(String[] args) {
		new OurWeapon();
		
		//�߻� Ŭ���� type ���� ���� �����
		Weapon w1=new OurWeapon();
		doSomething(w1);
	}
	
	//�߻� Ŭ���� type �� �������� �����ؾ� ȣ���� �� �ִ� �޼ҵ�
	public static void doSomething(Weapon w) {
		w.prepare();
		w.attack();
	}
}
