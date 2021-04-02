package managers;

import collectionInfo.FormOfEducation;
import collectionInfo.Semester;
import collectionInfo.StudyGroup;
import exceptions.CollectionIsEmptyException;
import exceptions.NoElementWithSuchId;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.*;

public class CollectionManager {
    private LinkedList<StudyGroup> studyGroupsCollection = new LinkedList<>();
    private LocalDateTime creationTime;
    private FileManager fileManager;

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

    public void loadCollection() {

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
            if (studyGroup.getId() == id) return studyGroup;
        }
        return null;
    }

//    public void updateById(Integer id) throws NoElementWithSuchId {
//        for (StudyGroup studyGroup : studyGroupsCollection) {
//            if (studyGroup.getId() == id) {  }
//        }
//    }

    public void removeById(Integer id) throws CollectionIsEmptyException {
        if (studyGroupsCollection.isEmpty()) throw new CollectionIsEmptyException();
        for (StudyGroup studyGroup : studyGroupsCollection) {
            if (studyGroup.getId() == id) { studyGroupsCollection.remove(studyGroup); }
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
        if (studyGroupsCollection.isEmpty()) throw new CollectionIsEmptyException();
        for (StudyGroup studyGroup : studyGroupsCollection) {
            if (studyGroup.getStudentsCount() == studyCount) { studyGroupsCollection.remove(studyGroup); }
        }
    }

    public StudyGroup greaterThanByFormOfEducation(FormOfEducation formOfEducation) throws CollectionIsEmptyException {
        if (studyGroupsCollection.isEmpty()) throw new CollectionIsEmptyException();
        for (StudyGroup studyGroup : studyGroupsCollection) {
            if (studyGroup.getFormOfEducation().compareTo(formOfEducation) > 0) return studyGroup;
        }
        return null;
    }

    public class SortBySemester implements Comparator<StudyGroup> {
        public int compare(StudyGroup a, StudyGroup b) {
            if (a.getSemester().compareTo(b.getSemester()) > 0) return 1; //a<b
            else if (a.getSemester().compareTo(b.getSemester()) == 0 ) return 0;
            else return -1;
        }
    }

    public String decendBySemester(LinkedList<StudyGroup> studyGroups) {
        Collections.sort(studyGroups, new SortBySemester());
        return studyGroups.toString();
    }

    public String toString() {
        if (studyGroupsCollection.isEmpty()) { return "This collection is empty (｡•́︿•̀｡)"; }
        String info = "";
        for (StudyGroup studyGroup : studyGroupsCollection) {
            info = info + studyGroup + "\n";
        }
        return info;
    }
}
