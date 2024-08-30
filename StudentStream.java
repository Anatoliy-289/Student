//1.Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
//2.Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
//3 Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class StudentStream implements Iterable<StudytGroup> {

    public StringBuilder groups = new StringBuilder();
    
    public void addGroup(StudyGroup group) {
        groups.append(group).append(" ");
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return new StudentStreamIterator(this);
    }

}
