package com.greenfox.examretake;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ExamretakeApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class ItemTest {
    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void greeterTest() throws Exception {
        String result = "{\n" +
                "    \"result\": \"ok\",\n" +
                "    \"clothes\": [\n" +
                "        {\n" +
                "            \"id\": 16,\n" +
                "            \"itemName\": \"Strecth Steamed Pencil Skirt\",\n" +
                "            \"manufacturer\": \"Calvin Klein\",\n" +
                "            \"category\": \"skirts\",\n" +
                "            \"size\": \"s\",\n" +
                "            \"unitPrice\": 39\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 18,\n" +
                "            \"itemName\": \"Strecth Steamed Pencil Skirt\",\n" +
                "            \"manufacturer\": \"Calvin Klein\",\n" +
                "            \"category\": \"skirts\",\n" +
                "            \"size\": \"m\",\n" +
                "            \"unitPrice\": 39\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        mockMvc.perform(get("/warehouse/query?price=50&type=lower"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.result", is(result)));
    }

}
