package med.voll.api.models;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ModelMedico {
    private String nome;
    private String email;
    private String especialidade;
    private ModelEndereco endereco;
}
