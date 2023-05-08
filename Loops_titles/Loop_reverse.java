package Loops_titles;

public class Loop_reverse {
	public static void main(String[] args) {
		for (int i=1; i<=3;i++) {
			for(int j=1;j<=i; j++) {
				System.out.print(" ");
				
			}
			for (int k=i; k<=3;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
