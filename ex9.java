import java.util.Scanner;

public class ex9 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter n: ");
int n = sc.nextInt();

int count = 0;
int num = 1;

while (count < n) {
num++;

boolean isPrime = true;
for (int i = 2; i * i <= num; i++) {
if (num % i == 0) {
isPrime = false;
break;
}
}
if (isPrime) {
count++;
}
}
System.out.println("The " + n + "th prime number is " + num);
sc.close();
}
}