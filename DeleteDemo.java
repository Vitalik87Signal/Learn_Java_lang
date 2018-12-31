package strings;
// Демонстрация применения методов delete() и deleteCharAt().
public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("This is a test.");
		sb.delete(4, 7);
		System.out.println("После delete(): "+sb);
		sb.deleteCharAt(0);
		System.out.println("После deleteCharAt(): "+sb);
	}
}
