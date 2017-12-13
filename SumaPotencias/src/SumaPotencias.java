public class SumaPotencias {
    //Este Se Usa Ciclo
    public int Exponente(int a){
        int X = 0, f=0;
        do{
            X =(a-f)*(a-f);
            System.out.println(X);
            f++;
        }while(X!=1);
        return X;
    }
// Forma Recursiva

    public int Recursivo(int a){
        int c=0;
        if (a!=1){
            return 1;
        }
        else {
            return (c++)+Recursivo(a-1)*(a-1);
        }
    }
}