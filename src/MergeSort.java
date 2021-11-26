public class MergeSort {
    public static void mergeSort(int[] arr){
    if(arr.length>2) {
        int midIndex = (arr.length) / 2;
        int[] leftsplitarray = new int[midIndex];
        int[] rightsplitarray = new int[arr.length - midIndex];


        // for(int i=0;i<midIndex;i++){
        //   leftsplitarray[i]=arr[i];
        // }
        System.arraycopy(arr, 0, leftsplitarray, 0, midIndex);
        // for(int i=midIndex;i<arr.length;i++){
        //  rightsplitarray[i-midIndex]=arr[i];
        // }

        if (arr.length - midIndex >= 0)
            System.arraycopy(arr, midIndex, rightsplitarray, 0, arr.length - midIndex);
        mergeSort(leftsplitarray);
        mergeSort(rightsplitarray);
        merge(arr, leftsplitarray, rightsplitarray);
    }
    }

    private static void merge(int [] arr, int [] leftArr, int[] rightArr){
    int i=0, j=0, k=0;
    while(i<leftArr.length && j<rightArr.length){
        if(leftArr[i]<=rightArr[j]){
            arr[k]=leftArr[i];
            i++;
        }
        else{
            arr[k]=rightArr[j];
            j++;
        }
        k++;
        }
    while(i<leftArr.length){
        arr[k]=leftArr[i];
        i++;
        k++;
    }
    while(j<rightArr.length){
        arr[k]=rightArr[j];
        j++;
        k++;
    }
    }
}
