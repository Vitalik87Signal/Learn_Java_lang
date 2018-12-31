package strings;
// Демонстрация работы метода String.getChars().
public class getCharsDemo {

	public static void main(String[] args) {
		
		String s="Это демонстрация метода getChars.";
		int start=4;
		int end=8;
		char[] buf=new char[end-start];
		s.getChars(start, end, buf, 0);
		System.out.println(buf);
		byte[] asc={-48, -128, -48, -127, -48, -126, -48, -125, -48, -124, -48, -123, -48, -122, -48, -125, -48, -124, -48, -123, -48, -122, -48, -121, -48, 120, -48, -119, -48, -118, -48, -117, -48, -116, -48, -115, -48, -114, -48, -113, -48, -112, -48, -111, -48, -110, -48, -109, -48, -108, -48, -107, -48, -106, -48, -105, -48, -104, -48, -103, -48, -102, -48, -101, -48, -100, -48, -99};
		String s1=new String(asc);
		System.out.println(s1);
		String s2="АБВГДЕЖЗИЙКЛМНОабвгдежзийклмно";
		byte[] b=s2.getBytes();
		for (int i=0; i<b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		char[] arr=s.toCharArray();
		for (int i=0;i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
