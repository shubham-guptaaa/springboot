import java.util.*;
class lambdaExp{
    public static void main(String[] args){
        List<Student> sList = new ArrayList<>();
        sList.add(new Student("Shubham", 110, 120));
        sList.add(new Student("Aadya", 120, 140));
        sList.add(new Student("Ansh", 130, 160));

        // Collections.sort(sList, new SortByName());
        // Collections.sort(sList, new SortByRollNo());
        // Collections.sort(sList, new SortByMarks());

        //1. Anonymous Class (Current Way)
        // Collections.sort(sList, new Comparator<Student>() {
        //     @Override
        //     public int compare(Student s1, Student s2){
        //         return s1.name.compareTo(s2.name);
        //     }
        // });

        //2. Lambda Exp
        Collections.sort(sList, (s1,s2) -> s1.name.compareTo(s2.name));
        


        for(Student s: sList){
            System.out.println(s.name+" "+s.rollNo+" "+s.marks);
        }
    }
}

// custom class for sorting

// class SortByName implements Comparator<Student>{
//     @Override
//     public int compare(Student s1, Student s2){
//         return s1.name.compareTo(s2.name);
//     }
// }
// class SortByRollNo implements Comparator<Student>{
//     @Override
//     public int compare(Student s1, Student s2){
//         return s1.rollNo-s2.rollNo;
//     }
// }
// class SortByMarks implements Comparator<Student>{
//     @Override
//     public int compare(Student s1, Student s2){
//         return s1.marks-s2.marks;
//     }
// }


class Student{
    String name;
    int rollNo;
    int marks;
    Student(String name, int rollNo, int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}