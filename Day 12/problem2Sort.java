

public class problem2Sort {
   static void sortFruits(String[]fruits){
   int n=fruits.length;
   for(int i=0;i<n-1;i++){
    int min_index=i;
    for(int j=i+1;j<n;j++){
        if(fruits[j].compareTo(fruits[min_index])<0){
          min_index=j;  
        }
    }
    //swap fruits[min_index],fruits[i]
    String temp=fruits[i];
    fruits[i]=fruits[min_index];
    fruits[min_index]=temp;
   }
   }
   public static void main(String[] args) {
    // Give an array of names of the fruits,you supposed to sort it in lexicograhical order using the selection sort 
    // Input:["Papaya","lime","watermelon","apple","mango","kiwi"]
    // Output:["apple","kiwi","mango","papaya","watermelon"]
    // selection sort

    // minimum element select correct order
    String []fruits={"Papaya","lime","watermelon","apple","mango","kiwi"};
    sortFruits(fruits);
    for(String val:fruits){
        System.out.print(val+" ");
    }
   } 
}
