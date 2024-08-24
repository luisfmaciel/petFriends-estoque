package br.edu.infnet.petfriendsestoque;

import br.edu.infnet.petfriendsestoque.domain.Estoque;
import br.edu.infnet.petfriendsestoque.domain.Loja;
import br.edu.infnet.petfriendsestoque.domain.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;

import java.util.ArrayList;

@SpringBootApplication
public class PetFriendsEstoqueApplication implements CommandLineRunner {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public static void main(String[] args) {
        SpringApplication.run(PetFriendsEstoqueApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Produto produto = new Produto();
        produto.setNome("Ração Royal Canin Senior - 15kg");

        Loja loja = new Loja();
        loja.setNome("Pet Friends");
        loja.setEndereco("Av. Maracanã");
        loja.setEmail("maracana@petfriends.com");


        Estoque estoque = new Estoque();
        estoque.setId(1L);
        estoque.setLoja(loja);
        estoque.setProdutos(new ArrayList<>());
        estoque.setLocalizacao("Loja Central");
        estoque.setCapacidadeTotal(100);
        estoque.setEventPublisher(eventPublisher);

        estoque.adicionarProduto(produto);
    }
}
