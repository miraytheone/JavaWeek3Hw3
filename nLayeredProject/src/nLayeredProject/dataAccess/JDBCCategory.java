package nLayeredProject.dataAccess;

import nLayeredProject.entities.Category;

public class JDBCCategory implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile kategori eklendi.");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("JDBC ile kategori silindi.");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("JDBC ile kategori güncellendi.");
		
	}

}
