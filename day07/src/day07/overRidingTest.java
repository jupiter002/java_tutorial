package day07;

class Weapon{
	int fire() {
		return 1;
	}
	
// 오버로드	
//	int fire(int damage) {
//		return damage;
//	}
}

class Canon extends Weapon{
	
	@Override
	int fire() {
		return 10;
	}
	
}




public class overRidingTest {
	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		int weaponDamage = weapon.fire();
		System.out.println("weapon의 데미지는 " + weaponDamage);
		// 동적 바인딩
		weapon = new Canon();
		int canonDamage = weapon.fire();
		System.out.println("Canon의 데미지는 " + canonDamage);
	}
}
