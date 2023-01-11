import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class Main {
    public static void WholeFileRead() {
        int numOfWords = 0;
        try {
            FileReader fr = new FileReader("words");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                String[] words = line.split("\\s+");
                numOfWords = words.length;
            }
            System.out.println(numOfWords);
        } 

        catch(IOException e){
                e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        WholeFileRead();
    }

}
