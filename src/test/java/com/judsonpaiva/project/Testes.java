package com.judsonpaiva.project;

import com.judson.project_associacao.model.Local;
import com.judson.project_associacao.model.Palestra;
import com.judson.project_associacao.model.Palestrante;
import org.junit.Test;

import java.util.Arrays;

public class Testes extends EntityManagerTest{

    @Test
    public void testar(){

        Local local = entityManager.find(Local.class, 1L);
        Palestrante palestrante = new Palestrante("Anderson Paiva","Engenheiro Geógrafo");
        Palestra palestra = new Palestra("Definição do Amor", null, 4);

        palestra.setPalestrante(Arrays.asList(palestrante));
        palestra.setLocal(local);

        entityManager.getTransaction().begin();
        entityManager.persist(palestrante);
        entityManager.persist(palestra);
        entityManager.getTransaction().commit();
    }
}
