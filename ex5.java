import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number:");
int n = sc.nextInt();
int check=n;
int og=n;
int res=0;
int count=0;
while (n>0){
int digit=n%10;
count++;
n=n/10;
}
while(og>0){
int dig=og%10;
res+=Math.pow(dig,count);
og=og/10;
}
if(check==res){
System.out.println("Armstrong number");
}
else
{
System.out.println("Not an armstrong number");
}
}
}