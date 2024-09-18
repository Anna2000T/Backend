package encapsulation;


class Matek{

    public int Sum(int a, int b)
    {
        int osszeg = a + b;
        return osszeg;
    }

    public int Sub(int a, int b)
    {
        int osszeg = a - b;
        return osszeg;
    }

    public int Mul(int a, int b)
    {
        int osszeg = a * b;
        return osszeg;
    }

    public int Div(int a, int b)
    {
        int osszeg;

        if(b == 0)
        {
            return 0;
        }
        else
        {
            osszeg = a / b;
            return osszeg;

        }
        
        
    }

}


public class encap {

    public static void main(String[] args) {

        Matek matek = new Matek();

        System.out.println(matek.Div(10, 2));
        System.out.println(matek.Mul(10, 5));
        System.out.println(matek.Sum(10, 5));
        System.out.println(matek.Sub(30,25));

        



        
    }
}
