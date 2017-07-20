package player;

public class MiddleSTARHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hello";
int a=s.length();
for(int i=0;i<s.length();i++){
	System.out.println(s.substring(0,3)+"*"+s.substring(s.length()-2,s.length()));
}
	}

}
