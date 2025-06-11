public class ValoOfName {
    public static void main(String[] args) {
        System.out.println("Enumeration Example");
        System.out.println("Days of the week:");

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
        // Affichage des jours de la semaine
        for (Weekday day : Weekday.values()) {
            System.out.println(day + " is day number " + day.ordinal());
        }
        // Exemple spécifique avec MONDAY
        String dayName = "MONDAY";
        Weekday day = Weekday.valueOf(dayName);
        System.out.println("Name: " + day);           // MONDAY
        System.out.println("Index: " + day.ordinal()); // 0
        System.out.println("Move on \n\n\n");
    }
}
