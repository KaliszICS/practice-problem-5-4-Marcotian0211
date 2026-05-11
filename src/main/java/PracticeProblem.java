public class PracticeProblem {

	public static void main(String args[]) {

	}
public static void stringSwap(String[] arr, int index1, int index2) {

    String temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
}
public static void reverse(int[] arr) {

    int start = 0;
    int end = arr.length - 1;

    while (start < end) {

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
    }
}
public static String[] toWordArray(String str) {

    String[] words = str.split(" ");


    int count = 0;

    for (int i = 0; i < words.length; i++) {

        if (!words[i].equals("")) {
            count++;
        }
    }

    String[] result = new String[count];

    int index = 0;

    for (int i = 0; i < words.length; i++) {

        if (!words[i].equals("")) {
            result[index] = words[i];
            index++;
        }
    }

    return result;
}
}
