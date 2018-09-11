package HitungFibonacci;

import java.util.Scanner;
public class Praktek {
    public static void tampilJudul(String identitas){
        System.out.println("Identitas : " + identitas);

        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");        
    }
    
    public static int tampilInput(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bilangan ke-: ");
        int n = scanner.nextInt();
        
        return n;        
    }
        
    public static void main(String args){
       String identitas = "Nabilla Fryda Israhani Nugraha / XR3 / 28";
       tampilJudul(identitas);
     
       int n = tampilInput();
    }
}
