package list.arraylist.implementation;

public class Main {
	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		numbers.addLast(10) ;
		numbers.addLast(20) ;
		numbers.addLast(30) ;
		numbers.addLast(40) ;
		//numbers.remove(1) ;
		//numbers.removeFirst() ;
		numbers.removeLast() ;
		System.out.println(numbers.get(1));
		System.out.println(numbers);
		System.out.println(numbers.size()) ;
		System.out.println(numbers.indexOf(20)); //20을 가진 index는 몇번인가.

	}

}
