package sanidhya;
import java.util.Scanner;
public class One {
    static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		String num1;
		int x=0,y=0,z;
		num1=s.next();
		char[] num=num1.toCharArray();
		for(int i=0;i<num.length;i=i+2)
		{
			int m=Character.getNumericValue(num[i]);
			x=x+m;
		}
		for(int i=1;i<num.length;i=i+2)
		{
			int n=Character.getNumericValue(num[i]);
			y=y+n;
		}
		z=x-y;
		System.out.println(z);
	}

}
