public class heapSort {
    int HeapSize;
    int ArraySize;
    int l,r,largest;

    private final int [] arr;
public heapSort(int[] arr){
    this.arr=arr;
    HeapSize=arr.length;
    ArraySize=this.HeapSize;
}
   public void HeapSort(){
       BulidHeap();
       for(int i=ArraySize-1;i>=1;i--){
           Ordinamento.scambio(arr,0,i);
           HeapSize--;
           Heapify(0);
       }
   }

   public void BulidHeap(){
       HeapSize=ArraySize;
       for(int i=ArraySize/2;i>=0;i--)
           Heapify(i);
   }

    public void Heapify(int i){

        l=left(i);
        r=right(i);
        if(l<HeapSize && arr[l]>arr[i])
            largest=l;
        else largest=i;
        if(r<HeapSize && arr[r]>arr[largest])
            largest=r;
        if(largest!=i){
            Ordinamento.scambio(arr,i,largest);
            Heapify(largest);
        }

    }

    public static int left(int i){
        return 2*i+1;
    }
    public static int right(int i){
        return 2*i+2;
    }
    public static int parent(int i){
        return (i-1)/2;
    }
}
