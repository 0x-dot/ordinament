public class QuickSort {

    public static void Quicksort(int [] arr,int low,int high){

        int mid = (low+high)/2;
        int i=low;
        int j=high;
        int pivot=arr[mid];
        while(i<=j){
            while(arr[i]<pivot){i++;}
            while(arr[j]>pivot){j--;}
            if(i<=j){
                Ordinamento.scambio(arr,i,j);
                i++;
                j--;
            }
        }
        if(low<j)
            Quicksort(arr,low,j);
        if(high>i)
            Quicksort(arr,i,high);
    }
}
