package nLayeredProject.business;

import nLayeredProject.core.ILogger;
import nLayeredProject.dataAccess.ICategoryDao;
import nLayeredProject.entities.Category;

public class CategoryManager {
	private ICategoryDao categoryDao;
	private ILogger[] loggers;
	
	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void validName(Category category) throws Exception{
		Category[] categories = {new Category("Web Programming"), new Category("Artificial Intelligence"), new Category("Cyber Security") };
		for( Category kategori : categories) {
				if(kategori.getCategoryName() == category.getCategoryName()) {
					throw new Exception("This category cannot be added.");
				}
		}
		categoryDao.add(category);
		for(ILogger logger : loggers){
			logger.add(category.getCategoryName());
		}
	}
	
}
