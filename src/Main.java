public class Main {

    public static void main(String[] args) {
        int[] array = {5,25,45,31,95,12,34};
        int diference = getDiff(array);
        System.out.println(diference);
    }

    public static int getDiff(int[] array) {
        return findMax(array) - findMin(array);
    }

    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("El array debe tener al menos una longitud de 1");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
