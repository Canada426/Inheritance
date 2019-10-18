package com.company;

public class Parent {
    private String eyecolor;
    private float height;
    private String skincolor;
    private int age;

    public Parent (String eyecolor, float height, String skincolor, int age)
    {
        this.eyecolor = eyecolor;
        this.height = height;
        this.skincolor = skincolor;
        this.age = age;
    }

    public Parent(String eyecolor, String skincolor) {
    }

    public String getEyeColor()
    {
        return this.eyecolor;
    }
    public String getSkinColor()
    {
        return this.skincolor;
    }
    public float getHeight()
    {
        return this.height;
    }
    public int getAge()
    {
        return this.age;
    }

    public void setEyeColor(String eyecolor)
    {
        this.eyecolor = eyecolor;
    }
    public void setSkinColor(String skincolor)
    {
        this.skincolor = skincolor;
    }
    public void setHeight(float height)
    {
        this.height = height;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public String GetParamsByString()
    {
        return "Parent :" + " " + eyecolor + " " + skincolor + " " + height + " " + "m" + " " + age + " " + "years";
    }
}
