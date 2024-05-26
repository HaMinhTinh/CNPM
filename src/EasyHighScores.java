import java.io.*;

public class EasyHighScores {
    private FileWriter fileWriter;
    private PrintWriter printWriter;

    public EasyHighScores() {
        File();
    }

    // Phương thức File() dùng để ghi và đọc
    private void File() {
        try {
            File file = new File("EasyHighScores.txt");
            file.setWritable(true);// Đặt quyền ghi cho file
            file.setReadable(true);// Đặt quyền đọc cho file
            this.fileWriter = new FileWriter("EasyHighScores.txt", true);
            this.printWriter = new PrintWriter(this.fileWriter);
        } catch (IOException var2) {
            var2.printStackTrace();
        }
    }

    //Khởi tạo phương thức write() với tham số truyền vào có kiểu dữ liệu là String để ghi chuối vào file
    public void write(String string) {
        try {
            this.printWriter.println(string + "\n");
            this.printWriter.flush();
            this.fileWriter.close();
        } catch (IOException var3) {
            var3.printStackTrace();
        }
    }

}
