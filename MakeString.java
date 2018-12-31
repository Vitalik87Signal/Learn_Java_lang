package strings;
// Создаём один объект String из другого.
public class MakeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c={'J', 'a', 'v', 'a', ' ', 'п', 'р', 'o', 'в', 'е', 'р', 'к', 'а'};
		String s1=new String(c);
		String s2=new String(s1);
		System.out.println(s1);
		System.out.println(s2);

	}

}
