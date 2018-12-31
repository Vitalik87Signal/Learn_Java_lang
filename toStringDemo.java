package strings;

public class toStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box(10, 12, 14);
		String s="Box b: "+b; // Конкатенация строки с объектом класса Box.
		System.out.println(b); // Преобразуем объект Box в строку.
		System.out.println(s);
		char ch;
		ch="abc".charAt(1);
		System.out.println(ch);
		

	}

}
