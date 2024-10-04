package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApp {
    public static void main(String[] args) {
            Scanner phone = new Scanner(System.in);

            CellPhone user1 = new CellPhone();

            System.out.print("What is the serial number? ");
            int pSerial = phone.nextInt();
            user1.serialNumber(pSerial);
            phone.nextLine();

            System.out.print("What model is the phone? ");
            String pModel = phone.nextLine();
            user1.model(pModel);

            System.out.print("What is the carrier? ");
            String pCarrier = phone.nextLine();
            user1.carrier(pCarrier);

            System.out.print("What is the phone number? ");
            String pNumber = phone.nextLine();
            user1.phoneNumber(pNumber);

            System.out.print("Who is the owner of the phone? ");
            String pOwner = phone.nextLine();
            user1.owner(pOwner);

            user1.printcellPhone
    }
}
