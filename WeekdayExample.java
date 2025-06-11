// Déclaration de l'énumération des jours de la semaine
enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class WeekdayExample {

    public static void main(String[] args) {
        System.out.println("Enumeration Example");
        System.out.println("Days of the week:");

        // .values() retourne un tableau contenant tous les jours
        for (Weekday day : Weekday.values()) {
            System.out.println(day + " is day number " + day.ordinal());
        }

        // Exemple spécifique avec MONDAY
        System.out.println("Name: " + Weekday.MONDAY);           // MONDAY
        System.out.println("Index: " + Weekday.MONDAY.ordinal()); // 0
    }
}
