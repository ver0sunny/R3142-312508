package collectionInfo;

public enum Semester {
    SECOND,
    FOURTH,
    FIFTH,
    SEVENTH,
    EIGHTH;

    public static String listAll() {
        String listAll = "";
        for (Semester semester : values()) {
            listAll += semester.name() + ", ";
        }
        return listAll;
    }
}
