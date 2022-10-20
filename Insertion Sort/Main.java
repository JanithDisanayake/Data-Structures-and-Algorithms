class InsertionSort {

    private int arr[];
    private int key;

    public InsertionSort(int arr[]) {
        this.arr = arr;
    }

    public int[] sort() {

        for(int i = 1; i<arr.length; i++) {
            key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public void print() {
        for(int value: this.arr) {
            System.out.println(value);
        }
    }
}


public class Main {
    public static void main(String[] args) {

        int my_array[] = {2,7,5,8,6,3};

        InsertionSort insertionSort = new InsertionSort(my_array);
        insertionSort.sort();
        insertionSort.print();

    }
    
}