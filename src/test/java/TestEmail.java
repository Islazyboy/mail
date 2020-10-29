import com.jiyun.controller.App;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import java.lang.annotation.Target;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {App.class})
public class TestEmail {
    @Autowired
    private JavaMailSender javaMailSender;
    @Test
    public void testsend() throws MessagingException {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("1311465499@qq.com");
        message.setTo("lazyboy@88.com");
        message.setSubject("你好");
        message.setText("Hello World");
        javaMailSender.send(message);
    }

}
