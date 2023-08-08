
class Car {
	private int fuel;
	
	public void set_gas(int fu) {
		fuel = fu;
	}
	public void show() {
		System.out.println("현재 주유량: "+fuel);
	}
	
	public void fill_gas(int give, GasStation GS) {
		if(give == GS.refuel(give))
			fuel += give;
		else
			System.out.println("주유실패");
		
	}

}
