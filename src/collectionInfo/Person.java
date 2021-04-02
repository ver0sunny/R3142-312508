package collectionInfo;

import java.util.Objects;

public class Person {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Integer height; //Поле может быть null, Значение поля должно быть больше 0
    private Integer weight; //Поле не может быть null, Значение поля должно быть больше 0
    private String passportID; //Длина строки должна быть не меньше 10, Строка не может быть пустой, Поле не может быть null

    public Person(String name, Integer height, Integer weight, String passportID) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.passportID = passportID;
    }

    public String getName() {
        return name;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getPassportID() {
        return passportID;
    }

    @Override
    public String toString() {
        return "[Admin] \n" +
                "Name – " + name + "\n" +
                "Height=" + height + "\n" +
                "Weight=" + weight + "\n" +
                "PassportID='" + passportID + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (o instanceof Person) {
            Person person = (Person) o;
            return Objects.equals(name, person.name) &&
                    Objects.equals(height, person.height) &&
                    Objects.equals(weight, person.weight) &&
                    Objects.equals(passportID, person.passportID);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight, passportID);
    }
}