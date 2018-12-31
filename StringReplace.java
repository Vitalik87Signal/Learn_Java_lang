package strings;

public class StringReplace {

	public static void main(String[] args) {
		// Замена подстроки, используем методы indexOf() и substring().
		String org="This is a test. This is too.";
		String search="is";
		String sub="was";
		String result="";
		int i=0;
		do { // Замена всех совпадающих подстрок.
			System.out.println(org);
			i=org.indexOf(search);
			if(i!=-1) {
				result=org.substring(0, i);
				result=result+sub;
				result=result+org.substring(i+search.length());
				org=result;
			}
		} while(i!=-1);
		String s1="one";
		// Демонстрация метода concat().
		String s2=s1.concat("two");
		System.out.println(s2);
		// Демонстрация версий метода replace().
		String s3=s1.replace('n', 'r');
		String s4=s2.replace("two", "one");
		System.out.println(s3+" "+s4);
		// Демонстрация работы метода valueOf().
		//String s5=s4.valueOf(0.567);
		//System.out.println(s5);
		//char[] c1={'h', 'e', 'l', 'l', 'o'};
		//s5=s5.valueOf(c1);
		//System.out.println(s5);
		
		
		
	}
}
