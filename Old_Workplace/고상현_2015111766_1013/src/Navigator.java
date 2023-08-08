
class Navigator {
	private int shortestPath;
	// 5개에서 10개이내 도로
	int find() {
		shortestPath = 5+(int)(Math.random()*6);
		return shortestPath;
	}

	void monitor() {
		System.out.println("\n-----------------네비화면------------------");
		System.out.println("\n  목적지까지 도로개수: "+shortestPath);
		System.out.println("\n-----------------------------------------");
		
	}
}
