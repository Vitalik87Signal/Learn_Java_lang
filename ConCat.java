package strings;
// Использование конкатенации во избежание длинных строк.
class ConCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String longStr="Это может быть "+
						"очень длинная строка, которую "+
						"следует перенести. Но конкатенация "+
						"позволяет предотвратить это.";
		System.out.println(longStr);
		int age=9;
		String s="Ему "+age+" лет.";
		System.out.println(s);
		System.out.println();
		s="четыре: "+2+2; 
		System.out.println(s); // Получим 22, т.к. + тут используется для конкатенации. Чтобы получить рез-т вычисл-я надо испоьзовать скобки 
		s="четыре: "+(2+2);
		System.out.println(s); // Получим 4.

	}

}
