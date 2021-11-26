
import java.util.Arrays;

public class RadixSort {
    private final int [] arr;
    public  RadixSort(int[]arr) {
        this.arr=arr;

    }
    public void RadSort(int exp){
        int [] countArray=new int[10];


        for (int j : arr)
            countArray[(j / exp) % 10]++;

        for(int i=1;i<10;i++)
            countArray[i]+=countArray[i-1];

    int [] output=new int[arr.length];
    for(int i=arr.length-1;i>=0;i--){
        int current= arr[i];
        int positionInArray=countArray[(current/exp)%10]-1;
        output[positionInArray]=current;
        countArray[(current/exp)%10]--;
    }
    System.arraycopy(output,0,arr,0,arr.length);
    }

 public void sort(){
        int max= Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
        for(int exp=1;max/exp>0;exp *=10){
            RadSort(exp);
     }
 }
}
