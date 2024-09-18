package Konstruktor;


class Person {

    String name;
    int age;
    String gender;


    public Person(String name, int age,String gender)
{
    this.name = name;
    this.age = age;
    this.gender = gender; 

}

void adatok()
{
    System.out.println("Szia " + this.name + " vagyok ");
    System.out.println(this.age + " éves vagyok");
    System.out.println(this.gender);
}
        
}





class Person2 {

    String name;
    int age;
    String gender;


    public Person2(String name, int age,String gender)
{
    this.name = name;
    this.age = age;
    this.gender = gender; 

}

void adatok()
{
    System.out.println("Szia " + this.name + " vagyok ");
    System.out.println(this.age + " éves vagyok");
    System.out.println(this.gender);
}
}


class Person3 {

    String name;
    int age;
    String gender;


    public Person3(String name, int age,String gender)
{
    this.name = name;
    this.age = age;
    this.gender = gender; 

}

void adatok()
{
    System.out.println("Szia " + this.name + " vagyok ");
    System.out.println(this.age + " éves vagyok");
    System.out.println(this.gender);
}
}





public class KonsFeladat {

    public static void main(String[] args) {

        Person szemely = new Person("John",48,"Man");
        Person2 szemely2 = new Person2("Albert",38,"Man");
        Person3 szemely3 = new Person3("Helen",40,"Woman");

        System.out.println(szemely.name);
        System.out.println(szemely.age);
        System.out.println(szemely.gender);

        szemely.adatok();

        System.out.println();

        System.out.println(szemely2.name);
        System.out.println(szemely2.age);
        System.out.println(szemely2.gender);

        System.out.println();

        szemely2.adatok();



        System.out.println();

        System.out.println(szemely3.name);
        System.out.println(szemely3.age);
        System.out.println(szemely3.gender);

        System.out.println();

        szemely3.adatok();
        


    }
    
    

}




