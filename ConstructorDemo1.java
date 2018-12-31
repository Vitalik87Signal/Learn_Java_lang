package strings;

public class ConstructorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String(); // Пустой объект класса String.
		char[] chars={'a', 'b', 'c'};
		s=new String(chars); // Строка инициализируется массивом символов.
		System.out.println(s);
		char[] chars2={'a', 'b', 'c', 'd', 'e', 'f'};
		s=new String(chars2, 2, 3);
		System.out.println(s);

	}

}
