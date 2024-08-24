package br.edu.infnet.petfriendsestoque.infra;

import br.edu.infnet.petfriendsestoque.domain.Produto;
import br.edu.infnet.petfriendsestoque.infra.event.DomainEvents;

import lombok.Data;

import java.time.Instant;

@Data
public class ProdutoAdicionadoAoEstoqueEvent implements DomainEvents {
    private final Produto produto;
    private final Long estoqueId;
    private final Instant occurredOn;

    public ProdutoAdicionadoAoEstoqueEvent(Produto produto, Long estoqueId) {
        this.produto = produto;
        this.estoqueId = estoqueId;
        this.occurredOn = Instant.now();
    }

    @Override
    public Instant occurredOn() {
        return occurredOn;
    }
}