package �����_2015111766;

public class LinearProbing<K, V> {
	
	private int M; // hash table�� ũ��
	private K[] a; // key ���� ���� ����
	private V[] d; // data ���� ���� ����
	
	public LinearProbing(int m) {
		M = m;
		a = (K[]) new Object[M];
		d = (V[]) new Object[M];
	}
	// hash�Լ� �������ֱ�
	private int hash(K key) {
		//& 0x7fffffff ������ ��� ����� �ٲ��ִ� �۾�
		return (key.hashCode() & 0x7fffffff) % M; // �ؽð� ����
	}
	// key ���� ���� data�� �� �ؽð� ����
	public void put(K key, V data) {
		int initialpos = hash(key);  // �ؽð� ����
		int i = initialpos, j = 1;
		do {
			if(a[i] == null) { // ����ִ� ������ ���
				a[i] = key;  // ó����ġ�� key�� �־��ֱ�
				d[i] = data; // data�� �Բ� �־��ֱ�
				break;
			}
			i = (initialpos + j++) % M;
		} while(i != initialpos); // ���ǽ��� false�� ��� do_while�� ����
	}
	
	public void hashtable() {
		System.out.println("�ؽ����̺�");
		
		// �ؽ����̺��� �ؽð� ���
		for(int i = 0; i < M; i++) {
			System.out.print(i+"\t"); // \t �� ���� ��
		}
		System.out.println();
		
		// Ű���� ��� �ؽð��� ������ �Ǿ����� �����ֱ�
		for(int i =0; i < M; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		
		// ��� data�� ����ִ��� Ȯ���ϱ�
		for(int i = 0; i<M; i++) {
			System.out.print(d[i]+"\t");
		}
		System.out.println();
	}
	// key ���� ���� Ž��
	public V get(K key) {
		int initialpos = hash(key);
		int i = initialpos, j = 1;
		while(a[i] != null) {
			if(a[i].equals(key))
				return d[i];
			i =(initialpos + j++) % M;
		}
		return null;
	}
}