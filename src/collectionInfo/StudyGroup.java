package collectionInfo;

import java.time.LocalDateTime;
import java.util.Objects;

public class StudyGroup implements Comparable<StudyGroup> {

    private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private int studentsCount; //Значение поля должно быть больше 0
    private int shouldBeExpelled; //Значение поля должно быть больше 0
    private FormOfEducation formOfEducation; //Поле не может быть null
    private Semester semester; //Поле не может быть null
    private Person groupAdmin; //Поле не может быть null

    public StudyGroup(Integer id, String name, Coordinates coordinates, int studentsCount, int shouldBeExpelled, Person groupAdmin) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.studentsCount = studentsCount;
        this.shouldBeExpelled = shouldBeExpelled;
        this.groupAdmin = groupAdmin;
    }

    @Override
    public int compareTo(StudyGroup groupObj) {
        return id.compareTo(groupObj.getId());
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

    public Person getGroupAdmin() { return groupAdmin; }

    public FormOfEducation getFormOfEducation() { return formOfEducation; }

    public Semester getSemester() { return semester; }

    @Override
    public String toString() {
        return  "[" + name + " " + "information]" + "\n" +
                "GroupId – " + id +
                "GroupName – " + name + "\n" +
                "GroupCoordinates – " + coordinates + "\n" +
                "GroupCreationDate – " + creationDate + "\n" +
                "StudentsCount – " + studentsCount + "\n" +
                "ShouldBeExpelled...  " + shouldBeExpelled + "\n" +
                "GroupAdmin – " + groupAdmin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (o instanceof StudyGroup) {
            StudyGroup studyGroup = (StudyGroup) o;
            return studentsCount == studyGroup.studentsCount &&
                    shouldBeExpelled == studyGroup.shouldBeExpelled &&
                    Objects.equals(name, studyGroup.name) &&
                    Objects.equals(coordinates, studyGroup.coordinates) &&
                    Objects.equals(groupAdmin, studyGroup.groupAdmin);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, coordinates, studentsCount, shouldBeExpelled, groupAdmin);
    }
}

