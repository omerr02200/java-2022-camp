package kodlama.ioDemo.dataAccess;

import kodlama.ioDemo.entities.ProgrammingLanguage;

public class HibernateProgrammingLanguageDao implements ProgrammingLanguageDao{

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		System.out.println("Hibernate ile programlama dili eklendi : " + programmingLanguage.getName());
	}

}
