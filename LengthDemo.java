package strings;

public class LengthDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chars={'a', 'b', 'c'};
		String s=new String(chars);
		System.out.println(s.length());
		String s2="abc";
		System.out.println(s);
		System.out.println(s2);
		// Вызываем метод непосредственно по отношению к строке. 
		System.out.println("abc".length());
		// Пример конкатенации.
		String age="9";
		s="Ему "+age+" лет";
		System.out.println(s);
	}
}
