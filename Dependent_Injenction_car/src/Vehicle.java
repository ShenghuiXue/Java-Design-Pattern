
public class Vehicle {
	Engine racingEngin;

	public Vehicle(Engine racingEngin) {
		super();
		this.racingEngin = racingEngin;
	}
	
	public void crankInition() {
		racingEngin.startEngine();
	}
}
