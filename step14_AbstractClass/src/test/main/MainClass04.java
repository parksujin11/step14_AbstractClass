package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass04 {
	public static void main(String[] args) {
		class GuraWeapon extends Weapon{
			@Override
			public void attack() {
				System.out.println("���� �����ؿ� ");				
			}
		}
		Weapon w1=new GuraWeapon();
		doSomething(w1);
		
		//�͸��� local inner class�� �̿��ؼ� Weapon type ��ü �����ؼ� �������� weapon type ������ ���
		Weapon w2=new Weapon(){
			//new ��� �߰�ȣ �ȿ�
			@Override
			public void attack() {
				System.out.println("�ƹ��� ����");
				 
			}
		};
		doSomething(w2);
	}
	//�߻� Ŭ���� type �� �������� �����ؾ� ȣ���� �� �ִ� �޼ҵ�
	public static void doSomething(Weapon w) {
		w.prepare();
		w.attack();
	}
}
