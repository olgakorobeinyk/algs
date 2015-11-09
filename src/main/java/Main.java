public class Main {

    public static void main(String[] args) {
        int[] a = new Utils().getArrayFromFile("./src/main/java/IntegerArray.txt", 100000);

        /*for (int i = 0; i < a.length; i ++) {
            System.out.println(a[i]);
        }*/

        MergeSortAssignment msa = new MergeSortAssignment();
        msa.sort(a);
        System.out.println(msa.inv);

    }
}
