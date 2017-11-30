import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Gallifrey> doctors = new ArrayList<>();
        StringBuilder content = new StringBuilder();
        String path = "statistics.txt";
        doctors.add(new TheNinthDoctorCreator());
        doctors.add(new TheTenthDoctorCreator());
        doctors.add(new TheEleventhDoctorCreator());
        doctors.forEach((Gallifrey doctor) -> {
            Doctor temp = doctor.makeDoctor();
            sendToTheEarth(temp);
            content.append(temp.getName() + " ");
            content.append(temp.getFavoriteWord()+ "\r\n");
                }
        );
        writeStatisticsAboutDoctors(path,content.toString());
        System.gc();

    }


    public static void sendToTheEarth(Doctor doctor) {
        System.out.println("Actor is " + doctor.getName());
        System.out.println("Companions: " + doctor.getCompanionName());
        System.out.println("Enemies: " + doctor.getEnimmiesName());
        System.out.println("Screwdriver's version is " + doctor.getScrewdriverVersion());
        System.out.println("He usually cry: " + doctor.getFavoriteWord());
        System.out.println();
    }
    public static void writeStatisticsAboutDoctors(String path, String content) {
        FileOutputStream fileOutputStream = null;
        File file;
        try {
            file = new File(path);
            fileOutputStream = new FileOutputStream(file);

            if(!file.exists()) {
                file.createNewFile();
            }
            byte[] bytesContent = content.getBytes();
            fileOutputStream.write(bytesContent);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
