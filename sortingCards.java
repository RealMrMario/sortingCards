import java.util.Arrays;

public class sortingCards{

 public static void main(String[] args){
int[] arr = {12,5,2,7,32,5,10,9,16};
boolean swap = false;
int tal;
System.out.println("Inden sortering:");
for(int j: arr){
System.out.print(j + " ");
}
while(swap){
  swap = true;
  for (i= 0;i <arr.lenght -1;i++ ) {
    if(arr[i] >arr[i+1]){
      tal = arr[i];
      arr[i] = arr[i+1];
      arr[i+1] = tal;
    swap = false;
    }

  }
}
System.out.println("\n Efter sortering:");
for(int j: arr){
System.out.print(j + " ");
}

 }

 //public static void swap(int[] arr,int index1, int index2){

//index1 = arr[1];
//index2 = arr[2];
//arr[1] = index2;
//arr[2] = index1;


 //}

}
