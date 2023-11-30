package lambadaexpression;

public class MethodRef 
{
	 MethodRef()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		//MethodRef m=new MethodRef();
		
		Demo d=MethodRef::new;
		d.demo();

	}

}
