package programs_on_arrays;
public class FindStringHavingLengthMoreThan6InArray {

	void getArray(String[] arr) {
		String str = "";
		System.out.println("String having length more than 6 are : ");
		for (int index = 0; index < arr.length; index++) {
			str = arr[index];
			if (str.length() > 6) {
				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Rohan", "Premlata", "Anuja", "Fazrana" };

		FindStringHavingLengthMoreThan6InArray a47 = new FindStringHavingLengthMoreThan6InArray();
		a47.getArray(names);
	}
}

/*

OUTPUT
String having length more than 6 are : 
Premlata
Fazrana

*/