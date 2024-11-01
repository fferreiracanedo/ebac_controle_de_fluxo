public class BoardCoach {

     public void  PrintNote(double note1, double note2, double note3, double note4){
       double result =  (note1 +note2 + note3 + note4) / 4;

         if (result >= 7.00) {
             System.out.println("Aprovado");
         }else if (result >= 5.00) {
             System.out.println("Recuperação");
         }else {
             System.out.println("Reprovado");
         }


    }
}
