package strings;
// Демонстрация применения метода replace().
class ReplaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer sb=new StringBuffer("This is a test.");
		//sb.replace(5, 7, "was");
		//System.out.println("После замены: "+sb);
		StringBuffer sb0=new StringBuffer("abcdef");
		String s1=sb0.substring(3);
		System.out.println(s1);
		String s2=sb0.substring(0, 3);
		System.out.println(s2);
		sb0.appendCodePoint(67);
		System.out.println(sb0);
		System.out.println(sb0.codePointAt(2));
		System.out.println(sb0.codePointBefore(2));
		//System.out.println(sb0.codePointCount(2, 5));
		System.out.println(sb0.indexOf("abc"));
		sb0.append("abc");
		//System.out.println(sb0.lastIndexOf("abc"));
		//System.out.println(sb0.lastIndexOf("abc", 8));
		//System.out.println(sb0.lastIndexOf("abc", 4));
		//System.out.println(sb0.offsetByCodePoints(2, 5));
		String s3=(String) sb0.subSequence(0, 3);
		System.out.println(s3);
		System.out.println("Резерв: "+sb0.capacity());
		sb0.trimToSize();
		System.out.println("После использования trimToSize(): "+sb0.capacity());
	}
}
