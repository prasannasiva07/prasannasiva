package org.currentyear;

public class Twodimensional {
	public static void main(String[] args) {
		
		String[][] s= new String[2][3];
		s[0][0]="karthi";
		s[0][1]="parasana";
		s[0][2]="vishnu";
		s[1][0]="veera";
		s[1][1]="sugu";
		s[1][2]="mano";
		System.out.println(s[1][1]);
		
		for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.println(s[i][j]);
			
		}
			
			
		}
		

	}   

}
