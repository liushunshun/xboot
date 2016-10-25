import com.xy.Application;
import com.xy.controller.HomeController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * demo http://www.iteye.com/topic/1144374
 *
 * Created by Alex on 2016/10/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class MyTest extends MockMvcResultMatchers {

    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new HomeController()).build();
    }

    @Test
    public void testHomeController() throws Exception{
        RequestBuilder request = null;

        request = MockMvcRequestBuilders.get("/");

        mvc.perform(request).andExpect(status().isOk()).andExpect(content().string("hello world"));
    }
}
