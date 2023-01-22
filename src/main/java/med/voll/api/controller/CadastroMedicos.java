package med.voll.api.controller;

import org.springframework.web.bind.annotation.*;
import med.voll.api.models.ModelMedico;

@RestController
@RequestMapping("/medicos")
public class CadastroMedicos {

    @PostMapping
    public String medicos(@RequestBody ModelMedico payload) {
        System.out.println(payload.getNome());
        System.out.println(payload.getEmail());
        System.out.println(payload.getEspecialidade());
        System.out.println(payload.getEndereco().getLogradouro());
        System.out.println(payload.getEndereco().getBairro());
        System.out.println(payload.getEndereco().getCep());
        System.out.println(payload.getEndereco().getCidade());
        System.out.println(payload.getEndereco().getUf());
        System.out.println(payload.getEndereco().getNumero());
        System.out.println(payload.getEndereco().getComplemento());
        return "medicos";
    }

}
