import java.util.Random;

public class Doggo {

    String name;
    int age;
    String breed;
    int energy_level;
    boolean is_asleep;

    public Doggo(String name, int age, String breed) {
        Random r = new Random();

        this.name = name;
        this.age = age;
        this.breed = breed;
        this.energy_level = r.nextInt(0, 11);
        this.is_asleep = r.nextBoolean();
    }

    public String toString() {
        String s = "This is " + this.name + "! They're a " + this.age + "-years old, " + this.breed + ".\n";

        if (energy_level > 5) {
            s += "They're a incredible energetic dog, on a scale of 0 to 10 in energy they're a " + this.energy_level + ".\n";
            if (!is_asleep) {
                s += "They seem to be up and awake! Let's play with them!!";
            }
        }
        else {
            s += "This is a more chill dog, on a scale of 0 to 10 in energy they're a " + this.energy_level + ".\n";
            if (!is_asleep) {
                s += "They seem to be up and awake! Let's give them some pets!!";
            }
        }
        if (is_asleep) {
            s += "Shhhhh they seem to be sleeping right now, let's not wake them.";
        }

        return s + "\n";
    }

    public static void main(String[] args) {
        Doggo doggo1 = new Doggo("Spike", 1, "Tibetan terrier");
        System.out.println(doggo1);
        Doggo doggo2 = new Doggo("Forest", 8, "german shepherd");
        System.out.println(doggo2);
        Doggo doggo3 = new Doggo("Lyla", 3, "Rottweiler");
        System.out.println(doggo3);
    }
}