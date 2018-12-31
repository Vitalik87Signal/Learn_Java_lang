package strings;

public class SetCharAtDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println("буфер до: "+sb);
		System.out.println("до charAt(1)= "+sb.charAt(1));
		sb.setCharAt(1, 'i');
		sb.setLength(2);
		System.out.println("буфер после: "+sb);
		System.out.println("после charAt(1)="+sb.charAt(1));
		sb.ensureCapacity(10);
		System.out.println(sb.capacity());
		//sb.setLength(10); // Увеличение длины строки.
		System.out.println(sb.length());
		sb.append("aaa");
		System.out.println(sb);
		StringBuffer sb0=new StringBuffer("Привет, мир!");
		char[] target=new char[6];
		sb0.getChars(0, 6, target, 0);
		for(char c:target) {
			System.out.print(c+" ");
		}
		System.out.println();
	}
}
