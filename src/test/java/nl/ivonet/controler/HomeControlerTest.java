package nl.ivonet.controler;

import nl.ivonet.model.Hello;
import org.junit.Before;
import org.junit.Test;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.lang.reflect.Method;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;

public class HomeControlerTest {

    private HomeControler controler;

    @Before
    public void setUp() throws Exception {
        this.controler = new HomeControler();

    }

    @Test
    public void testGet() throws Exception {
        final Hello result = this.controler.get();
        assertNotNull(result);
        assertThat("the result message is world", result.getMessage(), is("world"));
    }

    @Test
    public void testGetMethodAnnotations() throws Exception {
        final Method method = this.controler.getClass()
                                            .getMethod("get");
        assertThat("The method has the GET annotation", method.isAnnotationPresent(GET.class));
        assertThat("The method produces JSon", method.isAnnotationPresent(Produces.class));

        final Produces produces = method.getDeclaredAnnotation(Produces.class);
        assertThat("The produced mediatype is application/json", produces.value()[0], is(MediaType.APPLICATION_JSON));
    }

    @Test
    public void testPathAnnotation() throws Exception {
        assertNotNull(this.controler.getClass()
                                    .getAnnotations());
        assertThat("The controller has the annotation Path", this.controler.getClass()
                                                                           .isAnnotationPresent(Path.class));

        final Path path = this.controler.getClass()
                                        .getAnnotation(Path.class);
        assertThat("The path is /home", path.value(), is("/home"));
    }

    @Test
    public void testScope() throws Exception {
        assertNotNull(this.controler.getClass()
                                    .getAnnotations());
        assertThat("The controller has the annotation RequestScoped", this.controler.getClass()
                                                                                    .isAnnotationPresent(
                                                                                            RequestScoped.class));
    }
}