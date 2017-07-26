package demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentController {

    private static final Logger log = LoggerFactory.getLogger(ContentController.class);

    @RequestMapping(value = "/content", method = RequestMethod.GET)
    public ResponseEntity<Message> getContent() {
        Message message = new Message("Hello World");
        return ResponseEntity.ok(message);
    }
}
