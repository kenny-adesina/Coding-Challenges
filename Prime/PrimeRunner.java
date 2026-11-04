import java.util.Scanner;
public class PrimeRunner {
    
    public static void main(String[] args){
        int x;
        Scanner kb = new Scanner(System.in);
        System.out.print("Is the following integer prime? : ");
        x = kb.nextInt();
        isPrime p = new isPrime();
        
        if(p.Prime(x) == true){ System.out.println("Prime"); } else {System.out.println("Not Prime");}
        

    }
}
