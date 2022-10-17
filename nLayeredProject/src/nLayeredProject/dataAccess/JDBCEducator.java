package nLayeredProject.dataAccess;

import nLayeredProject.entities.Educator;

public class JDBCEducator implements IEducatorDao{

	@Override
	public void add(Educator educator) {
		System.out.println("JDBC ile eğitimci eklendi.");
		
	}

	@Override
	public void delete(Educator educator) {
		System.out.println("JDBC ile eğitimci silindi.");
		
	}

	@Override
	public void update(Educator educator) {
		System.out.println("JDBC ile eğitimci güncellendi.");
		
	}

}
