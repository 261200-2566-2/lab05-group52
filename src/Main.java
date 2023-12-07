public class Main {
    public static void main(String[] args) {
        // Create instances of your classes
        human humanCharacter = new human();
        undead undeadCharacter = new undead();
        sword humanSword = new sword();
        ward undeadWard = new ward();
        sword undeadSword = new sword();
        ward humanWard = new ward();

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
        System.out.println();

        // Equip accessories
        humanCharacter.equip(humanSword);
        undeadCharacter.equip(undeadWard);
        humanCharacter.equip(humanSword);
        undeadCharacter.equip(undeadWard);
//        humanCharacter.equip(humanWard);
//        undeadCharacter.equip(undeadSword);
        System.out.println();

        humanCharacter.levelup();
        undeadCharacter.levelup();
        System.out.println();

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
        System.out.println();

        humanCharacter.attack(undeadCharacter);
        System.out.println("\nStats for Human after attack:");
        humanCharacter.getstat();
        System.out.println("\nStats for Undead after has been attack:");
        undeadCharacter.getstat();
        System.out.println();

        undeadCharacter.attack(humanCharacter);
        System.out.println("\nStats for Undead after attack:");
        undeadCharacter.getstat();
        System.out.println("\nStats for Human after has been attack:");
        humanCharacter.getstat();
        System.out.println();

        humanCharacter.attack(undeadCharacter);
        System.out.println("\nStats for Human after attack:");
        humanCharacter.getstat();
        System.out.println("\nStats for Undead after has been attack:");
        undeadCharacter.getstat();

    }
}
