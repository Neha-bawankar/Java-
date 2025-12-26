import java.util.Comparator;

public class PriorityQueue {
    public static void main(String[] args) {
        
    }


        private static  class Student{
             private String name;
             private final char grade;

            public Student(String name, char grade) {
                this.name = name;
                this.grade = grade;
            }

            public String getName() {
                return name;
            }

            public char getGrade() {
                return grade;
            }
        }

}
