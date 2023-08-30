abstract class rrCampus {
    void display() {
    }

    void detail() {
        System.out.println("I am the student of Ratna RajyaLaxmi Campus.");
    }
}

class Khem extends rrCampus {
    String name;
    String faculty;

    public Khem(String name, String faculty) {
        this.name = name;
        this.faculty = faculty;
    }

    void display() {
        super.detail();
        System.out.println("My name is " + name + ". I read in " + faculty + " Faculty.");
    }
}

public class Abstract {
    public static void main(String[] args) {
        rrCampus r = new Khem("Khem", "BCA");
        r.display();
    }
}
