
public class ArrayFromMethodReverse {

	public static void main(String[] args) {
		
	  int []	 list= {1,2,3,4,5,6};
	  int [] list2= reverse(list);
	  System.out.println(list2[0]);
	  for(int a:list2) {
		  System.out.println(a);
	  }
	}
	public static int [] reverse(int [] MainArray) { //MainArrayi tanimlamam sart asagida
		int []ReverseArray = new int [MainArray.length];
		// i is declared above list j is declare potential reverse number 
		//j and ReverseArray 
		// i and MainArray
		for (int i=0, j=ReverseArray.length-1; i<MainArray.length; i++,j--) {
			ReverseArray[j]=MainArray[i];
		}
		return ReverseArray;
		
	}

}
