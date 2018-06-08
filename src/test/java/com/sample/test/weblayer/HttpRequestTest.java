package com.sample.test.weblayer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {
// @SpringBootTest는 Main class의 @SpringBootApplication을 찾고 Context를 로드한다
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
        // port로 서버를 시작하고 TestRestTemplate을 통해 날린 요청을 Controller에 전달
        assertThat(this.restTemplate.getForObject("http://localhost:" + port, String.class)).contains("Hello World");
    }
}
