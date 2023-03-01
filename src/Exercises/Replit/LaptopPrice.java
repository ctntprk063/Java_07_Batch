package Exercises.Replit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class LaptopPrice {
//    This is an IT market and the customer wants to buy a new laptop. You will write a code that gives the laptop price.
//    Step
//   1 Ask user for a screen size. If screen size is equals to 13.3, add $200 to the laptop price. If screen size is equals to 15.0 - add $300 to the laptop price. If screen size is equals to 17.3 - add $400 to the laptop price.
//
//   2 Then ask user for CPU type. If CPU type equals to i3, add $150 to the laptop price. If CPU type equals to i5, add $250 to the laptop price. If CPU type equals to i7, add $350 to the laptop price.
//
//   3 Then ask user for RAM size. Add $50 for every 4GB of ram to the laptop price.
//
//       4     Then, ask user for storage type. There are 2 options: SSD and HDD. If it's HDD - add $50 to the laptop price for every 500gb. If it's SSD - add $100 to the laptop price for every 500GB.
//
//   5 Then ask user for for screen resolution. There are 2 options: FULLHD and 4K. Add $100 if it's FULLHD screen and $200 if it's 4K screen.
//

    double screenSize;
    double screenSizePrice;
    String cpu;
    double cpuPrice;
    int ram;
    double ramPrice;
    String type;
    double typePrice;
    String resolution;
    double resolutionPrice;
    int memoryGiga;

    public static void main(String[] args) {

        LaptopPrice laptop = new LaptopPrice();
        laptop.ScreenSize();
        laptop.CpuType();
        laptop.Ram();
        laptop.storageType();
        laptop.screenResolution();
        laptop.totalprice();
        System.out.println("");

    }

    public void ScreenSize() {
       // System.out.println("Screen Size: 13.3, 15, 17.3");
        System.out.print("Select screen size: ");
        Scanner sc = new Scanner(System.in);
        screenSize = sc.nextDouble();

        if (screenSize == 13.3) {
            screenSizePrice = 200;
            // System.out.print(screenSizePrice);

        } else if (screenSize == 15) {
            screenSizePrice = 300;
            //   System.out.print(screenSizePrice);

        } else if (screenSize == 17.3) {
            screenSizePrice = 400;
            //    System.out.print(screenSizePrice);

        }


    }

    public void CpuType() {

     //   System.out.println("Cpu  : i3, i5, i7");
        System.out.print("Select CPU type: ");
        Scanner sc1 = new Scanner(System.in);
        cpu = sc1.nextLine();
        switch (cpu) {
            case "i3":
                cpuPrice = 150;
                // System.out.print( cpuPrice);
                break;

            case "i5":
                cpuPrice = 250;
                //  System.out.print(cpuPrice);
                break;

            case "i7":
                cpuPrice = 350;
                //   System.out.print(cpuPrice);
                break;
        }

    }

    public void Ram() {

       // System.out.println("RAM: 4, 8, 12, 16");
        System.out.print("Select RAM size: ");
        Scanner sc2 = new Scanner(System.in);
        ram = sc2.nextInt();
        if (ram == 4) {
            ramPrice = 50;
            //  System.out.print(ramPrice);

        } else if (ram == 8) {
            ramPrice = 100;
            //  System.out.print(ramPrice);

        } else if (ram == 12) {
            ramPrice = 150;
            //   System.out.print(ramPrice);

        } else if (ram == 16) {
            ramPrice = 200;
            //   System.out.print(ramPrice);

        }
    }

    public void storageType() {


     //   System.out.println("storage type: SSD,HDD");
        System.out.print("Select storage type: ");
        Scanner sc2 = new Scanner(System.in);
        type = sc2.nextLine();
        System.out.print("Enter memory size: ");
        memoryGiga = sc2.nextInt();

        switch (type) {
            case "SSD":
                if (memoryGiga == 500) {
                    typePrice = 100;
                    //   System.out.println(typePrice);
                    break;
                }
                if (memoryGiga == 1000) {
                    typePrice = 200;

                    //   System.out.println(typePrice);
                    break;
                }
            case "HDD":
                if (memoryGiga == 500) {
                    typePrice = 50;
                    //   System.out.println(typePrice);
                    break;
                }
                if (memoryGiga == 1000) {
                    typePrice = 100;

                    //    System.out.println(typePrice);
                    break;
                }
        }

    }

    public void screenResolution() {



       // System.out.println("Resolution option : FULLHD,4K");
        System.out.print("Enter screen resolution: ");
        Scanner sc3 = new Scanner(System.in);
        resolution = sc3.nextLine();


        switch (resolution) {
            case "FULLHD":
                resolutionPrice = 100;
                //    System.out.println(resolutionPrice);
                break;

            case "4K":

                resolutionPrice = 200;
                //  System.out.println(resolutionPrice);
                break;
        }


    }

    public void totalprice() {
        System.out.println("Laptop price is: " + "$" + (cpuPrice + screenSizePrice + ramPrice + resolutionPrice + typePrice));
    }


}
