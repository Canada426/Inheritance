package com.company;

public class Main {

    public static void main(String[] args) {
	    Parent p = new Parent("black", 2, "black", 30);
        Child_1 child_1 = new Child_1("black", 1.5f, "black", 10);
        Child_2 child_2 = new Child_2("black", 1.4f, "black", 9);
        Child_3 child_3 = new Child_3("black", 1.3f, "black", 8);

        child_2.setDigitCount(9);
        child_1.setLanguage("thai");
        child_1.setLanguageOfProgramming("Java");
        child_3.setStupid(true);

        System.out.print(p.GetParamsByString() +
        child_1.GetParamsByString() +
        child_2.GetParamsByString() +
        child_3.GetParamsByString());
    }
}
