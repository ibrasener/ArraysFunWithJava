
public class MarketList {
	
	//String [] list;
	String []list;
	int limited;
	int addingNum;
	
	public MarketList(int capacity) {
	list = new String [capacity];
	addingNum=0;
	limited=capacity;
	System.out.print(capacity+"\n");
	}

	public void addingList(String adding) {
		if (addingNum<limited) {
			list[addingNum] = adding; 
			//a[0]= herangi bir string
			
			addingNum++;
		}
		else {
			System.out.println("no output");
        }
		
	}
	public void show() {
		for (int i = 0; i<addingNum;i++)
		System.out.println(list[i]);
		
	}
	public void eraseTheEnd() {
		
		addingNum--;
		list[addingNum]="";
	}
	public void eraseTheFirst(){
		for (int i=0; i<addingNum-1;i++) {
			list[i]=list[i+1];
			
		}
		addingNum--;
	}
	public void eraseWhereYouwant(int index) {
		for (int i =index; i < addingNum-1;i++) {
			list[i]=list[i+1];
		}
		addingNum--; 
		// bu metod indexten sonralari saga kaydiriyor
	}
	public void addingWhereYouWant(String adding,int index) {
		// kaydirmak gerekiyor eklenen 1 er saga
		if(index <= addingNum && index>=0) {
		for (int i =addingNum-1; i >=index ;i--) { //  right shift
			list[i+1]=list[i+1];
		}
		list[index]=adding;
		addingNum++;
		}
		else {
			System.out.println("Wrong answer");
		}
	}
}
