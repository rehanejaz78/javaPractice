package org.example;

class Person
{
    private String show()
    {
        return "This is a person";
    }
}


class Teacher extends Person
{
    protected String show()
    {
        return "This is a teacher";
    }
}
public class MathsTeacher extends Person
{

    public final String show()
    {
        return "This is a Maths teacher";
    }
    public static void main(String[] name)
    {

        final Person mt = new MathsTeacher();
        System.out.print(((MathsTeacher) mt).show());
    }
}
