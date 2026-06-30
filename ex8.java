import java.util.Scanner;

public class ex8 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter start and end: ");
int start = sc.nextInt();
int end = sc.nextInt();

for (int i = start; i <= end; i++) {
if (i < 2)
continue;

boolean isPrime = true;
for (int j = 2; j * j <= i; j++) {
if (i % j == 0) {
isPrime = false;
break;
}
}
if (isPrime) {
System.out.print(i + " ");
}
}

sc.close();
}
}