package fourteen;

public class EsraIbin {
  //  package feb14;
    //public class HomeworkTable {
        public static void main(String[] arg){
            for (int i = 1; i <  11; i++) {
                System.out.print("\t"+i+"\t");
            }
            System.out.print("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
            for (int j = 1; j < 11; j++) {
                System.out.println(j+":");
                for( int k =1 ; k<11 ; k++) {
                    System.out.print("\t"+j * k+"\t");
                }
            }
        }
    }
}
