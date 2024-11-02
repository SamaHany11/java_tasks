//Problem C

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        if (isWonderful(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isWonderful(int n) {
        if (n % 2 == 0) {
            return false;
        }
        
        String binary = toBinary(n);
        
        return isPalindrome(binary);
    }

    
    public static String toBinary(int n) {
        String binary = "";
        while (n > 0) {
            binary = (n % 2) + binary; 
            n /= 2;
        }
        return binary;
    }

    public static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
//--------------------------------------------------------------------------------
/*//Problem G
import java.util.Scanner;

public class task1 {
	
	 public static void max(long []num,int n) {
		
      

         long maxx = num[0];
         for (int i = 1; i < n; i++) {
             if (num[i] > maxx) {
                 maxx = num[i];
             }
         }

         System.out.print(maxx);
	 }
	 public static void min(long[]num ,int n) {
		 

        long min = num[0];
        for (int i = 1; i < n; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }

        System.out.print(min+" ");
	 }
    public static void main(String[] args) {
    	 Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
        long[] num = new long[n];

        for (int i = 0; i < n; i++) {
            num[i] = in.nextLong();
        }
        min(num,n);
    max(num,n);
   
    
                
            
        
    }
}
//---------------------------------------------------------------
//problem J
import java.util.Scanner;

public class task1 {

    public static double Average(int n, Scanner scanner) {
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            double value = scanner.nextDouble();
            sum += value;
        }
        return sum / n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double average = Average(n, scanner);
        System.out.printf("%.6f%n", average);
    }
}
//---------------------------------------------------------
//problem M
import java.util.Scanner;
import java.util.Arrays;

public class task1 {
    public static void dis(int[] num,int n) {
    	int count=1;
       for(int i=1;i<n;i++) {
    	   if(num[i] != num[i-1]){
   			count++;
   		}
       }
       System.out.print(count);
    }

    public static void main(String[] args) {
   	 Scanner in = new Scanner(System.in);
	 int n = in.nextInt();
	 if(n == 0){
		    System.out.print(0);
		
		}
    int[] num = new int[n];

    for (int i = 0; i < n; i++) {
        num[i] = in.nextInt();
    }
    Arrays.sort(num);
       dis(num,n);
    }
}
	//-------------------------------------------------------------------------------
	//problem o
	import java.util.Scanner;

public class task1 {

    public static void max(int[] num, int n) {
        int maxx = num[0];
        for (int i = 1; i < n; i++) {
            if (num[i] > maxx) {
                maxx = num[i];
            }
        }
        System.out.println("The maximum number : " + maxx);
    }

    public static void min(int[] num, int n) {
        int min = num[0];
        for (int i = 1; i < n; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("The minimum number : " + min);
    }

    public static void prime(int[] num, int n) {
        int countPrime = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(num[i])) {
                countPrime++;
            }
        }
        System.out.println("The number of prime numbers : " + countPrime);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void pal(int[] num, int n) {
        int countPal = 0;
        for (int i = 0; i < n; i++) {
            if (isPalindrome(num[i])) {
                countPal++;
            }
        }
        System.out.println("The number of palindrome numbers : " + countPal);
    }

    private static boolean isPalindrome(int number) {
        String str = String.valueOf(number);
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void div(int[] num, int n) {
        int maxDivNum = num[0];
        int maxDivCount = getDivisorCount(num[0]);

        for (int i = 1; i < n; i++) {
            int divCount = getDivisorCount(num[i]);
            if (divCount > maxDivCount || (divCount == maxDivCount && num[i] > maxDivNum)) {
                maxDivNum = num[i];
                maxDivCount = divCount;
            }
        }

        System.out.println("The number that has the maximum number of divisors : " + maxDivNum);
    }

    private static int getDivisorCount(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }

        max(num, n);
        min(num, n);
        prime(num, n);
        pal(num, n);
        div(num, n);
    }
}*/
//-------------------------------------------------------------------------------------
