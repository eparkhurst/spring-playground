package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by elijahparkhurst on 2/19/17.
 */

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserTest {

    @Autowired
    MockMvc mvc;

    @Test
    public void testUserPostEndPoint() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.post("/users");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("you posted something"));
    }

    @Test
    public void testUserDeleteEndPoint() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.delete("/users");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("you deleted something"));
    }
}
