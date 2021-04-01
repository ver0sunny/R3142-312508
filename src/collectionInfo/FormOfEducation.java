package collectionInfo;

public enum FormOfEducation {
    DISTANCE_EDUCATION,
    FULL_TIME_EDUCATION,
    EVENING_CLASSES;

    public static String listAll() {
        String listAll = "";
        for (FormOfEducation formOfEducation : values()) {
            listAll += formOfEducation.name() + ", ";
        }
        return listAll;
    }
}
