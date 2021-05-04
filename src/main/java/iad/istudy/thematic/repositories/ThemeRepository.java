package iad.istudy.thematic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import iad.istudy.thematic.entities.Theme;

@Repository
public interface ThemeRepository extends JpaRepository<Theme, Long>{

}