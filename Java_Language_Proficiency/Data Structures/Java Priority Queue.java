import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;
/*
 * Create the Student and Priorities classes here.
 */
 class Student implements Comparable <Student>{
    private Integer id;
    private String name;
    private Double cgpa;

    public Student(Integer id, String name, Double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    public int compareTo(Student student) {

        int cgpaComparison = this.cgpa.compareTo(student.cgpa);

        if (!this.name.equals(student.name)) {
            return (cgpaComparison !=0 ? -cgpaComparison : this.name.compareTo (student.getName()));
        } else {
            return this.id.compareTo(student.id);
        }
    }

}

class Priorities {
    public List<Student> getStudents (List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<>();

        for (String element : events) {
            if (element.substring(0, 1).equals("E")) {
                String [] data = element.split(" ");
                Student newStudent = new Student(Integer.parseInt(data [3]),data[1],Double.parseDouble(data[2]));
                queue.add(newStudent);
            } else if (!queue.isEmpty()){
                queue.poll();
            }
        }

     List<Student> result = new ArrayList<>(queue);
        result.sort(Student::compareTo);
        return result;
    }
}


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}