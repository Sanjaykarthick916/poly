package Collection_sub;

public class Reverse_string {
	public static void main(String[] args) {
		String name = "java is program"; 
		String m[]= name.split(" ");  
		String reverse="";
		for(int i = 0; i<m.length;i++) {  
			String n=m[i];
			String reverseword=" ";
			
			for(int j=n.length()-1;j>=0; j--) { // 0
				reverseword=reverseword+n.charAt(j);
			}
			reverse=reverse+reverseword+(" ");
			System.out.print(reverseword);
			
			}
			
		}
		
	}


