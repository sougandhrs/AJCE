import java.io.*;

public class CO6Q2 {
    public static void main(String[] args) {
        String sourceFileName = "source.txt";
        String targetFileName = "target.txt";

        try (InputStream inputStream = new FileInputStream(sourceFileName);
             OutputStream outputStream = new FileOutputStream(targetFileName)) {
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

