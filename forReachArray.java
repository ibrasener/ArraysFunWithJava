
public class forReachArray {

	public static void main(String[] args) {
		int [] myList= new int [5];
		for (int i=0; i <myList.length; i++) {
			myList[i]=(int)(Math.random()*myList.length);
		}
		for (int a : myList) {
			System.out.println(a);
		}
	}

}

