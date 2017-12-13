//Forma Extensa

public class Suma {
    public static void main (String args[]){

        int x = 10;
        int r =0; // x2 + (x-1)2 + (x-2)2...1
        r= x*x;
        r=(x-1)*(x-1);
        r=(x-2)*(x-2);
        r=(x-3)*(x-3);
        r=(x-4)*(x-4);
        r=(x-5)*(x-5);
        r=(x-6)*(x-6);
        r=(x-7)*(x-7);
        r=(x-8)*(x-8);
        r=(x-9)*(x-9);

        SumaPotencias eje = new SumaPotencias();

        System.out.println("Fin: "+eje.Exponente(9));
        System.out.println("Forma Recursiva: "+ eje.Recursivo(9870));

        System.out.println(r);
    }
}
