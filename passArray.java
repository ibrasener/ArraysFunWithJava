
public class passArray {

	public static void main(String[] args) {
			//swap
		int [] a= {1,2};
		// I need to type integer
		swap(a[0],a[1]);
		System.out.println(a[0]+"\n"+ a[1]+"\n");
			// abi bu degisterme metodu bunu print diye yazamazsin
		swapFirst2Number(a);
		System.out.println(a[0]+" "+ a[1]); // simdi degismis oluyor

	}
	
	
	public static void swap(int number1, int number2) {
		int temp= number1;
		number1=number2;
		number2=temp;
		System.out.println(number1+" "+number2);
	}
	
	public static void swapFirst2Number(int [] array) { // its going to change first 2 array
		int temp = array[0];
		array[0]=array[1];
		array[1]=temp;
		//System.out.println(array);

	}
}
