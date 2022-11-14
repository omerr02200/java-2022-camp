package kodlama.io.devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.devs.entities.Technology;

public interface TechnologyRepository extends JpaRepository<Technology, Integer>{

}