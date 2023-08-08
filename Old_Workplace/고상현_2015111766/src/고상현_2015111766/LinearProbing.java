package 고상현_2015111766;

public class LinearProbing<K, V> {
	
	private int M; // hash table의 크기
	private K[] a; // key 값이 들어가는 공간
	private V[] d; // data 값이 들어가는 공간
	
	public LinearProbing(int m) {
		M = m;
		a = (K[]) new Object[M];
		d = (V[]) new Object[M];
	}
	// hash함수 지정해주기
	private int hash(K key) {
		//& 0x7fffffff 음수일 경우 양수로 바꿔주는 작업
		return (key.hashCode() & 0x7fffffff) % M; // 해시값 리턴
	}
	// key 값에 따른 data가 들어가 해시값 설정
	public void put(K key, V data) {
		int initialpos = hash(key);  // 해시값 설정
		int i = initialpos, j = 1;
		do {
			if(a[i] == null) { // 비어있는 공간인 경우
				a[i] = key;  // 처음위치에 key값 넣어주기
				d[i] = data; // data도 함꼐 넣어주기
				break;
			}
			i = (initialpos + j++) % M;
		} while(i != initialpos); // 조건식이 false일 경우 do_while문 종료
	}
	
	public void hashtable() {
		System.out.println("해시테이블");
		
		// 해시테이블의 해시값 출력
		for(int i = 0; i < M; i++) {
			System.out.print(i+"\t"); // \t 는 수평 탭
		}
		System.out.println();
		
		// 키값이 어느 해시값에 배정이 되었는지 보여주기
		for(int i =0; i < M; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		
		// 어떠한 data가 들어있는지 확인하기
		for(int i = 0; i<M; i++) {
			System.out.print(d[i]+"\t");
		}
		System.out.println();
	}
	// key 값에 대한 탐색
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