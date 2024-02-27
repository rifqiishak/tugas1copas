package com.tugas;

import java.util.Scanner;

public class Main {
    static Scanner objInput = new Scanner(System.in);
    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("==== Library System ====");
            System.out.println("1. login as student");
            System.out.println("2. login as admin");
            System.out.println("3. Exit");
            System.out.print("choose option(1-3): ");
            pilihan= objInput.nextInt();

            switch (pilihan) {
                case 1:
                    inputNim();
                    break;
                case 2:
                    loginAdmin();
                    break;
                case 3:
                    exit();
            }
        }while (pilihan !=3);

    }

    private static void inputNim() {
        System.out.print("Masukan NIM : ");
        String nim= objInput.next();
        if (nim.length()!=15){
            System.out.println("User Not Found!!");
        }
        else {
            System.out.println("Successfull Login As Student!! ");
        }
    }

    private static void loginAdmin() {

        System.out.print("Masukan Username (admin) : ");
        String username = objInput.next();
        objInput.nextLine();
        System.out.print("Masukan Password (admin) : ");
        String password = objInput.next();

        if (username.equals("admin") && password.equals("admin")){
            System.out.println("Succesfull Login As Admin!!");
        }else {
            System.out.println("Admin User Not Found!!");
        }

    }

    private static void exit(){
        System.out.println("ZONKKKKKK");
    }

}
