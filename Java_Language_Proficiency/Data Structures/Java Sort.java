import java.util.*;

class Student implements Comparable <Student>{
	private Integer id;
	private String fname;
	private Double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
public int compareTo(Student student) {

        int cgpaComparison = this.cgpa.compareTo(student.cgpa);

        if (!this.fname.equals(student.fname)) {
            return (cgpaComparison !=0 ? -cgpaComparison : this.fname.compareTo (student.getFname()));
        } else {
            return this.id.compareTo(student.id);
        }
}

}



public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
            studentList.sort(Student::compareTo);
			
			testCases--;
		}
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



