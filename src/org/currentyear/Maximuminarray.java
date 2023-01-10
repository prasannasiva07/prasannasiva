package org.currentyear;

public class Maximuminarray {

	public static void main(String[] args) {
		int ar [] = new int [6];
		ar[0]=700;
		ar[1]=400;
		ar[2]=200;
		ar[3]=300;
		ar[4]=100;
		ar[5]=500;
		for (int i = 0; i < ar.length; i++) {
			for (int j =i+1; j < ar.length; j++) {
			//asc and des and max and mini
			if (ar[i]<ar[j]) {
				int temp = ar[i];
				ar[i]= ar[j];
				ar[j]= temp;
				
			}
			
			
				
					
				}
		
			}
		System.out.println(ar[1]);
			
	}
}
	


