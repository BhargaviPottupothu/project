package assignment1;

public class nestedternary {
	public static void main(String[] args) {
		int a=100,b=250,c=350,d=300;
		int result=(a>b)?(a>c?a:c):(c>d?c:d);
		System.out.println("Result:"+result);
	}

}
