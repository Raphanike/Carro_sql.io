
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Arrays;

public class TestePersistencia {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            entityManager.getTransaction().begin();


            Marca marca = new Marca();
            marca.setNome("Toyota");


            Acessorio arCondicionado = new Acessorio();
            arCondicionado.setNome("Ar Condicionado");

            Acessorio som = new Acessorio();
            som.setNome("Sistema de Som");


            entityManager.persist(arCondicionado);
            entityManager.persist(som);


            Carro carro = new Carro();
            carro.setModelo("Corolla");
            carro.setMarca(marca);
            carro.setAcessorios(Arrays.asList(arCondicionado, som));


            entityManager.persist(marca);
            entityManager.persist(carro);

            entityManager.getTransaction().commit();
            System.out.println("Dados salvos com sucesso!");
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
