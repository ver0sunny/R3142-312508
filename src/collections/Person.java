package collections;

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

}
