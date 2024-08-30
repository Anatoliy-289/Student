import java.util.Iterator;

public class StudentStreamIterator implements Iterator<StudyGroup> {

    private StudentStream studentStream = new StudentStream();
    private int index = 0;

    private StudyGroup[] getStudyGroups() {
        String[] groupNames = studentStream.groups.toString().split(" ");
        StudyGroup[] groups = new StudyGroup[groupNames.length];
        
        int count = 0;
        for(String name: groupNames) {
            groups[count] = new StudyGroup(group);
            count++;
        }
        return groupNames;
    }

    
    @Override
    public boolean hasNext() {
        return index < getStudyGroups().length;
    }
    

    @Override
    public StudyGroup next() {
        StudyGroup[] groups = getStudyGroups();
        return groups[index++];
    }
    
}
