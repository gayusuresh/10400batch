package nestedloop;

public class IncrementPattern {

	public static void main(String[] args) {
		  int n=1;
		  for(int i=1;i<=3;i++)//1<=3 2<=3 3<=3 4<=3=f
			  {
			  for(int j=1;j<=i;j++)//j=1<=1 2<=1=f 
				                  //1<=2 2<=2 3<=2=f
				                  //1<=3 2<=3 3<=3 4<=3=f
			  {
				  System.out.print(n);//1
				                      //2 3
				                      //4 5 6
				  n++;//2,3,4,5,6
			  }
			  System.out.println();
		  }
	}

}
