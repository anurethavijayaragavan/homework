import java.util.Scanner;
public class ex6{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
boolean isPrime=true;
System.out.println("Enter a number:");
int n=sc.nextInt();
while(n<=1){
isPrime=false;
System.out.println(isPrime);
}

for(int i=2;i<n;i++){
if(n%i==0){
isPrime=false;
}
else
{
isPrime=true;
}
}
System.out.println(isPrime);
}

}