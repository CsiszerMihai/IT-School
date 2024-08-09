package session_20_recap.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem4 {

    public static void main(String[] args) {
        List<Map<LocalDate, String>> entries = new ArrayList<>();

        Map<LocalDate, String> entry = new HashMap<>();
        entry.put(LocalDate.now(), "This is my first entry");
        entry.put(LocalDate.now().minusDays(1), "This is my second entry");
        entry.put(LocalDate.now().minusDays(2), "This is my third entry");

        entries.add(entry);

        Diary diary = new Diary(entries);

        LocalDate searchDate = LocalDate.now().minusDays(1);

        Map<LocalDate, String> diaryMap = diary.getEntries().get(0);
        String diaryContent = diaryMap.get(searchDate);
        System.out.println(diaryContent);
    }
}