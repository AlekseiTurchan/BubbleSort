
package bubblesort;


public class BubbleSort {

   
    public static void main(String[] args) {
     int[] array={8,7,6,5,10,122,-1,4,5,3,2,1};
        for(int i=0;i<array.length-1;i++){
          for(int j=0;j<array.length-1-i;j++){
              if (array[j]>array[j+1]){
                  array[j]+=array[j+1];
                  array[j+1]=array[j]-array[j+1];
                  array[j]=array[j]-array[j+1];
              }
          }
    }
   
}
}
