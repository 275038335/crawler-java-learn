package common;

import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 * @version 1.0
 * @Author chaoyue.fan
 * @Date 2016/11/28 19:10
 * 测试点
 * <p/>
 * 1.只测试逻辑,不启动spring容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring/*.xml"})
@EnableWebMvc
@WebAppConfiguration
public class BaseTest extends TestCase{

}
