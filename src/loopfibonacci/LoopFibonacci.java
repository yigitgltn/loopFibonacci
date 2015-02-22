
package loopfibonacci;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class LoopFibonacci {
    
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.print("Kacinci fibonacci sayisi :  ");
        sayi = input.nextInt();
        
        
        int a=1;
        int b=0;
        int n=0;
        
        long startTime=System.nanoTime();
        do{
        int c = a+b;
        b=a;
        a=c;
        
            System.out.println(c);
         n++;
        }while(n<=sayi-2);
    
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime ;
        System.out.println("süre : " + TimeUnit.SECONDS.toSeconds(totalTime)+" nanosaniye");
    }
    
}
