package generics_NOV28;

	class NormalClass{
		//We are declaring the datatype before execution
		public void swap1(int a,int b) {
			System.out.println("Before Swap:"+"a="+a+"b="+b);
			int temp=a;
			a=b;
			b=temp;
			System.out.println("After Swap:"+"a="+a+"b="+b);
			System.out.println("-------------------------------");
		}
		public void swap2(String s1,String s2) {
			System.out.println("Before Swap:"+"s1="+s1+"s2="+s2);
			String temp=s1;
			s1=s2;
			s2=temp;
			System.out.println("After Swap:"+"s1="+s1+"s2="+s2);
			System.out.println("-------------------------------");
		}
	}
	public class Advantage extends NormalClass
	{
		//we are declaring the datatype at the time of execution
	  public static<T>void swap3(T a,T b){
		  System.out.println("Before Swap:"+"a="+a+"b="+b);
			T temp=a;
			a=b;
			b=temp;
			System.out.println("After Swap:"+"a="+a+"b="+b);
			System.out.println("-------------------------------");
		 
	  }
	  public static void main(String[] args) {
		  Advantage genericMethods = new Advantage();
		  genericMethods.swap1(7, 10);
		  genericMethods.swap2("anusha","ramya");
		  genericMethods.swap3(4.6,8.0);
	}
		

	}


