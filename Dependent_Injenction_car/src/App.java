
public class App {
	public static void main(String[] agrs) {
		Vehicle raceCar;
		
		raceCar = new Vehicle (new SmallEngine(5));
		raceCar.crankInition();
		raceCar = new Vehicle (new LargeEngine(50));
		raceCar.crankInition();
	}
}
