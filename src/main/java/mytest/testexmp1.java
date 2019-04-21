package mytest;

public class testexmp1 {

	public static void main(String[] args) {
		int num = 3,r,c,sp;
		 for(r=1; r<=num; r++)
		 {
		   for(sp=num-r; sp>=1; sp--)
		       System.out.print(" ");
		   for(c=1; c<=r; c++)
		       System.out.print(c);
		   for(c=r-1; c>=1; c--)
		       System.out.print(c);
		   System.out.print("\n");
		 }
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

	}

}
