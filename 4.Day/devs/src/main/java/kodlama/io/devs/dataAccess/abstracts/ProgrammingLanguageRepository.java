package kodlama.io.devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.devs.entities.ProgrammingLanguage;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer>{
	/*List<ProgrammingLanguage> getAll();
	void add(ProgrammingLanguage language) throws Exception;
	void update(ProgrammingLanguage language);
	void delete(ProgrammingLanguage language);
	ProgrammingLanguage getByid(int id);*/
}