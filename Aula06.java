public class Aula06 {
    public static void main(String[] args) throws Exception {
        for (var i=1; i<6 ;i++){
            if(i==1){
            System.out.printf("\t N \t 10*N \t 100*N \t 1000*N");
            }
            System.out.printf("\n \t %d \t %d \t %d \t %d",i, i*10, i*100,i*1000);
        }
    }
}
