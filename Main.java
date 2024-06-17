package com.workfront.assessment.java;


public class Main {

    public static void main(String[] args) {
        int length = 100;

        System.out.println(generateQuestRewards(length));
    }

    public static String generateQuestRewards(int length){
        StringBuilder sequence = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i < length /10) {
                sequence.append("b");
            } else if (i < 2 * length / 5) {
                sequence.append ((i % 2 == 0 || i % 3 == 0 || i % 5 == 0 ) ? "b" : "s");
            } else if (i < 3 * length / 5) {
                sequence.append ((i % 2 == 0) ? "b" : "s");
            } else if (i < 4 * length / 5) {
                sequence.append((i % 2 == 0 || i % 3 == 0) ? "s" : "b");
            } else {
                sequence.append("s");
            }
        }

        return sequence.toString() ;
    }
}