package programs_on_arrays;
public class DuplicateStringInArray {

	public static void main(String[] args) {
		
		String a[]= {"Rohit", "Rahul", "Rohit", "Rahul","Suryawanshi"};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i].equals(a[j]))
				{
					System.out.println("Duplicate of String is : " +a[j]);
				}
			}
		}
	}
}

/*
OUTPUT
Duplicate of String is : Rohit
Duplicate of String is : Rahul
 */