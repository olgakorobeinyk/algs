import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Utils {

    public int[] getArrayFromFile(String relativeFilePath, int size){
        int[] array = new int[size];
        try {
            File file = new File(relativeFilePath);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            for (int i = 0; i < size; i ++){
                int number = Integer.parseInt(br.readLine());
                array[i] = number;
            }
        } catch (Exception e) {
            throw new Error("Cann't read file");
        }
        return array;
    }

}
