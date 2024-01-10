package generics_NOV28;
class Parent{
	Parent(int i){
		
	}
}

public class Child extends Parent {

	Child(int i) {
		super(i);
	}

	public static void main(String[] args) {
		Parent p=new Child(1);

	}

}
