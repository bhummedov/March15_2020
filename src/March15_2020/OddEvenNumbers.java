package March15_2020;

import java.util.Arrays;

public class OddEvenNumbers{
    int size;
    public  OddEvenNumbers(){
        this.size =5;
    }
    public int[] returnArray(){
        int[] num=new int[this.size];
        int i=2;
        for (int j = 0; j <this.size ; j++) {
            num[j]=i;
            i+=2;
        }
        return num;
    }
    public void printOdds(int arr[]){
        for (int i=0; i<arr.length; i++){
            if (i%2==1){
                System.out.println("i= \t"+i);

            }
        }
    }

    public void evenIndex() {
        int[] num = {0, 1, 2, 3, 44, 5, 6,};
        for (int i = 1; i < this.size; i++) {
            if ((num[i] / 2) != 0) {
                System.out.print(this.size + " ");
            }
            System.out.println();
        }
    }
    public void printLargest (){
        int[] num = {0, 1, 2, 3, 44, 5, 6,};
        int largest = num[0];
        for (int i = 0 ; i<size ; i++){
            if (num[i] > largest  ){
                largest = num[i] ;
            }
        }
        System.out.println(largest);
    }
   public void printSmallest (){
       int[] num = {0, 1, 2, 3, 44, 5, 6,};
        int smallest = num[0];
        for (int i = 0 ; i<size ; i++){
            if (num[i] < smallest  ){
                smallest = num[i] ;
            }
        }
        System.out.println(smallest);
    }

    public static void main(String[] args) {
        OddEvenNumbers myObj = new OddEvenNumbers();
        int[]array1=myObj.returnArray();
        System.out.println(Arrays.toString(array1));
        myObj.printOdds(array1);
    }
}


