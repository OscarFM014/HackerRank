import java.util.Arrays;

public class mayor{

    static int elMayor(int [] ar, int de, int hasta){
        int [] nueva = Arrays.copyOfRange(ar, de, hasta); //!Esto sirve para tomar rangos 
        //!Arrays.copyOfRange(lista, de, hasta,) ==> (PYTHON) list[de:hasta]
        int mayor = nueva[0];
        for (int i = 0; i < nueva.length;i++){
            if (nueva[i] >= mayor ){
                mayor = nueva[i];
            }
        }
        return mayor;
    }
    public static void main(String args[]){
        int lista [] = {1,10, 25, 43, 21, 10, 2, 35, 44, 83};
        System.out.println(elMayor(lista, 1, 10));


    }


}