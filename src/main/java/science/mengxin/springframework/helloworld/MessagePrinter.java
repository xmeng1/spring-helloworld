package science.mengxin.springframework.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * User:    mengxin
 * Date:    31/07/17
 * Project: helloworld
 * Package: science.mengxin.springframework.helloworld
 * Description: MessagePrinter.
 *
 * @author mengxin
 * @version 1.0
 */
@Component
public class MessagePrinter {
    final private MessageService service;

    @Autowired
    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
