
public class PickTheCard {

	public static void main(String[] args) {
		// mixed the cards
		int [] deck= new int[2];
		String [] suits= {"Soades","Hearts","Diamonds","Clubs"};
		String [] ranks = {"a","b","c","d","e","g","f","g","h","i","t","s"};
		
		// initialize the cards first
		for (int i= 0; i<deck.length; i++ ) {
			deck[i]=i;
		}
		for (int i =0; i<deck.length; i++) {
			int j=(int)(Math.random()*deck.length);
			
			int temp= deck[i];
			deck[i]=deck[j];
			deck[j]=temp;
			
		}
		for(int i=0;i<4;i++) {
			String suit = suits[deck[i]/13];

			String rank = ranks[deck[i ]% 13];
			System.out.println(" "+rank +" "+ suit);
		}
		
	}

}
