package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.business.requests.language.CreateLanguageRequest;
import kodlama.io.devs.business.requests.language.DeleteLanguageRequest;
import kodlama.io.devs.business.requests.language.UpdateLanguageRequest;
import kodlama.io.devs.business.responses.language.GetAllLanguageResponse;

public interface ProgrammingLanguageService {
	List<GetAllLanguageResponse> getAll();
	void add(CreateLanguageRequest language) throws Exception;
	void update(UpdateLanguageRequest language) throws Exception;
	void delete(DeleteLanguageRequest language);
	GetAllLanguageResponse getByid(int id);
}
