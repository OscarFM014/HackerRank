public class NumeroFalta{

    static int numeroFalta(int n,int [] lista){
        int numero = 0;
        int aux = 0;
        for (int i = 0; i < lista.length; i++ ){
            aux = aux + lista[i];
        }


        numero = (n * (n + 1 ))/ 2;
        numero = numero - aux;
        return numero;
    }

    public static void main(String args[]){
        int [] lista = {1,2,3,4,5};
        int n = 6;
        System.out.println(numeroFalta(n,lista));
    }
    
}