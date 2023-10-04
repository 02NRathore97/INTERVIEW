package String;

public class Test {
	public static void main(String[] args) {
		
//		String name = "Neeraj";
//		
//		String name1 = name+" Rathore";
//		String name2 = name.concat(" Rathore");
//		
//		System.out.println(name1);
//		System.out.println(name2);
		
		
//		String name = "Neeraj Rathore";
//		String[] a = name.split(" ");
//		
//		String lastName = a[a.length-1];
//		System.out.println(lastName);
		
		
//		String name = "Neeraj Rathore";
//		int count = 0;
//		for(int i = 0; i<name.length();i++) {
//			char c = name.charAt(i);
//			String s = name.valueOf(c);
//			if(s.matches("j")) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		
		
		
//		String name =  "neeraj";
//		char[] ch  = name.toCharArray();
//		int x = 0;
//		int y = 0;
//		for(int i = 0; i<ch.length; i++) {
//			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
//				x++;
//			}else if(ch[i]>='a'&& ch[i]<='z') {
//				y++;
//			}
//		}
//		System.out.println("vowel "+ x);
//		System.out.println("consonant "+ y);

		
		
		//OR
		
		
//		String name =  "neeraj";
//		
//		int x = 0;
//		int y = 0;
//		for(int i = 0; i<name.length(); i++) {
//			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
//				x++;
//			}else if(name.charAt(i)>='a'&& name.charAt(i)<='z') {
//				y++;
//			}
//		}
//		System.out.println("vowel "+ x);
//		System.out.println("consonant "+ y);
		
		
		
//		String name = "Neeraj1234Rathore";
//		char[] ch = name.toCharArray();
//		String result = "";
//		String x ;
//		int count = 0;
//		for(int i = 0; i<name.length(); i++) {
//			if(!Character.isDigit(ch[i])) {
//				result = result+ch[i];
//			}else {
//				count += ch[i];
//			}
//		}
//		System.out.println(result);
//		System.out.println(count);
		
		
//		
//		StringBuffer sb = new StringBuffer("Neeraj");
//		sb.reverse();
//		System.out.println(sb);
		
		
//		StringBuffer sb = new StringBuffer(20);  //default 16
//		sb.append("12345678901234567890");
//		System.out.println(sb.length());
//		System.out.println(sb.capacity());

		
//		sb.append("123456789012345678901");
//		System.out.println(sb.length());
//		System.out.println(sb.capacity());
		
//		sb.append("123456789012345678901234567890123456789012");
//		System.out.println(sb.length());
//		System.out.println(sb.capacity());
		
//		sb.append("1234567890123456789012345678901234567890121");
//		System.out.println(sb.length());
//		System.out.println(sb.capacity());
//		
//		sb.append("k");
//		System.out.println(sb.length());
//		System.out.println(sb.capacity());
		
		
	
		
//		String name = "Neeraj Rathore";
//		int count = 0;
//		for(int i = 0;i<name.length();i++) {
//			if(name.charAt(i)!= ' ') {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		
//		String[] name = {"Neeraj1234"};
//		int count  = 0;
//		for(String s:name) {
//			char[] ch = s.toCharArray();
//			for(int i = 0;i<ch.length;i++) {
//				if(Character.isDigit(ch[i])) {
//					count+=Integer.parseInt(String.valueOf(ch[i]));
//				}
//			}
//		}
//		System.out.println(count);
		
		
		
//		String name = "Neeraj";
//		char[] ch = name.toCharArray();
//		int count = 0;
//		for(int i=0; i<ch.length; i++) {
//			String k = name.valueOf(ch[i]);
//			if(k.matches("j")) {
//				count++;
//			}
//			
//		}
//		System.out.println(count);
		
	}
}
