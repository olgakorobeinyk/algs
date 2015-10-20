
public class ProgrammingSetOne {

    public long insertionsNumber(int[] array) {
        long insertion = 0;
        mergeSort(array);

        return insertion;
    }

    public int[] mergeSort(int[] array) {
        boolean isEven = false;
        int[] mergedArray = new int[array.length];
        if (array.length % 2 == 0) {
            isEven = true;
        }
        if (array.length > 1) {
            int length;
            int[] leftArray;
            int[] rightArray;
            if (isEven) {
                length = array.length/2;
                leftArray = new int[length];
                rightArray = new int[length];

            } else {
                length = array.length/2 + 1;
                leftArray = new int[length];
                rightArray = new int[length - 1];
            }
            for (int i = 0; i < length; i ++) {
                leftArray[i] = array[i];
                for (int j = i + 1; j < leftArray.length; j ++) {
                    if (leftArray[i] > leftArray[j]) {
                        int temp = leftArray[i];
                        leftArray[i] = leftArray[j];
                        leftArray[j] = temp;
                    }
                }
            }
            for (int i = length; i < array.length; i ++) {
                int k = 0;
                rightArray[k] = array[i];
                k ++;
                for (int j = i + 1; j < rightArray.length; j ++) {
                    if (rightArray[i] > rightArray[j]) {
                        int temp = rightArray[i];
                        rightArray[i] = rightArray[j];
                        rightArray[j] = temp;
                    }
                }
            }
            this.mergeSort(leftArray);
            this.mergeSort(rightArray);

            for (int i = 0; i < array.length; i ++) {
                for (int j = 0; j < length; j ++){
                    if (leftArray[j] < rightArray[j]) {
                        mergedArray[i] = leftArray[j];
                    }
                }

                
            }

        }

        return mergedArray;
    }

 }