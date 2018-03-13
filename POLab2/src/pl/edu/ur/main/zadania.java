/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author Maciek
 */
public class zadania {

    public static void zad3() {
        Scanner skaner = new Scanner(System.in);
        int[] liczby = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbe");
            String liczba = skaner.nextLine();
            liczby[i] = Integer.parseInt(liczba);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(liczby[i]);
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(liczby[i]);
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Elemnt " + i + " tablicy " + liczby[i]);
            }
        }
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println("Elemnt " + i + " tablicy " + liczby[i]);
            }
        }

    }

    public static void zad4() {
        Scanner skaner = new Scanner(System.in);

        int[] liczby = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbe");
            String liczba = skaner.nextLine();
            liczby[i] = Integer.parseInt(liczba);
        }
        int x;
        System.out.println("Podaj nr algorutmu do wykonania \n[1]Oblicz sume \n[2]Oblicz iloczyn \n[3]"
                + "Wyznacz średnią\n[4]Wyznacz min\n[5]Wyznacz max.");
        x = skaner.nextInt();

        switch (x) {
            case 1:
                int wynik;
                wynik = 0;
                for (int i = 0; i < 10; i++) {
                    wynik += liczby[i];
                }
                System.out.println("Suma elementów tablicy wynosi: " + wynik);

                break;
            case 2:
                int wynik1 = 1;
                for (int i = 0; i < 10; i++) {
                    wynik1 = wynik1 * liczby[i];
                }
                System.out.println("Iloczyn elementów tablicy wynosi: " + wynik1);
                break;
            case 3:
                int suma = 0;
                for (int i = 0; i < 10; i++) {
                    suma += liczby[i];
                }
                System.out.println("Wartość średnia elementów tablicy wynosi: " + suma / 4);
                break;
            case 4:
                int wynik2 = liczby[0];
                for (int i = 0; i < 10; i++) {
                    if (wynik2 < liczby[i]) {
                        wynik2 = liczby[i];
                    }
                }
                System.out.println("Wartosć minimalna tablicy wynosi: " + wynik2);
                break;
            case 5:
                int wynik3 = liczby[0];
                for (int i = 0; i < 10; i++) {
                    if (wynik3 > liczby[i]) {
                        wynik3 = liczby[i];
                    }
                }
                System.out.println("Wartosć minimalna tablicy wynosi: " + wynik3);
                break;
        }
    }

    public static void zad6() {
        Scanner skaner = new Scanner(System.in);
        for (;;) {
            System.out.println("Podaj liczbę całkowitą ");
            int x = skaner.nextInt();
            if (x < 0) {
                break;
            }
        }
    }

    public static void zad7() {

        int ilosc;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilość elementów tablicy");
        ilosc = in.nextInt();

        int[] tab = new int[ilosc];
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj element tablicy:");
            tab[i] = in.nextInt();
        }
        b_sort(tab);
    }

    static void b_sort(int tab[]) {
        int temp;
        int zmiana = 1;
        while (zmiana > 0) {
            zmiana = 0;
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    temp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                    zmiana++;
                }
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}
