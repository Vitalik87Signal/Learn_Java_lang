package strings;

class EqualsDemo {
	// Демонстрация применения методов equals() и equalsIgnoreCase().
	public static void main(String[] args) {
		String s1="Привет";
		String s2="Привет";
		String s3="Пока";
		String s4="ПРИВЕТ";
		System.out.println(s1+" эквивалентно "+s2+" -> "+s1.equals(s2));
		System.out.println(s1+" эквивалентно "+s3+" -> "+s1.equals(s3));
		System.out.println(s1+" эквивалентно "+s4+" -> "+s1.equals(s4));
		System.out.println(s1+" эквивалентно, игнорируя регистр "+s4+" -> "+s1.equalsIgnoreCase(s4));
		s1="abcdef";
		s2="def";
		System.out.println(s1.regionMatches(3, s2, 0, 3));
		s2="DEF";
		System.out.println(s1.regionMatches(true, 0, s2, 0, 3)); // Неправильно задан интервал в 1-й строке. 
		System.out.println(s1.regionMatches(true, 3, s2, 0, 3));

	}
}
