
public class VehicleDemo {

	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		int range;
		// atribuindo valores ao objeto
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		//calculando autonomia do objeto
		range = minivan.fuelcap * minivan.mpg;
		System.out.println("Minivan can cary " + minivan.passengers + " width a range of " + range);
	}

}
