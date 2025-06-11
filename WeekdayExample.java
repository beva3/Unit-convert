// Déclaration de l'énumération des jours de la semaine
enum Weekday {
    MONDAY, 
    TUESDAY, 
    WEDNESDAY, 
    THURSDAY, 
    FRIDAY, 
    SATURDAY, 
    SUNDAY
}

enum Rate{
    LOW("Low Rate"), 
    MEDIUM("Medium Rate"), 
    HIGH("High Rate");

    private String description;
    Rate(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
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

        System.out.println("Move on \n\n\n");
        System.out.println("Rate Example");

        // Affichage des taux
        for (Rate rate : Rate.values()) {
            System.out.println(rate + " - " + rate.getDescription() + " - "+rate.ordinal());
        }
    }
}
