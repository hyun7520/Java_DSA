package �����_2015111766;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("��������");
		System.out.println("�ؽ����̺�");
		
		// �����ϼ���
		// (key.hashCode()& 0x7fffffff) % M ��� �Լ��� ���� ���
		System.out.println();
		System.out.println("�ؽ��Լ�(key) : �ؽð�");
		System.out.println("hash(71) :"+(71 & 0x7fffffff) % 10);
		System.out.println("hash(23) :"+(23 & 0x7fffffff) % 10);
		System.out.println("hash(73) :"+(73 & 0x7fffffff) % 10);
		System.out.println("hash(49) :"+(49 & 0x7fffffff) % 10);
		System.out.println("hash(54) :"+(54 & 0x7fffffff) % 10);
		System.out.println("hash(89) :"+(89 & 0x7fffffff) % 10);
		System.out.println("hash(39) :"+(39 & 0x7fffffff) % 10);
		
		LinearProbing<Integer, String> fruit = new LinearProbing<Integer, String>(10);
		fruit.put(71, "grape");
		fruit.put(23, "apple");
		fruit.put(73, "banana");
		fruit.put(49, "cherry");
		fruit.put(54, "mango");
		fruit.put(89, "lime");
		fruit.put(39, "orange");
		fruit.hashtable();
	}

}
