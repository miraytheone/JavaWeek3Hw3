package nLayeredProject.business;

import nLayeredProject.core.ILogger;
import nLayeredProject.dataAccess.ICourseDao;
import nLayeredProject.entities.Course;

public class CourseManager {
	private ICourseDao courseDao;
	private ILogger[] loggers;
	
	public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void validName(Course course) throws Exception{
		Course[] courses = {new Course("Java", "Engin Demiroğ", "12 weeks", 0), new Course("C#", "Engin Demiroğ", "15 weeks", 0),
				new Course("React", "Engin Demiroğ", "10 weeks", 0)};
		
		for(Course kurs : courses) {
			if(kurs.getCourseName() == course.getCourseName()) {
				throw new Exception("This course has already been added.");
			}
			
			else if(course.getCoursePrice() < 0) {
				throw new Exception("Course price cannot be less than zero.");
			}
		}
		courseDao.add(course);
		for(ILogger logger: loggers) {
			logger.add(course.getCourseName());
		}
	}

}
