import java.io.*;
import java.util.Scanner;

public class Executable {
    public static void main(String[] args){
        File file = new File("storage.txt");

        try(RandomAccessFile accessFile = new RandomAccessFile(file, "rw")) {
            checkFile(file);
            int position = getPosition(file.length());

            accessFile.seek(position);
            String res = accessFile.readLine();
            show(res);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int getPosition(Long fileLength) {
        int position;
        do {
            position = input("position to read from - ", Integer.class);
        } while(!isPositionInFileRange(position, fileLength));
        return position;
    }

    private static void checkFile(File file) throws IOException {
        if(!file.exists())
            file.createNewFile();
        if(file.length() == 0)
            addInfoToFile(input("What info do you want to have in your file?", String.class), file);
    }

    private static void addInfoToFile(String adder, File file) throws IOException {
        FileWriter out = new FileWriter(file);
        out.write(adder);
        out.flush();
        out.close();
    }

    private static boolean isPositionInFileRange(int position, Long fileLength) {
        return position < fileLength && position >= 0;
    }

    private static <T> void show(T obj) {
        System.out.println(obj.toString());
    }

    private static <T> T input(String msg, Class<T> res) {
        Scanner in = new Scanner(System.in);
        show(msg);
        if(res == Integer.class)
            return res.cast(in.nextInt());
        else if(res == String.class)
            return res.cast(in.nextLine());
        show("You did something wrong");
        return null;
    }
}
