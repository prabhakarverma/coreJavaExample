package mytest;

public class myTestClass {

	public static final  synchronized void main(String[] args) {
		
	/*	for(int i =3;i>=1;i--) {
			for(int j = 3;j>=i;j--) {
				System.out.print(j);
			}System.out.println();
		}
		*/
		
		for(int i =1;i<=3;i++) {
			for(int j = 3;j>i;j--) {
				System.out.print(" ");
			}
			for(int j = 1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j = i;j>1;j--) {
				System.out.print(j-1);
			}
			
			System.out.println();
		}
		int r,c,sp,num=3;
		 for(r=1; r<=num; r++)
		 {
		   for(sp=r; sp>=1; sp--)
		       System.out.print(" ");
		   for(c=1; c<=(num-r); c++)
		       System.out.print(c);
		   for(c=num-r-1; c>=1; c--)
		       System.out.print(c);
		   System.out.print("\n");
		 }
		
		int i = 0;
		for(; i<10;++i)
		
		for(; ;++i)break;
		
		for(; i<10;)
		
		for(; ;);
		
		//System.out.println("hello");
	}
	
	
	
	

}
