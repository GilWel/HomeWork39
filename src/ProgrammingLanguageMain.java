import java.util.*;
import java.time.LocalDate;

public class ProgrammingLanguageMain {
    public static void main(String[] args) {

        ProgrammingLanguage pascal = new ProgrammingLanguage("Pascal", "Nikolaus Virt", LocalDate.of(1970, 05, 26));
        ProgrammingLanguage python = new ProgrammingLanguage("Python", "Guido Van", LocalDate.of(1991, 01, 15));
        ProgrammingLanguage zig = new ProgrammingLanguage("Zig", "Andrew Kelly", LocalDate.of(2015, 06, 21));

        List<ProgrammingLanguage> programmingLanguageArrayList = new ArrayList<>();
        programmingLanguageArrayList.add(pascal);
        programmingLanguageArrayList.add(python);
        programmingLanguageArrayList.add(zig);

        ProgrammingLanguage firstVersion = programmingLanguageArrayList.stream()
                .filter(Objects::nonNull)
                .min(Comparator.comparing(ProgrammingLanguage::getDateOfFirstVersion))
                .orElse(null);

        System.out.printf("Самым старым языком является  %s ",firstVersion);
    }

}



