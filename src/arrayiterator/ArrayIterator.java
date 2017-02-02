package arrayiterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * ArrayIterator is a class that iterate the eleement in array and can check if
 * next element is left.
 * 
 * @author Pittayut Sothanakul
 *
 * @param <T>
 *            the type of elements in ArrayIterator.
 */
public class ArrayIterator<T> implements Iterator<T> {
	/** attribute for the array we want to iterate over. */
	private T[] array;
	/** the position in elements. */
	private int cursor;
	/** check true or false if can next element or not.*/
	private boolean legal;

	/**
	 * Initialize a new array iterator with the array to process.
	 * 
	 * @param array
	 *            is the array to iterate over.
	 */
	public ArrayIterator(T[] array) {
		this.array = array;
		this.legal = false;
	}

	/**
	 * Return the next non-null element from array, if any.
	 * 
	 * @return the next non-null element in the array.
	 * @throws NoSuchElementException
	 *             if there are no more elements to return.
	 */
	public T next() {
		if (this.hasNext() == true) {
			this.cursor++;
			this.legal = true;
			return array[cursor - 1];
		} else {
			throw new NoSuchElementException();
		}

	}

	/**
	 * Returns true if next() can return another non-null array element.
	 * 
	 * @return true if next() can return another non-null array element, false
	 *         if no more elements.
	 */
	@Override
	public boolean hasNext() {
		for (int i = this.cursor; i < this.array.length; i++) {
			if (this.array[i] != null) {
				this.cursor = i;
				return true;
			}
		}
		return false;
	}

	/**
	 * Remove most recent element returned by next() from the array by setting
	 * it to null.
	 * 
	 * @throws IllegalStateException
	 *             If this method is called without calling next()
	 * 
	 */
	public void remove() {
		if (legal == true) {
			array[cursor - 1] = null;
			legal = false;
		} else {
			throw new IllegalStateException();
		}
	}

}
