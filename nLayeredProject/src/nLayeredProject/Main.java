package nLayeredProject;


import nLayeredProject.business.CategoryManager;
import nLayeredProject.business.CourseManager;
import nLayeredProject.business.EducatorManager;
import nLayeredProject.core.DatabaseLogger;
import nLayeredProject.core.FileLogger;
import nLayeredProject.core.ILogger;
import nLayeredProject.core.MailLogger;
import nLayeredProject.dataAccess.HybernateCourse;
import nLayeredProject.dataAccess.JDBCCategory;
import nLayeredProject.dataAccess.JDBCEducator;
import nLayeredProject.entities.Category;
import nLayeredProject.entities.Course;
import nLayeredProject.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {
		ILogger[] logger = {new MailLogger(), new DatabaseLogger(), new FileLogger()};
		
		System.out.println("...");
		
		Category category1 = new Category("Game");
		CategoryManager categoryManager = new CategoryManager(new JDBCCategory(), logger);
		categoryManager.validName(category1);
		
		System.out.println("...");
		
		Course course1 = new Course("Python", "Engin Demiroğ", "12 weeks", 0);
		CourseManager courseManager = new CourseManager(new HybernateCourse(), logger);
		courseManager.validName(course1);
		
		System.out.println("...");
		
		Educator educator1 = new Educator(3, "Elif", "Kurt");
		EducatorManager educatorManager = new EducatorManager(new JDBCEducator(), logger);
		educatorManager.add(educator1);
	}

}
