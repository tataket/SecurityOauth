package com.example.SecurityGi;

import com.example.SecurityGi.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc(addFilters = false)
@SpringBootTest
class SecurityGiApplicationTests {

	@Autowired
	MockMvc mockMvc;
	@MockBean
	UserRepository userRepository;

	@Test
	void getAllUsers() throws Exception {


	}
}
