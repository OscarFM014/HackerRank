//Reloj
public class Reloj{

    static double grades(int[][] time){
        double result = 0;
        double hourGrades = 360/12;    
        double minGrades = hourGrades/60;
        double segGrades = minGrades/60;

        double hour = Math.abs(time[0][0] - time[1][0]);
        double min = Math.abs(time[0][1] - time[1][1]);
        double seg = Math.abs(time [0][2] - time[1][2]);
        result = (hourGrades*hour) + (minGrades*min) + (segGrades*seg);
        return result;
    }



    public static void main(String args []){
        int [][] time = {{12,2,3},
                         {13,2,4}};
        System.out.println(grades(time));



    }
}
