package simplilearn.java;

class Bicycle {
	public int gear;
	public int speed;

	public Bicycle(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}

	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}

	@Override
	public String toString() {
		return "Bicycle gear=" + gear + ", speed=" + speed + "";
	}
}

class MountainBike extends Bicycle {

	public int seatHeight;
	
	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
	}

	@Override
	public String toString() {
		return "MountainBike + [" + super.toString() + " seatHeight=" + seatHeight + "]";
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		MountainBike mb = new MountainBike(3, 100, 24);
		System.out.println(mb.toString());
	}

}
