package session_9_arrays.challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge10 {
    public static void main(String[] args) {
        ArrayList<String> diaryEntries = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Personal Diary Menu:");
            System.out.println("1. Add a new entry");
            System.out.println("2. Edit an existing entry");
            System.out.println("3. Delete an entry");
            System.out.println("4. Display all entries");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    System.out.print("Enter the diary entry: ");
                    String entry = scanner.nextLine();

                    boolean dateExists = false;
                    for (String existingEntry : diaryEntries) {
                        if (existingEntry.startsWith(date + ":")) {
                            System.out.println("Entry for this date already exists.");
                            dateExists = true;
                            break;
                        }
                    }

                    if (!dateExists) {
                        diaryEntries.add(date + ": " + entry);
                        System.out.println("Entry added successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the date of the entry to edit (YYYY-MM-DD): ");
                    String editDate = scanner.nextLine();
                    boolean foundToEdit = false;

                    for (int index = 0; index < diaryEntries.size(); index++) {
                        if (diaryEntries.get(index).startsWith(editDate + ":")) {
                            System.out.print("Enter the new diary entry: ");
                            String newEntry = scanner.nextLine();
                            diaryEntries.set(index, editDate + ": " + newEntry);
                            System.out.println("Entry updated successfully.");
                            foundToEdit = true;
                            break;
                        }
                    }

                    if (!foundToEdit) {
                        System.out.println("No entry found for this date.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the date of the entry to delete (YYYY-MM-DD): ");
                    String deleteDate = scanner.nextLine();
                    boolean foundToDelete = false;

                    for (int index = 0; index < diaryEntries.size(); index++) {
                        if (diaryEntries.get(index).startsWith(deleteDate + ":")) {
                            diaryEntries.remove(index);
                            System.out.println("Entry deleted successfully.");
                            foundToDelete = true;
                            break;
                        }
                    }

                    if (!foundToDelete) {
                        System.out.println("No entry found for this date.");
                    }
                    break;

                case 4:
                    diaryEntries.sort((entry1, entry2) -> {
                        String date1 = entry1.split(":")[0];
                        String date2 = entry2.split(":")[0];
                        return date2.compareTo(date1);
                    });

                    System.out.println("Diary Entries (Reverse Chronological Order):");
                    for (String diaryEntry : diaryEntries) {
                        System.out.println(diaryEntry);
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}