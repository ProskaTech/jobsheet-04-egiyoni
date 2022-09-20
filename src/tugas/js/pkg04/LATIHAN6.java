package tugas.js.pkg04;

/**
 *
 * @author 21343005_EGI YONI SANDRA
 */
public class LATIHAN6 {
    public static void main(String[] args){
        String status = "";
        int grade = 50;
        
        //mendapatkan status pelajar
        status = (grade >= 60) ? "Passed" : "Fail";
        
        //print status
        System.out.println(status);
    }
}
