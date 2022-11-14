package kodlama.io.devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.TechnologyService;
import kodlama.io.devs.business.requests.technology.CreateTechnologyRequest;
import kodlama.io.devs.business.requests.technology.DeleteTechnologyRequest;
import kodlama.io.devs.business.requests.technology.UpdateTechnologyRequest;
import kodlama.io.devs.business.responses.technology.GetAllTechnologyResponse;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.devs.entities.ProgrammingLanguage;
import kodlama.io.devs.entities.Technology;

@Service
public class TechnologyManager implements TechnologyService{

	private TechnologyRepository technologyRepository;
	private ProgrammingLanguageRepository languageRepository;
	
	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository,
			ProgrammingLanguageRepository languageRepository) {
		this.technologyRepository = technologyRepository;
		this.languageRepository = languageRepository;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) {
		Technology technology = new Technology();
		technology.setName(createTechnologyRequest.getName());
		int languageId = createTechnologyRequest.getLanguageId();
		@SuppressWarnings("deprecation")
		ProgrammingLanguage language = languageRepository.getById(languageId);
		technology.setLanguage(language);
		technologyRepository.save(technology);
	}

	@Override
	public void update(UpdateTechnologyRequest updateTechnologyRequest) {
		Technology technology = technologyRepository.findById(updateTechnologyRequest.getId()).get();
		ProgrammingLanguage language = languageRepository.findById(updateTechnologyRequest.getLanguageId()).get();
		technology.setLanguage(language);
		technology.setName(updateTechnologyRequest.getName());
		technologyRepository.save(technology);
	}

	@Override
	public List<GetAllTechnologyResponse> getAll() {
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologyResponse> responses = new ArrayList<>();
		for(Technology technology : technologies) {
			GetAllTechnologyResponse responseItem = new GetAllTechnologyResponse();
			responseItem.setId(technology.getId());
			responseItem.setLanguageId(technology.getLanguage().getId());
			responseItem.setName(technology.getName());
			responses.add(responseItem);
		}
		return responses;
	}

	@Override
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
		Technology technology = technologyRepository.findById(deleteTechnologyRequest.getId()).get();
		technologyRepository.delete(technology);
	}
	
}
