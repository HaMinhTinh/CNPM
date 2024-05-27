import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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

    // Phương thức sort() dùng để sắp xếp các chuỗi trong file theo thứ tự giảm dần
    public void sort() {
        try {
            File file = new File("EasyHighScores.txt");
            FileReader fileReader = new FileReader("EasyHighScores.txt");// Khởi tạo FileReader để đọc file
            BufferedReader bufferedReader = new BufferedReader(fileReader);// Khởi tạo BufferedReader để đọc từng dòng
            List<String> lines = new ArrayList<>();// Tạo danh sách để lưu các dòng đọc từ file
            String line = null;

            // Đọc từng dòng từ file và thêm vào danh sách lines
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }

            bufferedReader.close();// Đóng BufferedReader sau khi đọc xong
            Collections.sort(lines, Collections.reverseOrder());// Sắp xếp danh sách lines theo thứ tự giảm dần
            FileWriter fileWriter = new FileWriter("EasyHighScores.txt");// Khởi tạo FileWriter để ghi lại nội dung đã sắp xếp
            Iterator<String> var7 = lines.iterator();

            // Duyệt qua danh sách lines và ghi từng chuỗi vào file
            while (var7.hasNext()) {
                String string = var7.next();
                fileWriter.write(string + "\r\n");
            }

            fileWriter.close();
            file.setReadOnly();
        } catch (IOException var9) {
            var9.printStackTrace();
        }
    }

}
