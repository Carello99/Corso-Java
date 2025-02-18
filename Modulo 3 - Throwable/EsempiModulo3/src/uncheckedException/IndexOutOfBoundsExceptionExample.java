package uncheckedException;

public class IndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		String[] foo = new String[] {"java ", "8 ", "is ", "fantastic", "!"};
		System.out.println(foo[10]);
	}

}
