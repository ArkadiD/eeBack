package de.arcadius.firstApp.repository;

import de.arcadius.firstApp.model.Book;
import de.arcadius.firstApp.model.Language;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class BookRepositoryTest {

    @Inject
    private BookRepository repository;


    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Book.class)
                .addClass(BookRepository.class)
                .addClass(Language.class)
                .addClass(BookRepository.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "bean.xml")
                .addAsManifestResource("META-INF/test-persistence.xml", "persistence.xml");


    }

    @Test
    public void create() throws Exception {
        repository.countAll();
        assertEquals(Long.valueOf(0), repository.countAll());
        assertEquals(0, repository.findAll().size());
    }
}
