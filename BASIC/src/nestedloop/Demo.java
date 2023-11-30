package nestedloop;

public class Demo {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++)//1<=3 2<=3 3<=3
		{
			for(int j=1;j<=3;j++)//1<=3 2<=3 3<=3 4<=3
				                //1<=3 2<=3 3<=3 4<=3
				                  //1<=3 2<=3 3<=3 4<=3
			{
				System.out.print(i);//***
				                        //***
				                        //***
			}
			System.out.println();//nextline
		}

	}

}
