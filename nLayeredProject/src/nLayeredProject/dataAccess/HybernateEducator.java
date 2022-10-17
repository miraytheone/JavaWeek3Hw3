package nLayeredProject.dataAccess;

import nLayeredProject.entities.Educator;

public class HybernateEducator implements IEducatorDao{

	@Override
	public void add(Educator educator) {
		System.out.println("Hybernate ile eğitimci eklendi.");
	}

	@Override
	public void delete(Educator educator) {
		System.out.println("Hybernate ile eğitimci silindi.");
		
	}

	@Override
	public void update(Educator educator) {
		System.out.println("Hybernate ile eğitimci güncellendi.");
		
	}

}
