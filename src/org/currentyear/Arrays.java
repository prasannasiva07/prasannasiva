package org.currentyear;

public class Arrays {
	public static void main(String[] args) {
		 int a[]=new int[5];
		 a[0]=10;
		 a[1]=12;
		 a[2]=13;
		 a[3]=14;
		 a[4]=15;
		 System.out.println(a[3]);
		  int s = a.length;System.out.println(s);
		  
		 
		 for (int i = 0; i < a.length; i++) {
			 System.out.println(a[i]);
			 for (int i1 : a) {
				 System.out.println(i1);
				
			}
			
		}
	}
}


