package Pilgriman.tutorial.rest.api.repository;

import Pilgriman.tutorial.rest.api.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {

}
