package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		//�߻� Ŭ���� type �������� �����
		Weapon w1=null;
		//�߻� Ŭ���� �� ��ü ������ �ȵȴ�. �߻�޼ҵ带 ������ �־ �ܵ� ��ü������ �ȵ�
		//�ڽ� ��ü�� �θ� Ÿ������ �޾ƾ���.
		w1=new MyWeapon();
		//�߻� Ŭ���� type �� �������� �ʿ� �ϴٸ�?
		doSomething(w1);
	}
	//�߻� Ŭ���� type �� �������� �����ؾ� ȣ���� �� �ִ� �޼ҵ�
	public static void doSomething(Weapon w) {
		w.prepare();
		w.attack();
	}
}
