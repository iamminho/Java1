
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		
		//casting	
		int b = (int) 1.1;
		// int b를 소수로 못만드므로 b의 데이터형을 double로 바꾸던가 소수 1.1을 1인 int로 바꾸어야 한다.
		System.out.println(b);
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());
		
	}

}
