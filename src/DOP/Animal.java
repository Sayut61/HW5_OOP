package DOP;

import java.util.Objects;

public class Animal {
    String name;
    int age;
    boolean tail;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public String toString() {
        return ("Имя: " + name + ", возраст: " + age + ", хвост: " + tail);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            Animal animal = (Animal) obj;
            boolean res1 = animal.name == this.name;
            boolean res2 = animal.age == this.age;
            boolean res3 = animal.tail == this.tail;
            return res1 && res2 && res3;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 37;

        result = 37 * result + (name != null ? name.hashCode() : 0);
        result = 37 * result + age;
        result = 37 * result + (tail ? 1 : 0);
        return result;
    }

}

