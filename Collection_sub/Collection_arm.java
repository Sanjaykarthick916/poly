package Collection_sub;

public class Collection_arm {
	public static void main(String[] args) {
		int num =0,total=0;
		
		System.out.println("Armstrong number b/w 1 to 1000:");
		
		//

	for(int i=1;i<=1000;i++) {
		num=i;
		while(num>0)
		{
			int n = num%10;
			total=total+(n*n*n);
			num=num/10;
		}
		if(total==i)
		{
			System.out.println(i+" ");
		}
		total=0;
			
		}
	
	System.out.println("Total count is:"+total);
	
	}
		
	
	
	

}
