package org.currentyear;

public class surya {
	public static void main(String[] args) {
		String e="12321";
		String rev ="";
		for (int i=e.length()-1;i>=0;i--) {
			rev = rev +e.charAt(i);
		}
		System.out.println(rev);
			if (e.equals(rev)) {
				System.out.println("pa");
				
			}
			else {
				System.out.println("not");
			}
			
	}
}

	
	


