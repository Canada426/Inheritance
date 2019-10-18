package com.company;

class Child_2 extends Parent
{
    private int digitCount;

    public Child_2(String eyecolor, float height, String skincolor, int age)
    {
        super(eyecolor, height, skincolor, age);
    }
    public int getDigitCount()
    {
        return this.digitCount;
    }

    public void setDigitCount(int digitCount)
    {
        if (digitCount <= 10 && digitCount >= 0)
            this.digitCount = digitCount;
    }

    @Override
    public String GetParamsByString()
    {
        return "\nChild 2 :" + " " + super.getEyeColor() + " " + super.getSkinColor() + " " + super.getHeight() + " " + "m" + " " + super.getAge() + " " + "years" + " has " + digitCount + " digits";
    }
}
