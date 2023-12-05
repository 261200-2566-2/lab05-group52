public class Main {
    public static void main(String[] args) {
        // Create instances of your classes
        human humanCharacter = new human();
        undead undeadCharacter = new undead();
        sword humanSword = new sword();
        ward undeadWard = new ward();

        // Set initial information and stats for characters
        humanCharacter.characterinfomation("John", "Male");
        humanCharacter.defaultstat();
        undeadCharacter.characterinfomation("Zombie", "Unknown");
        undeadCharacter.defaultstat();

        // Display initial stats
        System.out.println("Initial Stats for Human:");
        humanCharacter.getstat();
        System.out.println("\nInitial Stats for Undead:");
        undeadCharacter.getstat();

        // Equip accessories
        humanCharacter.equip(humanSword);
        undeadCharacter.equip(undeadWard);
        humanCharacter.equip(humanSword);
        undeadCharacter.equip(undeadWard);

        humanCharacter.levelup();
        undeadCharacter.levelup();


        // Display stats after equipping accessories
        System.out.println("\nStats for Human after equipping sword:");
        humanCharacter.getstat();
        System.out.println("\nStats for Undead after equipping ward:");
        undeadCharacter.getstat();

        // Unequip accessories
        humanCharacter.unequip();
        undeadCharacter.unequip();
        humanCharacter.unequip();
        undeadCharacter.unequip();

        // Display stats after unequipping accessories
        System.out.println("\nStats for Human after unequipping:");
        humanCharacter.getstat();
        System.out.println("\nStats for Undead after unequipping:");
        undeadCharacter.getstat();
    }
}
