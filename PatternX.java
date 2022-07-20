package bharath;

public class PatternX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			
			for(int k=1;k<=5;k++) {
				if(i==k)
					System.out.print("* ");
				else if((i+k)== 6)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}

	}

}
