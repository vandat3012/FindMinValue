
public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 2, 4, 5, 6};
        int min = FindMinElement(arr);
        System.out.println("the min value in the arr is : " + arr[min]);
    }

    public static int FindMinElement(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
        return min;
    }
}