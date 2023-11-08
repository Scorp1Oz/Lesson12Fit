public class Project {
    public static void main(String[] args) {
        FitnessTrackerUser user1 = new FitnessTrackerUser("John", 15, 5, 1990, "john@example.com", "123-456-7890");
        user1.setLastName("Doe");
        user1.setWeight(70.5);
        user1.setBloodPressure("120/80");
        user1.setStepsPerDay(10000);

        FitnessTrackerUser user2 = new FitnessTrackerUser("Alice", 20, 8, 1985, "alice@example.com", "987-654-3210");
        user2.setLastName("Smith");
        user2.setWeight(65.2);
        user2.setStepsPerDay(8000);

        FitnessTrackerUser user3 = new FitnessTrackerUser("Bob", 10, 2, 2000, "bob@example.com", "555-123-4567");
        user3.setLastName("Johnson");
        user3.setWeight(80.0);
        user3.setBloodPressure("130/70");
        user3.setStepsPerDay(12000);

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
    }
}
