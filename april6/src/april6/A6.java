package april6;
interface printable
{
	void print();
}
public class A6 implements printable
{
	public void print(){System.out.println("hai");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A6 obj = new A6();
obj.print();
	}

}
