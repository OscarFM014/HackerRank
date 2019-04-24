public class grades{
    static int[] gradingStudents(int[] grades) {
        int  calif [] = new int[grades.length];
        int aux;

        for (int i = 0; i < grades.length; i++){
            aux = grades[0];
            if (grades[i] >=0){
                while (aux % 5 != 0){
                    aux = aux + 1;
                }
                if (aux - grades[i] < 3){
                    calif[i] = aux;
                }
                else{
                    calif[i] = grades[i];
                }

            }
            else{
                calif[i] = grades[i];
            }
        }

        return calif;

    }


    public static void mian(String[] args){
        int [] grade = {73,67,38,33}; 
        System.out.println(gradingStudents(grade));
    }
}