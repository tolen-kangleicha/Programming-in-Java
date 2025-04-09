import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class ReadWrite1 {
  void copyFile() throws IOException {
    FileInputStream fin = null;
    FileOutputStream fout = null;

    try {
      fin = new FileInputStream("A.txt");
      fout = new FileOutputStream("B.txt");

      int data;
      while ((data = fin.read()) != -1) {
        fout.write(data);
      }
    } finally {
      if (fin != null) fin.close();
      if (fout != null) fout.close();
    }
  }
}

public class ReadWriteDemo {
  public static void main(String[] args) {
    ReadWrite1 rw = new ReadWrite1();
    try {
      rw.copyFile();
      System.out.println("File copied successfully!");
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("IO Error: " + e.getMessage());
    }
  }
}
