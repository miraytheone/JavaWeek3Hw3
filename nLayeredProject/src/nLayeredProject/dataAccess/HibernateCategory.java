package nLayeredProject.dataAccess;

import nLayeredProject.entities.Category;

public class HibernateCategory implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hybernate ile kategori eklendi.");
	}

	@Override
	public void delete(Category category) {
		System.out.println("Hybernate ile kategori silindi.");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Hybernate ile kategori güncellendi.");
		
	}

}
