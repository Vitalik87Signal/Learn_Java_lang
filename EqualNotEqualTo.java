package strings;

public class EqualNotEqualTo {
	// Демонстрирует различия между методом equals() и оператором ==.
	public static void main(String[] args) {
		String s1="Привет";
		String s2=s1;
		System.out.println(s1+" equals "+s2+" -> "+s1.equals(s2));
		System.out.println(s1+" == "+s2+" -> "+(s1==s2));;
	}
}
