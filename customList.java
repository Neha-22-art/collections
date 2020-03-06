package epam6;

public class customList<T> {
	private T[] array;

	customList(T[] userArray) {
        array = userArray;
    }

	@SuppressWarnings("unchecked")
	public void removeLastElement() {
		Object[] duplicateArray = new Object[size()-1];
		int i = 0;
		for ( i = 0 ; i < size()-1 ; i++ ) {
			duplicateArray[i] = array[i]; 
		}
		array = (T[]) duplicateArray;
	}


    public T replaceElementAtIndex(int index, T element) {
        T oldValue = array[index];
        array[index] = element;
        return oldValue;
    }

	@SuppressWarnings("unchecked")
	public void addElementAtEnd(T element) {
		Object[] duplicateArray = new Object[size()+1];
		int i = 0;
		for ( i = 0 ; i < size() ; i++ ) {
			duplicateArray[i] = array[i]; 
		}
		duplicateArray[i] = element;
		array = (T[]) duplicateArray;
	}

	public T fetchElementAtIndex(int index) {
		return array[index];
	}

	public int size() {
		return array.length;
	}

	public void printAllElements() {
		for (int i= 0 ; i < size() ; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}


	@SuppressWarnings("unchecked")
	public void removeElementAtIndex(int index) {	
		if (index > size()) {
			throw new ArrayIndexOutOfBoundsException("Index out of bound");
		}
		int duplicateArrayIndex = 0;
		Object[] duplicateArray = new Object[size()-1];
		for ( int i = 0 ; i < size() ; i++ ) {
			if ( i != index ) {
				duplicateArray[duplicateArrayIndex++] = array[i];
			}
		}
		array =(T[]) duplicateArray;
	}

}