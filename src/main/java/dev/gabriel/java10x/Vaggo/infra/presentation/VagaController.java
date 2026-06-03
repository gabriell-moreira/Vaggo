package dev.gabriel.java10x.Vaggo.infra.presentation;


import dev.gabriel.java10x.Vaggo.infra.dtos.VagaDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/vagas/")
@RestController
public class VagaController {

    @PostMapping("/criar")
    public String criarVaga(@RequestBody VagaDTO vaga){
        return "Criando Vagas";
    }
}
