package com.prasad.devops;


import com.prasad.devops.controller.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(HomeController.class)
class DevopsApplicationTests {

	@Autowired
	private MockMvc mockMvc;

    @Test
	void testHomeAPI() throws Exception {
		String name="Prasad";
        this.mockMvc.perform(MockMvcRequestBuilders.get("/app/home/"+name))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.status").value(200))
                .andExpect(MockMvcResultMatchers.jsonPath("$.message").value("Hello "+name+", Jenkins CI/CD launched successfully"));
	}


}
