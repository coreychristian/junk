/**
 * Created by Corey on 19/06/2015.
 */

public class Person {

    private String name;
    private int age;

    public Person(String pname,  int page)
    {
        name = pname;
        age = page;
    }

    public int getAge()
    {
        return age;
    }

    public String  getName()
    {
        return name;
    }

    public void greet()
    {
        System.out.println("Hello " +name);
    }
}
