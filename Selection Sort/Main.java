public class Main {
    public static void main(String[] args) {
        SelectionSort sc = new SelectionSort();
        int[] arr = {10,3,6,3,6,7,};
        arr = sc.sort(arr);

        for(int element : arr) {
            System.out.println(element);
        }
    }
}
