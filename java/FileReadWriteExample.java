import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) throws IOException {
        String fileName = "example.txt";
        String content = "Hello, this is some text written to the file!";

        writeToFile(fileName, content);
        String fileContents = readFromFile(fileName);
        System.out.println("File contents:\n" + fileContents);
    }

    public static void writeToFile(String fileName, String content) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(content);
        fileWriter.close();
        System.out.println("Write to file successful!");
    }

    public static String readFromFile(String fileName) throws IOException {
        StringBuilder content = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            content.append(line).append("\n");
        }

        bufferedReader.close();
        return content.toString();
    }
}
