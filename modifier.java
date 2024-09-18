package modifiers;

 class Person {

    private String name;
    private int age;
    private String gender;



public String adatok(String name)
{ 
    this.name = name;
    return name;
}

public int adatok2(int age)
{ 
    this.age = age;
    return age;
}

public String adatok3(String gender)
{ 
    this.gender = gender;
    return gender;
}

        
}

class modifier {

    public static void main(String[] args) {

        Person szemely = new Person();
        String nev =  szemely.adatok("Anna");
        int age =  szemely.adatok2(44);
        String gender =  szemely.adatok3("woman");


        System.out.println(nev);
        System.out.println(age);
        System.out.println(gender);
    
    }

    
    

}




