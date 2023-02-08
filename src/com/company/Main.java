package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    String[] pdfs={"pdf1","pdf2"};
    String userInput="";

    Scanner INPUT= new Scanner(System.in);

    while (true) {
        System.out.println("1. Dnd List 2. Search");
        userInput = INPUT.nextLine();
        if (userInput.equalsIgnoreCase("list") || userInput.equalsIgnoreCase("dnd list") || userInput.equalsIgnoreCase("1")) {
            for (int i = 0; i < pdfs.length; i++) {
                System.out.println(pdfs[i]);
            }

            System.out.println("1. Main Menu 2. Search");
            userInput=INPUT.nextLine();
            if(userInput.equalsIgnoreCase("search")||userInput.equalsIgnoreCase("2")){
                System.out.print("Number of book in list\n>");
                pdfStuff.openPDF(pdfs[INPUT.nextInt()]);
            }
        }
        else if (userInput.equalsIgnoreCase("search")||userInput.equalsIgnoreCase("2")){
            System.out.print("Name of Book\n>");
            pdfStuff.openPDF(sortByClosedTo.sortByClosest(pdfs,INPUT.nextLine()));
        }
        else{
            System.out.println(userInput+"is an input this system can not understand");
        }

    }
    }
}
