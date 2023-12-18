
public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 2, 4, 5, 6};
        int newArr = FindMinElement(arr);
        System.out.println("the min value in the arr is : " + newArr);
    }

    public static int FindMinElement(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}