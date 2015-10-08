
public class ElementarySort {

    public void selection(int[] array) {

        int min, minIndex;

        for (int i = 0; i < array.length - 1; i ++) {
            min = array[i];
            minIndex = i;
            for (int j = i + 1; j <array.length; j ++) {
                if (array[j] < min){
                    min = array[j];
                    minIndex = j;
                }
            }
            array[minIndex] = array[i];
            array[i] = min;
        }
    }

    public void insertion(int[] array) {

        for (int i = 1; i < array.length; i ++){
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j+1] = array[j];
                j --;
            }
            array[j+1] = temp;
        }

        /*for (int i = 1; i < array.length; i ++) {
            for (int j = i-1; j >= 0; j --) {
                if (array[j+1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                } else {
                    break;
                }
            }
        }*/
    }

    public void bubble(int[] array) {

        for (int i = 0; i < array.length - 1; i ++) {
            for (int j = i + 1; j < array.length; j ++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
    }

}
