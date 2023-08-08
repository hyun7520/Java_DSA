
public class GasStation {
	
	private int remain;
	
	public void set_gas(int re) {
		remain = re;
	}
	public void show() {
		System.out.println("현재 잔여량 : "+remain);
	}
	
	int refuel (int g) {
		if(remain < g) {
			return -1;
		}
		remain -= g;
		return g;
	}
}

