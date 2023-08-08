
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10, b = 20;
		
		int[] arr= {10, 20};
		System.out.println("a=" +arr[0]+ "b "+arr[1]);
		
		//swap은 call by reference로 (value는 한가지 값만 반환 가능)
		/*int temp;
		temp = a;
		a = b;
		b = temp;*/
		
		swap(arr);

	}
	
	static void swap(int[] brr) { //int[] brr = arr;
		int temp;
		temp = brr[0];
		brr[0] = brr[1];
		brr[1] = temp;
	}

}
