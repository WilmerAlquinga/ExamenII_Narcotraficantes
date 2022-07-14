package ec.edu.espe.arquitectura.listaobservados.narcotraficantes.resource;

import ec.edu.espe.arquitectura.listaobservados.narcotraficantes.NarcotraficanteService;
import ec.edu.espe.arquitectura.listaobservados.narcotraficantes.dto.Narcotraficante;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/facturacion")
public class NarcotraficanteResource {

  private final NarcotraficanteService service;

  public NarcotraficanteResource(NarcotraficanteService service) {
    this.service = service;
  }

  @GetMapping
  public ResponseEntity<List<Narcotraficante>> obtainProductsForTransaction() {
    return ResponseEntity.ok(this.service.obtainAll());
  }
}
