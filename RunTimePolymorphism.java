/*Run time polymorphism : Achieved by method Overriding*/
class Hobby {
    void doActivity() {
        System.out.println("Enjoying a hobby!");
    }
}

class Painting extends Hobby {
    void doActivity() {
        System.out.println("Painting beautiful landscapes");
    }
}

class Dancing extends Hobby {
    void doActivity() {
        System.out.println("Dancing gracefully to favorite tunes");
    }
}

class Cooking extends Hobby {
    void doActivity() {
        System.out.println("Cooking delicious dishes");
    }
}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        Hobby h;

        h = new Painting();
        h.doActivity();

        h = new Dancing();
        h.doActivity();

        h = new Cooking();
        h.doActivity();
    }
}
