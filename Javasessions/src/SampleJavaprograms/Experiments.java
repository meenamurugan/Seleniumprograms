package SampleJavaprograms;

public class Experiments {
	void today()
	{
		System.out.println("Today is Sunday");
	}
		public int add(int a1,int a2)
		{
			int c= a1+a2;
			return c;
			
		}
		public int sub(int b1,int b2)
		{
			int d= b1-b2;
			return d;
			
		}
	public static void main(String[] args) {
	Experiments exp= new Experiments();
	exp.today();
	int result= exp.add(10, 20);
	System.out.println(result);
	int end= exp.sub(30, 17);
	System.out.println(end);
	
		

	}

}
