
class Navigator {
	private int shortestPath;
	// 5������ 10���̳� ����
	int find() {
		shortestPath = 5+(int)(Math.random()*6);
		return shortestPath;
	}

	void monitor() {
		System.out.println("\n-----------------�׺�ȭ��------------------");
		System.out.println("\n  ���������� ���ΰ���: "+shortestPath);
		System.out.println("\n-----------------------------------------");
		
	}
}
