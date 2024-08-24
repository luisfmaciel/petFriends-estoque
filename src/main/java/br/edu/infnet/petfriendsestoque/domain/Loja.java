package br.edu.infnet.petfriendsestoque.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Loja {
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private List<Estoque> estoques;
    private String horarioFuncionamento;

}