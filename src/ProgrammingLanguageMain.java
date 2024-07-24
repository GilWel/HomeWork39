import java.util.*;
import java.time.LocalDate;

public class ProgrammingLanguageMain {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(1970, 05, 26);
        LocalDate localDate2 = LocalDate.of(1991, 01, 15);
        LocalDate localDate3 = LocalDate.of(2015, 06, 21);


        ProgrammingLanguage pascal = new ProgrammingLanguage("Pascal", "Nikolaus Virt", localDate1);
        ProgrammingLanguage python = new ProgrammingLanguage("Python", "Guido Van", localDate2);
        ProgrammingLanguage zig = new ProgrammingLanguage("Zig", "Andrew Kelly", localDate3);

        List<LocalDate> localDates = new ArrayList<>();
        localDates.add(localDate1);
        localDates.add(localDate2);
        localDates.add(localDate3);

        List<ProgrammingLanguage> programmingLanguageArrayList = new ArrayList<>();
        programmingLanguageArrayList.add(pascal);
        programmingLanguageArrayList.add(python);
        programmingLanguageArrayList.add(zig);


        ProgrammingLanguage firstVersion = programmingLanguageArrayList.stream()
                .filter(Objects::nonNull)
                .min(Comparator.comparing(ProgrammingLanguage::getDateOfFirstVersion))
                .orElse(null);

        System.out.println("Самым старым языком является " + firstVersion);
    }

}



