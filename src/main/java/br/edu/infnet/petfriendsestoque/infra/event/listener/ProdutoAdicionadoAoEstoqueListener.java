package br.edu.infnet.petfriendsestoque.infra.event.listener;

import br.edu.infnet.petfriendsestoque.infra.ProdutoAdicionadoAoEstoqueEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ProdutoAdicionadoAoEstoqueListener {

    @EventListener
    public void onProdutoAdicionadoAoEstoque(ProdutoAdicionadoAoEstoqueEvent event) {
        System.out.println("Produto adicionado ao estoque: " + event.getProduto().getNome() +
                ", Estoque ID: " + event.getEstoqueId() +
                ", Data/Hora: " + event.occurredOn());
    }
}