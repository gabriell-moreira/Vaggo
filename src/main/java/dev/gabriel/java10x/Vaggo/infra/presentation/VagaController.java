package dev.gabriel.java10x.Vaggo.infra.presentation;

import dev.gabriel.java10x.Vaggo.core.entities.Vaga;
import dev.gabriel.java10x.Vaggo.core.usecases.BuscarVagaCase;
import dev.gabriel.java10x.Vaggo.core.usecases.CriarVagaCase;
import dev.gabriel.java10x.Vaggo.infra.dtos.VagaDTO;
import dev.gabriel.java10x.Vaggo.infra.mapper.VagaDTOMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/vagas/")
@RestController
@RequiredArgsConstructor
public class VagaController {

    private final CriarVagaCase criarVagaCase;
    private final BuscarVagaCase buscarVagaCase;
    private final VagaDTOMapper vagaDTOMapper;

    @PostMapping("criar-vaga")
    public ResponseEntity<VagaDTO> criarVaga(@RequestBody VagaDTO vagaDTO) {

        Vaga vaga = criarVagaCase.execute(vagaDTOMapper.toDomain(vagaDTO));
        VagaDTO respostaDTO = vagaDTOMapper.toDTO(vaga);

        return ResponseEntity.status(HttpStatus.CREATED).body(respostaDTO);
    }

    @GetMapping("listar-vagas")
    public ResponseEntity<VagaDTO> listarVagas() {
        Vaga vaga = buscarVagaCase.execute();

        if (vaga == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        VagaDTO respostaDTO = vagaDTOMapper.toDTO(vaga);
        return ResponseEntity.status(HttpStatus.OK).body(respostaDTO);
    }

}
