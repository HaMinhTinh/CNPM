import java.io.*;

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

}