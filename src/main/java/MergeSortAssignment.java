
public class MergeSortAssignment {
    long inv = 0;

    public int[] sort(int[] inputArray) {

        return merge(inputArray, 0, inputArray.length - 1);
    }

    public int[] merge(int[] inputArray, int start, int end) {

        if (end - start < 1) {
            return new int[]{inputArray[start]};
        }

        int mid = (start + end - 1)/2;
        int[] leftArray = merge(inputArray, start, mid);
        int[] rightArray = merge(inputArray, mid + 1, end);
        int[] outputArray = new int[leftArray.length + rightArray.length];

        int i = 0, j = 0, k = 0;

        while (k < outputArray.length) {
            if (j >= rightArray.length || i < leftArray.length && leftArray[i] < rightArray[j]){
                outputArray[k] = leftArray[i];
                i ++;
            } else {
                outputArray[k] = rightArray[j];
                j ++;
                this.inv += leftArray.length - i;
            }
            k ++;
        }

        return outputArray;
    }

 }