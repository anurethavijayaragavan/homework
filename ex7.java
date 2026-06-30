import java.util.Scanner;
public class ex7{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
String s="";
while(n>0){
s=n%2 +s;
n/=2;
}
System.out.println("binary value:"+s);
}
}
