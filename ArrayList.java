package list.arraylist.implementation;

public class ArrayList {
	private int size = 0 ;
	private Object[] elementData = new Object[100] ;
	public boolean addLast(Object element) {
		elementData[size] = element ; 
		size++ ;
		return true ;
	}
	public boolean add(int number, Object element) {
		for(int i = size ; i>number ; i--) { 
			elementData[i] = elementData[i-1] ;
			}
		elementData[number] = element ;
		size++ ;
		return true ;
	}
	public boolean addFirst(Object element) {
		return add(0, element) ;
	}
	public boolean remove(int index) {
		for(int i = index ; i<size-1 ; i++) {
			elementData[i] = elementData[i+1] ;
		}
		size-- ;
		elementData[size] = null ;
		return true ;
	}
	public boolean removeFirst() {
		return remove(0) ; 
	}
	public boolean removeLast() {
		return remove(size-1) ;
	}
	public Object get(int index) {//arraylist를 활용하면 데이터를 빠르게 가져올 수 있다.
		return elementData[index] ;
	}
	public int size() {
		return size ;
	}
	public int indexOf(Object index) {
		for(int i = 0 ; i<size ; i++) {
			if(elementData[i]==index) {
				break ;
			}
			return i ;
		}
		return -1;
	}
	public String toString() {
		String str = "[" ;
		for(int i = 0 ; i < size ; i++) {
			if(i==size-1) {
				str += elementData[i] ;
			}
			else str += elementData[i]+", " ;

		}
		
		return str + "]" ;
	}
}
