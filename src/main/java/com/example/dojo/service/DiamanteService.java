package com.example.dojo.service;

public class DiamanteService {

    public String generaDiamante(String letter) {

        if (letter.equalsIgnoreCase("a")) {
            System.out.print("a");
            return "a";
        }

        String alpha = alfabet();
        int index = alpha.indexOf(letter.toLowerCase());

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < index; i++) {
            if(i == 0 || i == index-1){
                result.append(this.generateSpaces(index)).append(alpha.charAt(index)).append(this.generateSpaces(index)).append("\n");
            }
            result.append(this.generateSpaces(index)).append(alpha.charAt(index)).append(this.generateSpaces(i)).append(alpha.charAt(index)).append("\n");

        }
        System.out.println(result.toString());
        return result.toString();
    }

    private String printLine(String letter, int spaceNumbers){
        String ret = "";
        for(int i=0; i<spaceNumbers; i++){
          ret += " ";
        }
        ret += letter;

        for(int i=0; i<spaceNumbers; i++){
            ret += " ";
        }
        return ret;
    }

    private String generateSpaces(int a) {
        String spaces = "";
        for (int i = 0; i < a; i++){
            spaces +=" ";
        }
        return spaces;
    }
    private String alfabet() {
        return"abcdefghijklmnopqrstuv";
    }
}
