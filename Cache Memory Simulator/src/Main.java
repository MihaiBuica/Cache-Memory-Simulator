
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Mihai
 */
public class Main {

    /**
     *
     * @param argv
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void main(String[] argv) throws FileNotFoundException, IOException {

        File file = new File(argv[0]);
        Scanner scan = new Scanner(file);
        FileWriter filew = new FileWriter(argv[1]);
        String text;
        String[] words;
        String delims = "\\W+";
        text = scan.nextLine();
        words = text.split(delims);
        switch (words[0]) {
            case "LRU":
                {
                    MemoryLRU m = new MemoryLRU();
                    text = scan.nextLine();
                    words = text.split(delims);
                    m.setCache(Integer.parseInt(words[0]));
                    text = scan.nextLine();
                    words = text.split(delims);
                    int n;
                    n = Integer.parseInt(words[0]);
                    for (int i = 1; i <= n; i++) {
                        text = scan.nextLine();
                        words = text.split(delims);
                        if (words[0].equals("GET")) {
                            filew.write(m.GET(words[1]));
                        } else if (words[0].equals("ADD") && words.length < 4) {
                            m.ADD(words[1], Integer.parseInt(words[2]));
                        } else {
                            m.ADD(words[1], Integer.parseInt(words[2]), Integer.parseInt(words[3]));
                        }
                    }       break;
                }
            case "FIFO":
                {
                    MemoryFIFO m = new MemoryFIFO();
                    text = scan.nextLine();
                    words = text.split(delims);
                    m.setCache(Integer.parseInt(words[0]));
                    text = scan.nextLine();
                    words = text.split(delims);
                    int n;
                    n = Integer.parseInt(words[0]);
                    for (int i = 1; i <= n; i++) {
                        text = scan.nextLine();
                        words = text.split(delims);
                        if (words[0].equals("GET")) {
                            filew.write(m.GET(words[1]));
                        } else if (words[0].equals("ADD") && words.length < 4) {
                            m.ADD(words[1], Integer.parseInt(words[2]));
                        } else {
                            m.ADD(words[1], Integer.parseInt(words[2]), Integer.parseInt(words[3]));
                        }
                    }       break;
                }
            case "LFU":
                {
                    MemoryLFU m = new MemoryLFU();
                    text = scan.nextLine();
                    words = text.split(delims);
                    m.setCache(Integer.parseInt(words[0]));
                    text = scan.nextLine();
                    words = text.split(delims);
                    int n;
                    n = Integer.parseInt(words[0]);
                    for (int i = 1; i <= n; i++) {
                        text = scan.nextLine();
                        words = text.split(delims);
                        if (words[0].equals("GET")) {
                            filew.write(m.GET(words[1]));
                        } else if (words[0].equals("ADD") && words.length < 4) {
                            m.ADD(words[1], Integer.parseInt(words[2]));
                        } else {
                            m.ADD(words[1], Integer.parseInt(words[2]), Integer.parseInt(words[3]));
                        }
                    }       break;
                }
            default:
                break;
        }
        filew.close();

    }
}
