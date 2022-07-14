package ec.edu.espe.arquitectura.listaobservados.narcotraficantes.dao;

import ec.edu.espe.arquitectura.listaobservados.narcotraficantes.dto.Narcotraficante;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NarcotraficanteRepository extends MongoRepository<Narcotraficante, String> {
}
