
public class youtubeArray {
	
	
	public static void main(String[] args) {
		
		double[] a;
		a= new double[10];
		
	//	int [ ] b=new int [10];
		/*
		for (int i = 0;i<10;i++) {
			a[i]=i+1;
			System.out.println("liste: "+a[i]);
		}
 		for(int i= 1; i<maxValues.length;i++) {
			if (maxValues[i] > max){
			max=maxValues[i];
				}
		}
		 */
		demonstrate(a);
		System.out.println();
		System.out.println(largest(a));
		
		System.out.println();
		Initializing(a);
		System.out.println();

		System.out.println(largest(a));
		
		
		}
		public static void Initializing(double []randomNum) {
			for(int i= 0; i<randomNum.length;i++) {
				randomNum[i]= Math.random()*2;
				System.out.println("uu"+randomNum[i]);
			}
			
			
		}
		public static double largest(double[] maxValues) {
			double max=maxValues[0];
			for(int i= 1; i<maxValues.length;i++) {
				if (maxValues[i] > max){
					max=maxValues[i];
				}
			}
			return max;
			
		}
		public static void demonstrate(double[] a) {
			
		for (int i=0;i<10;i++) {
			//integer is  already declared so Only things you need
			// to a[i] this one it will work
			System.out.println("a "+a[i]);
				}
		for (int i = 0;i<10;i++) {
			a[i]=i+1;
			System.out.println("liste: "+a[i]);
		}
		}
	}


