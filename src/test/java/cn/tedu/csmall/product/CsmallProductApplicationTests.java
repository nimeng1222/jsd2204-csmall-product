package cn.tedu.csmall.product;

import cn.tedu.csmall.product.pojo.entity.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CsmallProductApplicationTests {

    @Test
    void contextLoads() {
        Album a = new Album();
        a.setDescription("").setId(1l).setName("ff");
    }

}
