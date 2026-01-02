package actRes;

public class ActRes6_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int codePoint = 0x0000; codePoint <= 0xFFFF; codePoint++) {
			
			String xxxx = Integer.toHexString(codePoint);
			
			System.out.println("\\u" + xxxx + ": " + (char)codePoint);
			
		}
		
	}

}
