package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //List of pdfs
    String[] pdfs={"pdf1","pdf2"};

        Scanner INPUT= new Scanner(System.in);
        String userInput="";

    while (true) {
        //user options
        System.out.println("1. Dnd List 2. Search");
        userInput = INPUT.nextLine();
        //output list of pdfs
        if (userInput.equalsIgnoreCase("list") || userInput.equalsIgnoreCase("dnd list") || userInput.equalsIgnoreCase("1")) {
            for (int i = 0; i < pdfs.length; i++) {
                System.out.println(pdfs[i]);
            }
            //either return to main menu or search
            System.out.println("1. Main Menu 2. Search");
            userInput=INPUT.nextLine();
            //search based on the number in list
            if(userInput.equalsIgnoreCase("search")||userInput.equalsIgnoreCase("2")){
                System.out.print("Number of book in list\n>");
                pdfStuff.openPDF(pdfs[INPUT.nextInt()]);
            }
        }
        //search based on which name is the closest
        else if (userInput.equalsIgnoreCase("search")||userInput.equalsIgnoreCase("2")){
            System.out.print("Name of Book\n>");
            pdfStuff.openPDF(sortByClosedTo.sortByClosest(pdfs,INPUT.nextLine()));
        }
        //unknown input
        else{
            System.out.println(userInput+"is an input this system can not understand");
        }

    }
    }
}
