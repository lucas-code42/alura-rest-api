package med.voll.api.models;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ModelEndereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String numero;
    private String complemento;
}
