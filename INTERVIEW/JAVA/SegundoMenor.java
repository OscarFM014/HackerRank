public class SegundoMenor{
    

    static int menor(int [] menor){
        int first = Integer.MAX_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < menor.length; i ++){
            if (menor[i] < first){
                second = first;
                first = menor[i];
            }else if ( menor[i] < second && menor[i] != first){
                second = menor[i];
            }

        }
        return second;



    }

    public static void main(String args[]){
        int [] array = {1,2,3,4,5,6,7};
        System.out.println(menor(array));
    }
}