package com.lwh.eurekaserver;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class EurekaServerApplicationTests {

    @Test
    void contextLoads() {

        List mock = mock(List.class);

        when(mock.get(0)).thenReturn("first");


    }

    @Autowired
    private WebApplicationContext webApplicationContext;

    public void MockMvc() throws Exception {

        MockMvc build = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        MockHttpServletRequestBuilder contentType = MockMvcRequestBuilders.get("/user/1")
                .contentType(MediaType.APPLICATION_JSON);
        ResultActions perform = build.perform(contentType);
    }

}
