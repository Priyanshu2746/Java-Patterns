public class InvertedHalfTriangle {
    public static void main(String args[]){
      int n=5;
      for(int i=1;i<n;i++){
        for(int j=1+i;j<n;j++){
          System.out.print("*");
        }
        System.out.println("*");
      }
    }
}
      
