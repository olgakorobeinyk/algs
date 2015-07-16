public class Main {

    public static void main(String[] args) {
        int[] a = {-4, 99, 4, 4, 1, 66, 11, 10567, 100, 48, 24, 83, 31, 11, 9, 76, 66};

        ElementarySort sort = new ElementarySort();
        sort.selection(a);

        for (int i = 0; i < a.length; i ++) {
            System.out.println(a[i]);
        }


    }
}
