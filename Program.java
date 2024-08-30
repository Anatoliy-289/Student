// Создать класс Студент
// Создать класс УчебнаяГруппа
// Создать класс УчебнаяГруппаИтератор, заставив его реализовать
// интерфейс Iterator
// Реализовать его контакты (включая удаление)

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        StudentGroup studentGroup = new StudentGroup();

        Student van = new Student("Van", 4);
        Student igorechik = new Student("Igorechik", 1);
        Student alex = new Student("Alex", 2);
        Student alexey = new Student("Alexey", 3);

        studentGroup.addStudent(van);
        studentGroup.addStudent(igorechik);
        studentGroup.addStudent(alex);
        studentGroup.addStudent(alexey);

        //System.out.println("студенты: " + studentGroup.students);

        //Iterator<Student> iterator = new StudentGroupIterator(studentGroup);

        //while (iterator.hasNext()) {
            //System.out.println(iterator.next());
        //}

        for(Student student:studentGroup) {
            System.out.println(student);
        }

        ArrayList<Student> arrayList = new ArrayList<>(List.of(van, igorechik, alex, alexey));

        System.out.println(arrayList);

        //public int compare(Student o1, Student o2) {
            //return o1.id - o2.id;
            //}

        //Collections.sort(arrayList, new StudentComparator()); // сортировка, второй аргумент обратная сортировка
        Collections.sort(arrayList, (s1, s2) -> s1.id - s2.id); // лямбда-выражение, сортировка, второй аргумент обратная сортировка
        System.out.println(arrayList);



        //StudyGroup
        StudyGroup studytGroup = new StudyGroup();

        StudyGroup mathematicians = new StudyGroup("Mathematicians", 4);
        StudyGroup physics = new StudyGroup("Physics", 3);
        StudyGroup chemists = new StudyGroup("Chemists", 2);
        StudyGroup programmers = new StudyGroup("Programmers", 1);
        StudyGroup economists = new StudyGroup("Economists", 5);



        //studentStream. Добавление групп в поток

        StudentStream studentStream = new StudentStream();

   
        studentStream.addGroup(mathematicians);
        studentStream.addGroup(mathematicians);
        studentStream.addGroup(mathematicians);
        studentStream.addGroup(mathematicians);

        studentStream.addGroup(physics);
        studentStream.addGroup(physics);
        studentStream.addGroup(physics);

        studentStream.addGroup(chemists);
        studentStream.addGroup(chemists);

        studentStream.addGroup(programmers);

        studentStream.addGroup(economists);
        studentStream.addGroup(economists);
        studentStream.addGroup(economists);
        studentStream.addGroup(economists);
        studentStream.addGroup(economists);

        
        for(StudentGroup studentgroup: studentStream) {
            System.out.println(studentGroup);
        }


        ArrayList<Student> arrayList_1 = new ArrayList<>(List.of(mathematicians, physics, chemists, programmers, economists));

        System.out.println(arrayList);

        Collections.sort(arrayList_1, (s1, s2) -> s1.id - s2.id);
        System.out.println(arrayList_1);

    }
        
}