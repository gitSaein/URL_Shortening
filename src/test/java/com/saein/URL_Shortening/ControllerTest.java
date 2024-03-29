package com.saein.URL_Shortening;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.saein.URL_Shortening.service.Base62;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class ControllerTest {

	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void getHello() throws Exception{
		mockMvc.perform(get("/"))
		.andExpect(status().isOk())
		.andDo(print());
	}
	
	@Test
	public void postHello() throws Exception{
		mockMvc.perform(post("/")
				.param("originUrl","https://github.com/gitSaein?tab=repositories"))
		.andExpect(status().isOk())
		.andExpect(model().attributeExists("vo"))
		.andDo(print());
	}
	
	@Test
	public void base62Encoding() throws Exception{
		assertEquals(Base62.encoding(1),"b");
		assertEquals(Base62.encoding(12233),"tld");
		assertEquals(Base62.decoding("tld"),12233);
		assertEquals(Base62.encoding(125),"bc");
		assertEquals(Base62.decoding("bc"),125);
		assertEquals(Base62.encoding(35725),"nsj");
		assertEquals(Base62.decoding("nsj"),35725);
	}
}
