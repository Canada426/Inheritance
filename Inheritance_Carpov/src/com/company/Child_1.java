package com.company;

public class Child_1 extends Parent
{
    private String language;
    private String languageOfProgramming;

    public Child_1(String eyecolor, float height, String skincolor, int age)
    {
        super(eyecolor, height, skincolor, age);
    }


    public String getLanguage()
    {
        return this.language;
    }
    public String getLanguageOfProgramming()
    {
        return this.languageOfProgramming;
    }

    public void setLanguage(String language)
    {
        this.language = language;
    }
    public void setLanguageOfProgramming(String languageOfProgramming)
    {
        this.languageOfProgramming = languageOfProgramming;
    }

    @Override
    public String GetParamsByString()
    {
        return "\nChild 1 :" + " " + super.getEyeColor() + " " + super.getSkinColor() + " " + super.getHeight() + " " + "m" + " " + super.getAge() + " " + "years" + " knows" + language + " " + languageOfProgramming;
    }
}
