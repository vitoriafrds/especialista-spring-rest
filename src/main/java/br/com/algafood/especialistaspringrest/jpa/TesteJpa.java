package br.com.algafood.especialistaspringrest.jpa;

import br.com.algafood.especialistaspringrest.EspecialistaSpringRestApplication;
import br.com.algafood.especialistaspringrest.domain.model.Cozinha;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class TesteJpa {
    public static void main(String[] args) {
        //inicializando uma aplicação spring (não web)
        ApplicationContext context = new SpringApplicationBuilder(EspecialistaSpringRestApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CadastroCozinha cadastro = context.getBean(CadastroCozinha.class);
        cadastro.adicionar(buildCozinha("Japonesa"));
        cadastro.adicionar(buildCozinha("Brasileira"));
        cadastro.adicionar(buildCozinha("Mexicana"));

        List<Cozinha> cozinhas = cadastro.listar();

        System.out.println("========== Cozinhas cadastradas ==========");
        cozinhas.forEach(c -> {

            System.out.println(c.getTipo());
        });
    }

    public static Cozinha buildCozinha(String tipo) {
        return new Cozinha(tipo);
    }
}
