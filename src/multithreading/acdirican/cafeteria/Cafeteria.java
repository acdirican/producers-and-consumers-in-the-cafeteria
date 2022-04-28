package multithreading.acdirican.cafeteria;

import java.util.ArrayList;
import java.util.List;

import multithreading.acdirican.cafeteria.entities.Cooker;
import multithreading.acdirican.cafeteria.entities.Kebap;
import multithreading.acdirican.cafeteria.entities.Rice;
import multithreading.acdirican.cafeteria.entities.Soup;
import multithreading.acdirican.cafeteria.entities.Student;
import multithreading.acdirican.cafeteria.entities.Table;
/**
 * The manager class for the project creating and starting Cookers and Students.
 * 
 * @author Ahmet Cengizhan Dirican
 *
 */
public class Cafeteria {
	
	private final List<Cooker> cookers;
	private final List<Student> students;
	private final Table table;
	
	public Cafeteria() {
		this.table = new Table(10);
		this.cookers =  createCookers(table);
		this.students = createStudents(table);
	}
	
	public void init() {
        cookers.forEach(Cooker::start);  
        students.forEach(Student::start);
    }
	
	private static List<Student> createStudents(Table table) {
		List<String> names = List.of("Marry","Cengiz","Ahmet","Can","Alice","Sude","Jack","Thor","Lukas");
        List<Student> students = new ArrayList<>();
        for(String sname : names) {
            students.add(new Student(table, sname));
        }
        return students;
	}
	
	private static List<Cooker> createCookers(Table table) {
		Cooker george = new Cooker(table, new Kebap(), "Hulk");
		Cooker rose = new Cooker(table, new Soup(), "Rose");
		Cooker can = new Cooker(table, new Rice(), "Can");

		List<Cooker> cookers = new ArrayList<>();

		cookers.add(rose);
		cookers.add(george);
		cookers.add(can);

		return cookers;
	}
	
	public List<Cooker> getCookers() {
		return cookers;
	}
	public List<Student> getStudents() {
		return students;
	}
	public Table getTable() {
		return table;
	}
}
