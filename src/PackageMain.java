import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PackageMain {


    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package("Brussels", "Berlin", 8.5,  (zonedDateTime.withZoneSameInstant(ZoneId.of("Europe/Brussels")))));
        packageList.add(new Package("Gibraltar", "Moscow", 11.8,  (zonedDateTime.withZoneSameInstant(ZoneId.of("Europe/Gibraltar")))));
        packageList.add(new Package("Kolkata", "Berlin", 25.6, (zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Kolkata")))));
        packageList.add(new Package("Paris", "Santo_Domingo ", 31.5,  (zonedDateTime.withZoneSameInstant(ZoneId.of("Europe/Paris")))));
        packageList.add(new Package( "Bangkok", "Berlin", 28.9, (zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Bangkok")))));
        packageList.add(new Package("Cocos", "Berlin", 20.7,  (zonedDateTime.withZoneSameInstant(ZoneId.of("Indian/Cocos")))));
        packageList.add(new Package("Yancowinna", "Araguaina", 26.8,  (zonedDateTime.withZoneSameInstant(ZoneId.of("Australia/Yancowinna")))));
        packageList.add(new Package("Montevideo", "Berlin", 15.6,  (zonedDateTime.withZoneSameInstant(ZoneId.of("America/Montevideo")))));

   Package newPackageToBerlin =packageList.stream()
           .filter((p ->p.getCityOfReceipt().equalsIgnoreCase("Berlin")))
           .max(Comparator.comparing(Package-> Package.getZonedDateTime()))
           .orElse(null);
        System.out.println("Самая новая посылка на Берлин - " + newPackageToBerlin);
    }
}