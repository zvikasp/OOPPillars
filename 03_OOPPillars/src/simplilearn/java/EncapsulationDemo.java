package simplilearn.java;

public class EncapsulationDemo {

	private String Name;
	private int Roll;
	private int Age;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getRoll() {
		return Roll;
	}

	public void setRoll(int roll) {
		Roll = roll;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setName("Harsh");
		obj.setRoll(19);
		obj.setAge(51);
		System.out.println("My name: " + obj.getName());
		System.out.println("My age: " + obj.getAge());
		System.out.println("My roll: " + obj.getRoll());
	}

}
