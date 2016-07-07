
public class Main {
    public static void main(String[] args) {
        // write testcode here
        
    }
    public static int smallest( int[] array){
        int smallest = array[0];
        for (int i : array) {
            if ( i < smallest ) {
                smallest = i;
            }
        }
        return smallest;
    }
    
    public static int indexOfTheSmallest( int[] array ){
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if ( smallest(array) == array[i]) {
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom( int[] array, int index){
        int small = index;
        for (int i = index ; i < array.length; i++) {
            if ( array[i] < array[small] ) {
                small = i;
            }
        }
        return small;
    }
    
    public static void swap( int[] array, int index1, int index2 ){
        int swapper = 0;
        swapper = array[index1]; 
        array[index1] = array[index2];
        array[index2] = swapper;
    }
    public static void sort( int[] array){
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
        }
    }
}
