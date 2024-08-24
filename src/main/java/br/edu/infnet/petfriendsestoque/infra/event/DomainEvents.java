package br.edu.infnet.petfriendsestoque.infra.event;

import java.time.Instant;

public interface  DomainEvents {
    Instant occurredOn();
}