import java.util.Scanner;

class Pair<K, V> {
	public K first;
	public V second;
	Pair(K key, V value) {
		first = key;
		second = value;
	}
}

class HashTable { //hash table constructor
	Pair<String, Integer>[] table; //hash table array
	int M;					       //hash table size 		
	HashTable(int m) { //hash 값을 얻기 위한 함수
		table = new Pair[m];
		M = m;
	}
	int hash(String key) { //hash 값을 얻기 위한 함수	
		int h = key.hashCode() & 0x7fffffff; //무조건 양수로 
		return h % M;
	}
	void put(String key, int value) { //key 값을 가진 value값을 저장하기 위한 함수
		int h = hash(key); // key가 입력되면 M크기 만큼의 공간에 hash 함수를 통해 배열의 인덱스를 얻어온다
		while(table[h] != null) {  // 비어있는 공간을 찾아서 데이터를 넣게 됨
			h = (h+1) % M;
		}
		table[h] = new Pair(key, value);
	}
	Integer get(String key) { //key값을 가진 것이 존재한느 경우 값 반환, 그렇지 않으면 null 반환
		int h = hash(key); 
		while(table[h] != null) {
			if(key.equals(table[h].first)) return table[h].second;
			h = (h+1) & M; //같지 않다면 다음 인덱스로
		}
		return null; // 비어있다면 입력된 값이 없으므로 null을 리턴	
	}
	void remove(String key) { // key 값을 가진 항목 삭제
	}
	boolean contains(String key) { //. 해당 key가 존재하는지 검사
		int h = hash(key);
		while(table[h] != null) {
			if(key.equals(table[h].first)) return true;
			h = (h+1) % M;
		}
		return false;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashTable map = new HashTable(13);
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("six", 6);
		map.put("seven", 7);
		map.put("eight", 8);
		map.put("nine", 9);
		map.put("ten", 10);
		while(true) {
			System.out.println("ht> ");
			String cmd = sc.next();
			if(cmd.equals("quit")) break;
			if(cmd.equals("add")) {
				String key = sc.next();
				int value = sc.nextInt();
				map.put(key, value);
			}
			else if(cmd.equals("find")) {
				String key = sc.next();
				Integer value = map.get(key);
				if(value == null)
					System.out.println(key+" is not found.");
				else
					System.out.println("Value for "+key+" is "+value+".");
			}
		}
		/*System.out.println("one is "+map.get("one"));
		System.out.println("five is "+(map.contains("five")?"":"not ")+"in map");*/
	}

}
