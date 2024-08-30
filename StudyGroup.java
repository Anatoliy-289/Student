public class StudyGroup implements Comparable<StudyGroup> {
 
    public String name;
    public int quantity; //количество тех или иных групп в потоке

    public StudyGroup(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(StudyGroup o) {
        return this.quantity.(StudyGroup) - o.quantity.(StudyGroup);
    }

}