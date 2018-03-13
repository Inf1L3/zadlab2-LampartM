package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author marcin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
        int a=1;
        
        
        while(a!=0){
        System.out.println("Podaj numer zadania(3,4,6,7). Podanie 0 konczy dzialanie programu");    
        Scanner odczyt = new Scanner(System.in);
        a = odczyt.nextInt();
        
        switch(a){
            case 3: zadania.zad3(); break;
            case 4: zadania.zad4(); break;
            case 6: zadania.zad6(); break;
            case 7: zadania.zad7(); break;
        }
        }
        
    }
    
}
