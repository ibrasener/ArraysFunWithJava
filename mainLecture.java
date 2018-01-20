import java.util.Scanner;
public class mainLecture {
	
	public static void main (String []args) {
		Scanner input=new Scanner(System.in);
		MarketList list=new MarketList(10);
		// marketList is class we need to put object name
		list.addingList("apple");
		list.addingList("bannana");
		list.addingList("apricot");
		list.addingList("chocolate");
		/*
		System.out.println("First view++++++++++");
		list.show();		

		
		list.eraseTheEnd();	
		System.out.println("delete last+++++++");
		list.show();		

		list.eraseTheFirst();
		System.out.println("delete first++++++++++");
		list.show();	
		*/
		System.out.println("On the list ");

		list.show();

		
		System.out.print("What is your index for erasing the number: ");
		int a=input.nextInt();
		list.eraseWhereYouwant(a);
		
		System.out.println("At the end ___+++_+_+_+");
		list.show();
		// 2 yani 3. siradaki apricotu siler
		
		System.out.println("At the end What would like to add index position");
		int indexNum=input.nextInt();
		System.out.println("At the end What would like to add String name");
		String foodName=input.next();
		
		list.addingWhereYouWant(foodName, indexNum);
	
		list.show();
	}
	
	
}

