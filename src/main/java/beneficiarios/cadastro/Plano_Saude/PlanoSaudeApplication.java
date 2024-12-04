package beneficiarios.cadastro.Plano_Saude;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "beneficiarios.cadastro.Plano_Saude")
public class PlanoSaudeApplication {

	@GetMapping
	public String getHometeste(){
		return "Plano saude - API Home ";
	}
	public static void main(String[] args) {
		SpringApplication.run(PlanoSaudeApplication.class, args);
	}

}
