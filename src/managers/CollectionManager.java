package managers;

import collectionInfo.FormOfEducation;
import collectionInfo.StudyGroup;
import exceptions.CollectionIsEmptyException;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.LinkedList;

public class CollectionManager {
    private LinkedList<StudyGroup> studyGroupsCollection;
    private LocalDateTime creationTime;
    private final FileManager fileManager;

    public CollectionManager(FileManager fileManager) {
        this.fileManager = fileManager;
        this.studyGroupsCollection = loadCollection();
    }

    public LinkedList<StudyGroup> getCollection() {
        return studyGroupsCollection;
    }

    public int getCollectionSize() {
        return studyGroupsCollection.size();
    }

    public void addToCollection(StudyGroup studyGroup) {
        studyGroupsCollection.add(studyGroup);
    }

    public void clearCollection() {
        studyGroupsCollection.clear();
    }

    public LocalDateTime getCreationTime(StudyGroup studyGroup) {
        return creationTime;
    }

    public void saveCollection(LinkedList<StudyGroup> studyGroups) {
        fileManager.writeToFile(studyGroups);
    }

    public LinkedList<StudyGroup> loadCollection() {
        studyGroupsCollection = fileManager.readFile();
        this.creationTime = LocalDateTime.now();
        return studyGroupsCollection;
    }

    public void remove(StudyGroup studyGroup) {
        studyGroupsCollection.remove(studyGroup);
    }


    public StudyGroup getFirst() {
        if (studyGroupsCollection.isEmpty()) return null;
        return studyGroupsCollection.getFirst();
    }

    public StudyGroup getLast() {
        if (studyGroupsCollection.isEmpty()) return null;
        return studyGroupsCollection.getLast();
    }

    public StudyGroup getById(Integer id) {
        if (studyGroupsCollection.isEmpty()) return null;
        for (StudyGroup studyGroup : studyGroupsCollection) {
            if (studyGroup.getId().equals(id)) return studyGroup;
        }
        return null;
    }

    public Integer generateId() {
        if (studyGroupsCollection.isEmpty()) return 1;
        return studyGroupsCollection.getLast().getId() + 1;
    }

    public void removeById(Integer id) throws CollectionIsEmptyException {
        if (studyGroupsCollection.isEmpty()) throw new CollectionIsEmptyException();
        for (StudyGroup studyGroup : studyGroupsCollection) { //potentially replace with intellij context
            if (studyGroup.getId().equals(id)) {
                studyGroupsCollection.remove(studyGroup);
            }
        }
    }

//    public StudyGroup getByStudentsCount(StudyGroup studyGr) throws CollectionIsEmptyException {
//        if (studyGroups.isEmpty()) throw new CollectionIsEmptyException();
//        for (StudyGroup studyGroup : studyGroups) {
//            if (studyGroup.getStudentsCount() == studyGr.getStudentsCount()) return studyGroup;
//        }
//        return null;
//    }

    public void removeByStudentsCount(int studyCount) throws CollectionIsEmptyException {
//        try {
            if (studyGroupsCollection.isEmpty()) throw new CollectionIsEmptyException();
            for (StudyGroup studyGroup : studyGroupsCollection) { //potentially replace with a context suggestion
                if (studyGroup.getStudentsCount() == studyCount) {
                    studyGroupsCollection.remove(studyGroup);
                }
            }
//        } catch (CollectionIsEmptyException e) {
//            ConsoleManager.printerror("No group with this many students found");
//        }

    }


    public LinkedList<StudyGroup> greaterThanByFormOfEducation(FormOfEducation formOfEducation) throws CollectionIsEmptyException {
//        try {
            if (studyGroupsCollection.isEmpty()) throw new CollectionIsEmptyException();
            for (StudyGroup studyGroup : studyGroupsCollection) {
                if (studyGroup.getFormOfEducation().compareTo(formOfEducation) > 0) {
                    LinkedList<StudyGroup> linkedList = new LinkedList<>();
                    linkedList.add(studyGroup);
                    return linkedList;
                }
            }
//        } catch (CollectionIsEmptyException e) {
//            ConsoleManager.printerror("Collection is empty. There is nothing to compare");
//        }
        return null;
    }

    class SortDecendBySemester implements Comparator<StudyGroup> {
        public int compare(StudyGroup sG1, StudyGroup sG2) {
            if (sG1.getSemester() == sG2.getSemester()) {
                return 0;
            } else if (sG1.getSemester().compareTo(sG2.getSemester()) < 0) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public String decendBySemester(LinkedList<StudyGroup> studyGroups) {
        studyGroups.sort(new SortDecendBySemester());
        return studyGroups.toString();
    }

    public String toString() {
        if (studyGroupsCollection.isEmpty()) {
            return "This collection is empty (｡•́︿•̀｡)";
        }
        StringBuilder info = new StringBuilder();
        for (StudyGroup studyGroup : studyGroupsCollection) {
            info.append(studyGroup).append("\n");
        }
        return info.toString();
    }
}
