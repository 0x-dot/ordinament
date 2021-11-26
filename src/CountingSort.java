import java.util.Arrays;

public class CountingSort {
    private final int[]arr;
    public CountingSort(int [] arr ){
        this.arr=arr;
    }
    public void sort(){
        int min=Arrays.stream(arr).min().orElse(0);
        int max= Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);

        //questo array ci serve per memorizzare le occorrenze presenti nell'array da ordinare.
        //ricordati che più sono alti i numeri più posizioni crei. il +1 è messo per includere lo zero
        int[] countArray=new int[max-min+1];

        for(int i: arr)
            countArray[i-min]++;

        int arrayIndex=0;
        for(int i=0;i<max-min+1;i++){
            while(countArray[i]>0){
                arr[arrayIndex]=i+min;
                countArray[i]--;
                arrayIndex++;
            }
        }


    }
}
