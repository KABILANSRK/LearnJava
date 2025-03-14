package Notes;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NoteMaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("1.Add Note\n2.View Note\n3.Delete Note\n4.Exit");
            System.out.println("Enter the choice: ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    Scanner s1 = new Scanner(System.in);
                    System.out.println("Enter the Note Title:");
                    String title = s1.nextLine();
                    System.out.println("Enter the content: ");
                    String content = s1.nextLine();
                    Notes note = new Notes(title, content);
                    note.saveNote();
                    break;
            
                case 2:
                    Scanner s2 = new Scanner(System.in);
                    System.out.println("Enter the title:");
                    String viewnote = s2.nextLine();
                    Notes.viewNotes(viewnote);
                    break;

                case 3:
                    Scanner s3 = new Scanner(System.in);
                    System.out.println("Enter the note title to delete:");
                    String deltitle = s3.nextLine();
                    Notes.deleteNote(deltitle);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    flag = false;
                    break;

                default:
                System.out.println("Enter the correct option...");
                    break;
            }
        }
    }
}

class Notes {
    private String title;
    private String content;
    
    public Notes (String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void saveNote() {
        try (FileWriter fw = new FileWriter(title + ".txt")) {
            fw.write(content);
            System.out.println("File saved successfully..");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    public static void viewNotes(String title) {
        File file = new File(title + ".txt");
        if (!file.exists()) {
            System.out.println("File not found");
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println("Note: " + title);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    public static void deleteNote(String title) {
        File file = new File(title+".txt");
        if (file.delete()) {
            System.out.println("File deleted successfully..");
        }
        else{
            System.out.println("File not found..");
        }
    }
}