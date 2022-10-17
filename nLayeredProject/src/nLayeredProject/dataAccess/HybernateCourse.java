package nLayeredProject.dataAccess;

import nLayeredProject.entities.Course;

public class HybernateCourse implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hybernate ile kurs eklendi.");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Hybernate ile kurs silindi.");
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Hybernate ile kurs güncellendi.");
		
	}

}
