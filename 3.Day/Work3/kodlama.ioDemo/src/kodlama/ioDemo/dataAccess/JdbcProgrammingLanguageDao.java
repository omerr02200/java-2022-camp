package kodlama.ioDemo.dataAccess;

import kodlama.ioDemo.entities.ProgrammingLanguage;

public class JdbcProgrammingLanguageDao implements ProgrammingLanguageDao{

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		System.out.println("Jdbc ile programlama dili eklendi : " + programmingLanguage.getName());
	}

}
