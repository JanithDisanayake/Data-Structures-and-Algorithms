public class Main {
    public static void main(String[] args) {
        SelectionSort sc = new SelectionSort();
        int[] arr = {10,3,6,1,2,7,};
        arr = sc.sort(arr);
        sc.print(arr);
    }
}
