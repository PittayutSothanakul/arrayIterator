package arrayiterator;

/**Main class for run ArrayIterator to console.
 * 
 * @author Pittayut Sothanakul
 * @version 02/02/60
 *
 */
public class Main {
	/**
	 * The main method for run ArrayIterator.
	 * 
	 * @param args create object and print ArrayIterator to console.
	 */
	public static void main(String[] args) {
		String[] fruit = { "apple", null, null, "banana" };
		ArrayIterator<String> it = new ArrayIterator<>(fruit);
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());

	}
}
