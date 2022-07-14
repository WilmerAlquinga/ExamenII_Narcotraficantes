package ec.edu.espe.arquitectura.listaobservados.narcotraficantes.apiclient;

import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NarcotraficanteService {

  private static final String BASE_URL = "http://localhost:8080/narcotraficantes";

  private final RestTemplate restTemplate;

  public NarcotraficanteService() {
    this.restTemplate = new RestTemplate(getClientHttpRequestFactory());
  }

  private ClientHttpRequestFactory getClientHttpRequestFactory() {
    HttpComponentsClientHttpRequestFactory clientHttpRequestFactory =
        new HttpComponentsClientHttpRequestFactory();
    int connectTimeout = 5000;
    int readTimeout = 5000;
    clientHttpRequestFactory.setConnectTimeout(connectTimeout);
    clientHttpRequestFactory.setReadTimeout(readTimeout);
    return clientHttpRequestFactory;
  }
}
