package nLayeredProject.business;

import nLayeredProject.core.ILogger;
import nLayeredProject.dataAccess.IEducatorDao;
import nLayeredProject.entities.Educator;

public class EducatorManager {
	private IEducatorDao educatorDao;
	private ILogger[] loggers;
	
	
	public EducatorManager(IEducatorDao educatorDao, ILogger[] loggers) {
		this.educatorDao = educatorDao;
		this.loggers = loggers;
	}


	public void add(Educator educator) throws Exception{
		Educator[] educators = {new Educator(1, "Engin", "Demiroğ"), new Educator(2, "Ceren", "Yılmaz")};
		
		for(Educator instructor : educators) {
			if(instructor.getId() == educator.getId()) {
				throw new Exception("This id has already been taken");
			}
		}
		educatorDao.add(educator);
		for(ILogger logger : loggers) {
			logger.add(educator.getEducatorFirstName());
		}
 	}
	
}
