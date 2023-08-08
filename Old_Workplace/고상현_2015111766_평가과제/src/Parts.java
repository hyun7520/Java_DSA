
public class Parts {
	
	private double max_load;
	private int battery;
	private double propeller;
	
	int change_bat(int k) {
		battery = k;
		return battery;
	}
	double change_prop(double n) {
		propeller = n;
		return propeller;
	}
	double change_load(double d) {
		max_load = d;
		return max_load;
	}
	
}
