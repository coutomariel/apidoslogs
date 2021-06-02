package br.com.coutomairel.apidoslogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ApidoslogsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApidoslogsApplication.class, args);

	}
	
	@RestController
	@RequestMapping("/home")
	public class Initial {

		private final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(Initial.class);

		@GetMapping
		public String hello() {
			logger.info("Log de informação");
			logger.warn("Log de aviso, algo está errado ou faltando! cuidado!");
			logger.error("Log de erro, algo de errado aconteceu!");
			logger.debug("Log de depuração, contém informações mais refinadas, que são mais úteis para depurar um app");
			logger.trace("Log de rastreabilidade, contém informações mais refinadas do que o DEBUG");

			// exibindo variáveis no log
			logger.info("Proposta documento={} salário={} criada com sucesso!", "9915183128", 7999.00);
			return "Olá mundo!";
		}

	}


}
