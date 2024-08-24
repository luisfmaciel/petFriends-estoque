package br.edu.infnet.petfriendsestoque.domain;

import br.edu.infnet.petfriendsestoque.infra.ProdutoAdicionadoAoEstoqueEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estoque {

    private Long id;
    private List<Produto> produtos;
    private Loja loja;
    private String localizacao;
    private int capacidadeTotal;
    private ApplicationEventPublisher eventPublisher;

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
        ProdutoAdicionadoAoEstoqueEvent event = new ProdutoAdicionadoAoEstoqueEvent(produto, this.id);
        eventPublisher.publishEvent(event);
    }

    public void removerProduto(Produto produto) {
        this.produtos.remove(produto);
    }
}