public class Main {
    public static void main(String[] args) {

        int my_array[] = {2,7,5,8,6,3};

        InsertionSort insertionSort = new InsertionSort(my_array);
        insertionSort.sort();
        insertionSort.print();

    }
    
}