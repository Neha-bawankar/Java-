public class ForEach {
    public static void main(String[] args) {
        String[] array = new String[]{
                "Ram" , "Shyam", "Mohan" ,"Gita", "Sita"
        };

printArrayForEach(array);

    }
   // foreach loop exmple
    public static void printArrayForEach(String[] array){
        for(String name: array){
            System.out.println(name);
        }
    }

    //for loop example
    public static void printArray(String[] array){
         for(int i = 0; i< array.length; i++){
             System.out.println(array[i]);
        }
    }
}
