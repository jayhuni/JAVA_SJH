package Day06.Ex04_02_AccessModifier;

import Day06.Ex04_01_AccessModifier.Person;

public class Student extends Person {

	public Student() {
		
	}

	public Student(String name, int height, int age, int weight) {
		super(name, height, age, weight);
	
	}
	public void defaultSetting() {
		name = "이름없음";	// public은 모든 곳에서 접근가능
		height = 160;		// protected는 같은 패키지 안 이거나 상속받은 메소드에서만 접근가능
		//age = 20;			// default는 같은 패키지 안에서만 접근가능
		//weight = 50;		// private은 애당 클래스에서만 접근가능
		setAge(20);
		setWeight(50);
		
	}
}
