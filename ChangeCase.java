package strings;
// Демонстрация работы методов toUpperCase() и toLowerCase().
public class ChangeCase {

	public static void main(String[] args) {
		//  
		String s="Это тест.";
		System.out.println("Исходная строка: "+s);
		String upper=s.toUpperCase();
		String lower=s.toLowerCase();
		System.out.println("Верхний регистр: "+upper);
		System.out.println("Нижний регистр: "+lower);
		String str1="123 Check Проверка \u262d \u269B";
		System.out.println(str1);
		//for (int i=0; i<str1.length(); i++) {
			//int x=str1.codePointAt(i);
			//System.out.print(x+" ");
		//}
		//System.out.println();
		//System.out.println(str1.codePointCount(0, 5));
		System.out.println(str1.contains("123"));
		String str2="123";
		System.out.println(str1.contentEquals(str2)); // Даёт false. Метод contentEquals() проверяет, что ссылки ссылаются на один
		// и тот же объект.
		String str3=str1+str2;
		System.out.println(str3);
		//System.out.println(str3.contentEquals(str2)); // После конкатенации даёт отрицательный результат (false). 
		//String str4=str2;
		//System.out.println(str4);
		//System.out.println(str4.contentEquals(str2)); // Ссылки на один и тот же объект (строку) -- положительый результат (true).
		//System.out.println("Проверка на пустую строку: str1 => "+str1.isEmpty());
		//str2="";
		//System.out.println("Проверка на пустую строку: str2 => "+str2.isEmpty());
		System.out.println("Проверка matches(): "+str1.matches("^123.*"));
		int x=str1.offsetByCodePoints(2, 5);
		System.out.println(x);
		str2=str1.replaceFirst("123", "ABC");
		System.out.println(str2);
		String str5=str3.replaceAll("123", "ABC");
		System.out.println("Проверка метода replaceAll(): "+str5);
		//String[] arrayOfStrings=str1.split(" ");
		//for (int i=0; i<arrayOfStrings.length; i++) {
			//System.out.println(arrayOfStrings[i]);
		//}
		str2="aaa bbb ccc ddd";
		String[] arr2=str2.split(" ", 3);
		for (String st: arr2) {
			System.out.println(st);
		}
		str5=(String) str1.subSequence(2, 10);
		System.out.println(str5);
		
	}
}
