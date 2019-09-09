
public class LargeEngine implements Engine {
	
	private int horsePower;
	
	public LargeEngine(int horsePower) {
		super();
		this.horsePower = horsePower;
	}

	@Override
	public void startEngine() {
		System.out.println("start large "+ horsePower + " hp engine.");
	}
}
