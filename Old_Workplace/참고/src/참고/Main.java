package Âü°í;
import java.util.Scanner;

class Pair <K, V> {
	public K first;
	public V second;
	Pair(K key, V value) {
		first = key;
		second = value;
	}
}

class HashTable {
	Pair<String, Integer>[] table;
	int size;
	int count = 0;
	HashTable(int m) {
		table = new Pair[m];
		size = m;
	}
	int hash(String key) {
		int h = key.hashCode() & 0x7fffffff;
		return h % size;
	}
	void put(String key, int value) {
		int h = hash(key);
		while(table[h] != null && !table[h].first.equals(key)) {
			h = (h+1) % size;
		}
		table[h] = new Pair(key, value);
	}
	Integer get(String key) {
		int h = hash(key);
		while(table[h] != null) {
			if(key.equals(table[h].first)) return table[h].second;
			h = (h+1) % size;
		}
		return null;
	}
	
	boolean contains(String key) {
		int h = hash(key);
		while(table[h] != null) {
			if(key.equals(table[h].first)) return true;
		}
		return false;
	}
	int size() {
		for(int i = 0; i < size; i++) {
			if(table[i] != null) count++;
		}
		return count;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashTable Substring = new HashTable(50);
		
		String a = sc.next();
		
		for(int i = 0; i < a.length(); i++) {
			for(int j = i + 1; j < a.length() + 1; j++) {
				String b = a.substring(i, j);
				Substring.put(b, 1);
			}
			
		}	
		
		System.out.println(Substring.size());

	}

}