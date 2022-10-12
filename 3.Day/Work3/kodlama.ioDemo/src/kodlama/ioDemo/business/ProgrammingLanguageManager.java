package kodlama.ioDemo.business;

import java.util.ArrayList;
import java.util.List;

import kodlama.ioDemo.core.logging.Logger;
import kodlama.ioDemo.dataAccess.ProgrammingLanguageDao;
import kodlama.ioDemo.entities.ProgrammingLanguage;

public class ProgrammingLanguageManager {

	ProgrammingLanguageDao programmingLanguageDao;
	Logger[] loggers;

	List<ProgrammingLanguage> programmingLanguages = new ArrayList<>();

	public ProgrammingLanguageManager(ProgrammingLanguageDao programmingLanguageDao, Logger[] loggers) {
		this.programmingLanguageDao = programmingLanguageDao;
		this.loggers = loggers;
	}

	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		if (programmingLanguage.getPrice() < 0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
		}
		boolean result = nameExist(programmingLanguage.getName());
		if (!result) {
			throw new Exception("Aynı isimde kurs zaten var.");

		} else
			programmingLanguageDao.add(programmingLanguage);
		
		for(Logger logger : loggers) {
			logger.log(programmingLanguage.getName());
		}
	}

	public boolean nameExist(String name) {
		for (ProgrammingLanguage language : programmingLanguages) {
			if (language.getName().equals(name)) {
				return false;
			}
		}
		return true;
	}
}
