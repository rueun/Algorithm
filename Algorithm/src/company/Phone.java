package company;

public class Phone {
	public static void main(String[] args) {
		System.out.println(phone("0101334444"));
	}
	
	static String phone(String phone) {
		phone = phone.replaceAll("-", "");
		
		if(phone.length() == 9) {
			return phone.substring(0,2) + "***" + phone.substring(5);
		} else if(phone.length() == 10) {
			return phone.substring(0,3) + "***" + phone.substring(6);
		} else if(phone.length() == 11) {
			return phone.substring(0,3) + "****" + phone.substring(7);
		}
		
		return "";
	}
}
