package nLayeredProject.dataAccess;

import nLayeredProject.entities.Course;

public class JDBCCourse implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile kurs eklendi.");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("JDBC ile kurs silindi.");
		
	}

	@Override
	public void update(Course course) {
		System.out.println("JDBC ile kurs güncellendi.");
		
	}

}
