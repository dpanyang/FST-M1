package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {10,77,10,45,-11,10};
		
		int tempNum=0;
		
		for (int i=0;i<num.length;i++) {
			
			if (num[i]==10) {
				
				tempNum=tempNum+num[i];
			}
		}
		
		if( tempNum==30) {
		System.out.println("Sum of total number equal to " +tempNum);
		}
	}
	
	
	

}
