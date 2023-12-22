//Here the Inverted half Triangle is 180 degree flipped.
public class InvertedHalfTriangles {
    public static void main(String args[]){
      int n=5;
      for(int i=1;i<n;i++){
            //inner loop for space insertion
          for(int j=1;j<n-i;j++){
              System.out.print(" ");
          }
          //inner loop for star insertion
          for(int j=1;j<i;j++){
              System.out.print("*");
          }
          System.out.println();
      }
    }
}
