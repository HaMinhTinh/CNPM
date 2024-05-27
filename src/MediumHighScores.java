import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MediumHighScores {
    private PrintWriter printWriter;
    private FileWriter fileWriter;

    public MediumHighScores() {
        File();
    }

    // Phương thức File() dùng để ghi và đọc
    public void File() {
        try {
            File file = new File("MediumHighScores.txt");
            file.setWritable(true);
            file.setReadable(true);
            fileWriter = new FileWriter("MediumHighScores.txt", true);
            printWriter = new PrintWriter(fileWriter);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    //Khởi tạo phương thức write() với tham số truyền vào có kiểu dữ liệu là String để ghi chuối vào file
    public void write(String string) {
        try {
            printWriter.println(string + "\n");
            printWriter.flush();
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sort() {
        try {
            File file = new File("MediumHighScores.txt");
            file.setWritable(true);
            file.setReadable(true);
            FileReader fileReader = new FileReader("MediumHighScores.txt");

            // Tạo đối tượng BufferedReader để đọc từng dòng từ FileReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            List<String> lines = new ArrayList<String>();
            String line = null;

            // Đọc từng dòng từ tập tin và thêm vào danh sách
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }

            bufferedReader.close();
            Collections.sort(lines, Collections.reverseOrder());

            // Tạo đối tượng FileWriter để ghi lại vào tập tin
            FileWriter fileWriter = new FileWriter("MediumHighScores.txt");

            // Ghi từng dòng đã sắp xếp vào lại tập tin
            for (String string : lines) {
                fileWriter.write(string + "\r\n");
            }
            fileWriter.close();
            file.setReadOnly();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}