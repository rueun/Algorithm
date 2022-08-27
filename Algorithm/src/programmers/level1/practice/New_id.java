package programmers.level1.practice;

public class New_id {
	public static void main(String[] args) {
        String str = "...!@BaT#*..y.abcdefghijklm";
        str = str.toLowerCase();
        str = str.replaceAll("[^a-z0-9-_.]", "");
        str = str.replaceAll("\\.{2,}", ".");
        str = str.replaceAll("^(\\.)|(\\.)$","");
        if(str.isEmpty()) str = "a";
        if(str.length() >= 16) {
        	str = str.substring(0,15).replaceAll("(\\.)$", "");
        }
        while(str.length()<3) {
        	str += str.charAt(str.length()-1);
        }
        System.out.println(str);
	}

}
