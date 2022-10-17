package nLayeredProject.dataAccess;

import nLayeredProject.entities.Educator;

public interface IEducatorDao {
	void add(Educator educator);
	void delete(Educator educator);
	void update(Educator educator);
}
