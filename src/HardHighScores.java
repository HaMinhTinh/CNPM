import java.io.*;

public class HardHighScores {
    private PrintWriter printWriter;
    private FileWriter fileWriter;

    public HardHighScores() { File(); }

    //Load file hard high scores
    //Neu chua co file se tao ra file do
    public void File() {
        try {
            File file = new File("HardHighScores.txt");
            file.setWritable(true);
            file.setReadable(true);
            fileWriter = new FileWriter("HardHighScores.txt", true);
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
