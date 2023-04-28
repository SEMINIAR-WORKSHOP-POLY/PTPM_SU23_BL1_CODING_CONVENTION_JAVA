/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chucNang = 0;
        do {
            System.out.println("1.Tinh tong 2 so nguyen");
            System.out.println("2.Tinh tong cac so tu 1 - n");
            System.out.println("3.Nhap thong tin ca nhan va in ra");
            System.out.println("0.Thoat");
            System.out.print("Moi ban nhap chuc nang: ");
            chucNang = Integer.valueOf(scanner.nextLine());
            switch (chucNang) {
                case 1: {
                    System.out.print("Moi nhap so thu nhat: ");
                    int numberFirst = Integer.valueOf(scanner.nextLine());
                    System.out.print("Moi nhap so thu hai: ");
                    int numberSecond = Integer.valueOf(scanner.nextLine());
                    int sum = numberFirst + numberSecond;
                    System.out.println("Tong = " + sum);
                    break;
                }
                case 2: {
                    System.out.print("Moi nhap so: ");
                    int number = Integer.valueOf(scanner.nextLine());
                    int sum = 0;
                    for (int i = 0; i <= number; i++) {
                        sum += i;
                    }
                    System.out.println("Sum = " + sum);
                    break;
                }
                case 3: {
                    System.out.print("Moi nhap ten: ");
                    String name = scanner.nextLine();
                    System.out.print("Moi nhap tuoi: ");
                    int tuoi = Integer.valueOf(scanner.nextLine());
                    System.out.print("Moi nhap dia chi: ");
                    String adress = scanner.nextLine();
                    System.out.print("Moi nhap que quan: ");
                    String home = scanner.nextLine();
                    System.out.println("Ten : " + name + " Tuoi : " + tuoi 
                            + " Dia chi: " + adress + " Que quan: " + home);
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("Chuc nang khong ton tai");
                    break;
                }
            }
        } while (chucNang != 0);
    }

}
