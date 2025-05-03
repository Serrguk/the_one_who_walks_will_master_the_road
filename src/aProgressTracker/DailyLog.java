package aProgressTracker;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class DailyLog {
    private static final String LOG_PATH = "C:\\Users\\User\\OneDrive\\Рабочий стол\\coding_log.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сегодняшнюю запись:");

        String entry = scanner.nextLine();
        String logLine = String.format("[%s] %s%n", LocalDate.now(), entry);

        File logFile = new File(LOG_PATH);

        try (FileWriter writer = new FileWriter(logFile, true)) {
            writer.write(logLine);
            System.out.println("Запись добавлена!");

            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(logFile);
            } else {
                System.out.println("Открытие файла не поддерживается на этой системе.");
            }

        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }

}

