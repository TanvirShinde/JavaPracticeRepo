package programs_on_collection;
import java.util.Vector;
public class VectorTest1 {

	public static void main(String[] args) {

		Vector vector=new Vector();
		vector.add(10);
		vector.add(20);
		vector.add(30);
		
		System.out.println("Vector element are as : " + vector);
		System.out.println("Vector capacity as :" +vector.capacity());
	}
}
/*
OUTPUT
Vector element are as : [10, 20, 30]
Vector capacity as :10
*/