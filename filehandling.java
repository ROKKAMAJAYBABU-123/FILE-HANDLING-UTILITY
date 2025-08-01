package com.internship.codes;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        String fileName = "codtech_file.txt";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("CodTech Internship\nJava File Handling Task\n");
            writer.close();
            System.out.println("✅ File written successfully.");

            System.out.println("\n📄 File content:");
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            FileWriter appender = new FileWriter(fileName, true);
            appender.write("📌 Modification: Line added later.\n");
            appender.close();
            System.out.println("\n✅ File modified successfully.");

        } catch (IOException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
