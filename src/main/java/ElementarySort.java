
public class ElementarySort {

    public void selection(int[] array) {
        int min, minIndex;

        for (int i = 0; i < array.length; i ++) {
            min = array[i];
            minIndex = i;
            for (int j = i+1; j < array.length; j ++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

    }


}
