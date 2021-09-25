package vm;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class VM {


    public static void main(String[] args) {
        
         Snacks snack1 = new Snacks(10, "Snickers", 1.7, 10);
        Snacks snack2 = new Snacks(11, "Chips", 1.5, 10);
        Snacks snack3 = new Snacks(12, "Butterfinger", 1.00, 10);
        Snacks snack4 = new Snacks(13, "Twix", 1.6, 10);
        Snacks snack5 = new Snacks(14, "BabyRuth", 1.2, 10);
        Snacks snack6 = new Snacks(15, "PayDay", 2.00, 10);
        Snacks snack7 = new Snacks(16, "Take 5", 3.00, 10);
        Snacks snack8 = new Snacks(17, "Kit Kat", 1.2, 10);
        Snacks snack9 = new Snacks(18, "Rolo", 1.9, 10);
        Snacks snack10 = new Snacks(19, "Mars Bar", 2.10, 10);
        Snacks snack11 = new Snacks(20, "Almond Joy", 2.20, 10);
        Snacks snack12 = new Snacks(21, "Nestle Crunch", 3.30, 10);
        Snacks snack13 = new Snacks(22, "Hersheyâ€™s Cookies N Cream", 4.00, 10);
        Snacks snack14 = new Snacks(23, "Mounds", 0.9, 10);
        Snacks snack15 = new Snacks(24, "Lindtâ€™s Lindor Truffles (Lindor) Hazelnut", 4.00, 10);
        Snacks snack16 = new Snacks(25, "Hersheyâ€™s Milk Chocolate", 3.00, 10);
        Snacks snack17 = new Snacks(26, "Nestle Crunch White Chocolate", 2.00, 10);
        Snacks snack18 = new Snacks(27, "Ferrero Rocher", 2.00, 10);
        Snacks snack19 = new Snacks(28, "M&Ms", 1.5, 10);
        Snacks snack20 = new Snacks(29, "Hostess Twinkies", 1.7, 10);
        Snacks snack21 = new Snacks(30, "Doritos Cool Ranch", 1.2, 10);
        Snacks snack22 = new Snacks(31, "Pringles", 2.3, 10);
        Snacks snack23 = new Snacks(32, "Cheetos", 2.5, 10);
        Snacks snack24 = new Snacks(33, "Flipz", 1.5, 10);
        Snacks snack25 = new Snacks(34, "Toblerone", 1.6, 10);
        Snacks[] snacks = {
            snack1,
            snack2,
            snack3,
            snack4,
            snack5,
            snack6,
            snack7,
            snack8,
            snack9,
            snack10,
            snack11,
            snack12,
            snack13,
            snack14,
            snack15,
            snack16,
            snack17,
            snack18,
            snack19,
            snack20,
            snack21,
            snack22,
            snack23,
            snack24,
            snack25
        };
        
        CardSlot cV = new CardSlot(1, "Visa", 111, 111);
        cV.setAmount(100);
        CardSlot mS = new CardSlot(2, "MasterCard", 121, 121);
        mS.setAmount(100);
        CardSlot pS = new CardSlot(3, "Platin", 313, 313);
        pS.setAmount(100);


        Coins fiftyCent = new Coins(1, "cent");
        fiftyCent.setCoinValue(0.5);
        Coins twintyCent = new Coins(2, "cent");
        twintyCent.setCoinValue(0.2);
        Coins tenCent = new Coins(3, "cent");
        tenCent.setCoinValue(0.1);
        
        NotesSlot fiftyDolar = new NotesSlot(1, "Notes");
        fiftyDolar.setNoteValue(50);
        NotesSlot twentyDolar = new NotesSlot(2, "Notes");
        twentyDolar.setNoteValue(20);

        boolean done = true;

        while (done == true) {
            System.out.println("*****************************************");
            System.out.println("*****Welcome To Vending Machine *********");
            System.out.println("*****************************************");
            System.out.println("Please Choose Your Order\n");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter choise");

            KeyPad ch = new KeyPad();

            String snackChoise = sc.nextLine();

            int choise = Integer.parseInt(snackChoise);
            ch.setProductChoise(choise);
            System.out.println(ch.getProductChoise());

            for (Snacks s: snacks) {
                if (choise == s.getID()) {

                    if (s.getAmount() != 0) {

                        done = true;
                        System.out.println("Last Amount" + s.getAmount());
                        System.out.println(s.getName() + " is there");
                        double choiseprice = s.getPrice();
                        //                        System.out.println(choiseprice);
                        //                       
                        //                        System.out.println(s.getAmount());
                        System.out.println("Please set the type of mony that you want to pay\n");
                        System.out.println("1-Cards\n");
                        System.out.println("2-Coins\n");
                        System.out.println("3-notes\n");

                        Scanner mn = new Scanner(System.in);
                        String mntype = mn.nextLine();
                        int pyChoise = Integer.parseInt(mntype);



                        switch (pyChoise) {
                            case 1:
                                System.out.println("Please set the type of Card\n");
                                System.out.println("1-Visa\n" + "2-MasterCard\n" + "3-Visa\n");

                                int cardType = Integer.parseInt(mn.nextLine());
                                Claculations calc = new Claculations();

                                Double deposit;


                                if (cV.ID == cardType) {

                                    System.out.println("Please Insert the Visa ID\n");
                                    int vsID = Integer.parseInt(mn.nextLine());
                                    System.out.println(vsID + "**********" + cV.getCardId());


                                    if (vsID == cV.getCardId()) {

                                        System.out.println("Please Insert the Visa password\n");
                                        int vsPs = Integer.parseInt(mn.nextLine());

                                        if (vsPs == cV.getPassword()) {

                                            deposit = calc.calc(cV.getAmount(), s.getPrice());
                                            cV.setAmount(deposit);
                                            System.out.println("\n" + "your deposit is " + deposit);
                                            System.out.println("\n" + "here you have your " + s.getName());
                                            s.setAmount(s.getAmount() - 1);
                                        } else {
                                            System.out.println("wrong password please order again");
                                        }
                                    } else {
                                        System.out.println("Your ID is not there pelase insert again");
                                    }
                                } else if (mS.getID() == cardType) {

                                    System.out.println("Please Insert the Master Card ID\n");
                                    int msID = Integer.parseInt(mn.nextLine());


                                    if (msID == mS.getCardId()) {

                                        System.out.println("Please Insert the Master Card password\n");
                                        int msPs = Integer.parseInt(mn.nextLine());

                                        if (msPs == mS.getPassword()) {

                                            deposit = calc.calc(mS.getAmount(), s.getPrice());
                                            mS.setAmount(deposit);
                                            System.out.println("\n" + "yor deposit is " + deposit);
                                            System.out.println("\n" + "here you have your " + s.getName());
                                            s.setAmount(s.getAmount() - 1);
                                        } else {
                                            System.out.println("wrong password please order again");
                                        }
                                    } else {
                                        System.out.println("Your ID is not there pelase insert again");
                                    }
                                } else if (pS.getID() == cardType) {

                                    System.out.println("Please Insert the Master Card ID\n");
                                    int pSID = Integer.parseInt(mn.nextLine());


                                    if (pSID == pS.getCardId()) {

                                        System.out.println("Please Insert the Master Card password\n");
                                        int pSPs = Integer.parseInt(mn.nextLine());

                                        if (pSPs == pS.getPassword()) {


                                            deposit = calc.calc(pS.getAmount(), s.getPrice());
                                            pS.setAmount(deposit);

                                            System.out.println("\n" + "yor deposit is " + deposit);
                                            System.out.println("\n" + "here you have your " + s.getName());
                                            s.setAmount(s.getAmount() - 1);

                                        } else {
                                            System.out.println("wrong password please order again");

                                        }
                                    } else {
                                        System.out.println("Your ID is not there pelase insert again");
                                    }

                                }


                                break;



                            case 2:
                                Claculations calcCoins = new Claculations();
                                Scanner cs = new Scanner(System.in);
                                double totCoins = 0;
                                while (s.getPrice() > totCoins) {
                                    System.out.println("Please Insert Coin\n" +
                                        "1-Fifty Cent (write number 1 to insert)\n" +
                                        "2-Twenty Cent (write number 2 to insert)\n" +
                                        "3-Ten Cent (write number 3 to insert)\n");
                                    int csCoins = Integer.parseInt(mn.nextLine());

                                    if (csCoins == fiftyCent.getID()) {

                                        totCoins += fiftyCent.getCoinValue();

                                    } else if (csCoins == twintyCent.getID()) {
                                        totCoins += twintyCent.getCoinValue();
                                    } else if (csCoins == tenCent.getID()) {
                                        totCoins += tenCent.getCoinValue();
                                    } else {
                                        System.out.println("Please Insert 1 or 2  or 3");
                                    }

                                    System.out.println(totCoins);
                                }



                                DecimalFormat df = new DecimalFormat("#.0");
                                Double totalCoins = Double.valueOf(df.format(totCoins));
                                double changeBack = Double.valueOf(df.format(calcCoins.calc(totCoins, s.getPrice())));
                                s.setAmount(s.getAmount() - 1);



                                System.out.println("your change back is " + "==" + changeBack);




                                break;

                            case 3:
                                Claculations caclNotes = new Claculations();
                                double totalBack;
                                Scanner ns = new Scanner(System.in);
                                System.out.println("Please Insert Note Mony\n" +
                                    "1-Fifty Dolars (write number 1 to insert)\n" +
                                    "2-Twenty Dolars (write number 2 to insert)\n");

                                int nsNotes = Integer.parseInt(ns.nextLine());
                                if (nsNotes == fiftyDolar.getID()) {
                                    totalBack = caclNotes.calc(fiftyDolar.getNoteValue(), s.getPrice());
                                    System.out.println(totalBack);
                                    s.setAmount(s.getAmount() - 1);

                                } else if (nsNotes == twentyDolar.getID()) {
                                    totalBack = caclNotes.calc(twentyDolar.getNoteValue(), s.getPrice());

                                    System.out.println(totalBack);
                                    s.setAmount(s.getAmount() - 1);
                                } else {

                                    System.out.println("Please add a valid note!!!!");
                                }

                                break;



                            default:
                        }
                    } else {
                        System.out.println("sorry out of stack");
                    }

                } else {

                }


            }
        }
    }
}
