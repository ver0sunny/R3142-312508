package collections;

import java.time.LocalDateTime;

public class StudyGroup implements Comparable<StudyGroup> {

    private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private int studentsCount; //Значение поля должно быть больше 0
    private int shouldBeExpelled; //Значение поля должно быть больше 0
    //private FormOfEducation formOfEducation; //Поле не может быть null
    //private Semester semesterEnum; //Поле не может быть null
    private Person groupAdmin; //Поле не может быть null

    @Override
    public int compareTo(StudyGroup groupObj) {
        return id.comareTo(groupObj.getId());
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public int getShouldBeExpelled() {
        return shouldBeExpelled;
    }

    public Person getGroupAdmin() {
        return groupAdmin;
    }
}
