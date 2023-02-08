package com.company;

public class sortByClosedTo {

    public static String sortByClosest(String[] toBeSorted, String sortingBy){
        String[] sortingSplit= sortingBy.split("");
        int count=0;
        String output="";
        int outputInt=0;
        for (int i = 0; i < toBeSorted.length; i++) {
            String[] sortedSplit= toBeSorted[i].split("");
            count=0;
            for (int j = 0; j < sortedSplit.length+1; j++) {
                if (j==sortedSplit.length){
                    count-=sortingSplit.length-sortedSplit.length;
                    break;
                }
                else if (j==sortingSplit.length){
                    count-=sortedSplit.length-sortingSplit.length;
                    break;
                }
                else if(sortedSplit[j].equalsIgnoreCase(sortingSplit[j])){
                    count++;
                }

            }
            if (count>outputInt){
                outputInt=count;
                output=toBeSorted[i];
            }

        }
        return output;
    }
}
