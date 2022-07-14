package ec.edu.espe.arquitectura.listaobservados.narcotraficantes.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "narcotraficantes")
@TypeAlias("narcotraficantes")
public class Narcotraficante {

    @Id
    private String id;

    @Indexed(name = "idx_narcotraficante_nombrecompleto", unique = true)
    private String nombreCompleto;

    private String sancionado;
}
