import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ordinamento {
    private static final ArrayList<Integer> obj= new ArrayList<Integer>();

    private static final int  [] num={332,1155,1212,4545,2214,5789,6784,9854,9456};
    public static void main (String [] args){

    //printArray(num);
    Inserimentovalori(num,obj);
    printlist(obj);
    SelecSortList(obj);
   // heapSort heap = new heapSort(num);
    //heap.HeapSort();
        //QuickSort.Quicksort(num,0,num.length-1);
        //new CountingSort(num).sort();
        //new RadixSort(num).sort();
        //MergeSort.mergeSort(num);
    //InsertionSort(num);
    //SelectSortOtt(num);
        //scambio(num,1,2);
    //SelectSort(num);
   // BubbleSort(num);
    System.out.println("\n");
    printlist(obj);
  //  printArray(num);


    }
    public static void Inserimentovalori(int [] arr , ArrayList<Integer> list){
        for(int i=0;i<arr.length;i++)
            list.add(arr[i]);
    }

    public static void SelecSortList(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            int min=i;
            for(int j=i+1;j<list.size();j++){
                if(list.get(j)<list.get(min))
                    min=j;
                }if(min!=i){

                    int tmp=list.get(min);
                    list.set(min,list.get(i));
                    list.set(i,tmp);

                }
            }
        }


    public static void SelectSort(int [] arr ){
        for(int i=0;i<arr.length;i++){
            int min=i; //si parte dall'iesimo elemento
            for(int j=i+1;j<arr.length;j++){
                //ogni volta che nell'iterazione troviamo un elemento più piccolo di min **
                if(arr[j]<arr[min])
                    //**facciamo puntare min all'elemento trovato
                    min=j;
            }//se minimo è diverso dall'elemento di partenza allora avviene lo scambio
            if(min!=i){
                //scambio(arr,min,i);
                int tmp=arr[min];
                arr[min]=arr[i];
                arr[i]=tmp;
            }
        }

    }

    public static void InsertionSort(int [] arr){
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while((j>-1)&&(arr[j]>key)){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
            }
        }


    public static void SelectSortOtt(int [] arr){
        int min;
        for(int i=0;i<=arr.length-2;i++){
            min=i;
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
                //scambio(arr,min,i);
                int tmp=arr[min];
                arr[min]=arr[i];
                arr[i]=tmp;
            }
        }
    }

    public static void BubbleSort(int [] arr){
        for(int i =0 ;i < arr.length;i++){
            boolean flag = false;
            for(int j=0;j< arr.length-1;j++){
                //se l'elemento j è maggiore del successivo allora si scambiano i valori
                if(arr[j]>arr[j+1]){
                    //scambio(arr,j,j+1);
                    int temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if (!flag)break;
        }
    }



    public static void scambio(int [] val,int i,int j){
        int tmp=val[i];
        val[i]=val[j];
        val[j]=tmp;
    }
    public static void println(int str){
        System.out.print(str +" ");

    }

    public static void printArray(int [] arr){
        for(int i =0 ; i<arr.length; i++){
            println(arr[i]);
        }
    }
    public static void printlist(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++)
            println(list.get(i));
    }
}


