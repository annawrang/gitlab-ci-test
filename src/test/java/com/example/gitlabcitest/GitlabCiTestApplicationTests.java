package com.example.gitlabcitest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class GitlabCiTestApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void addition() {
        assertThat(1 + 1).isEqualTo(2);
    }

//    @Test
//    void additionShouldFail() {
//        assertThat(1 + 2).isEqualTo(2);
//    }

}
