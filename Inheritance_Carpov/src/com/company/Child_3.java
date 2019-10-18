package com.company;

public class Child_3 extends Parent
{
    private boolean isStupid;

    public Child_3(String eyecolor, float height, String skincolor, int age)
    {
        super(eyecolor, height, skincolor, age);
    }

    public boolean getIsStupid()
    {
        return isStupid;
    }

    public void setStupid(boolean isStupid)
    {
        this.isStupid = isStupid;
    }

    @Override
    public String GetParamsByString()
    {
        return "\nChild 3 :" + " " + super.getEyeColor() + " " + super.getSkinColor() + " " + super.getHeight() + " " + "m" + " " + super.getAge() + " " + "years" + " isStupid " + isStupid;
    }

}
