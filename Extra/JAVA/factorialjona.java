import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class factorialjona{

    static long factorial(int n){
        long numeros[] = new long[25];

        long auxiliar = 1; //! Factorial

        long auxiliar2 = 0; //!Auxiliar 1

        long guardar = 0; //! Dato que entra en el array de numeros

        String unir_string = "0"; //! Unir el número de la lista

        Long unir_int; //! Parse
        for (int a = 1; a <= n; a ++){
            auxiliar = auxiliar * a;
            auxiliar2 = auxiliar;

            for (int i = 0; i < numeros.length; i++){
                guardar = auxiliar2 % 10;
                numeros [i] = guardar;
                auxiliar2 = auxiliar2 / 10;
                System.out.print(numeros[i]);
            }

            System.out.print("\n");

            for (int i = (numeros.length)-1; i >= 0; i--){
                unir_string = unir_string + Long.toString(numeros[i]);
            }

            unir_int = Long.parseLong(unir_string);
            auxiliar = unir_int;
            //System.out.println(auxiliar);
            unir_string = "0";
        }
        return auxiliar;
    }

    public static void main(String args[]){
        System.out.println(factorial(100));
    }

}

//
            

