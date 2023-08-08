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
	HashTable(int m) { //hash ���� ��� ���� �Լ�
		table = new Pair[m];
		M = m;
	}
	int hash(String key) { //hash ���� ��� ���� �Լ�	
		int h = key.hashCode() & 0x7fffffff; //������ ����� 
		return h % M;
	}
	void put(String key, int value) { //key ���� ���� value���� �����ϱ� ���� �Լ�
		int h = hash(key); // key�� �ԷµǸ� Mũ�� ��ŭ�� ������ hash �Լ��� ���� �迭�� �ε����� ���´�
		while(table[h] != null) {  // ����ִ� ������ ã�Ƽ� �����͸� �ְ� ��
			h = (h+1) % M;
		}
		table[h] = new Pair(key, value);
	}
	Integer get(String key) { //key���� ���� ���� �����Ѵ� ��� �� ��ȯ, �׷��� ������ null ��ȯ
		int h = hash(key); 
		while(table[h] != null) {
			if(key.equals(table[h].first)) return table[h].second;
			h = (h+1) & M; //���� �ʴٸ� ���� �ε�����
		}
		return null; // ����ִٸ� �Էµ� ���� �����Ƿ� null�� ����	
	}
	void remove(String key) { // key ���� ���� �׸� ����
	}
	boolean contains(String key) { //. �ش� key�� �����ϴ��� �˻�
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
