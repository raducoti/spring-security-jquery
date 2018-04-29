package demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping("/api")
public class ContentController {

    private static final Logger log = LoggerFactory.getLogger(ContentController.class);

    @GetMapping(value = "/content")
    public ResponseEntity<Message> getContent() {
        Message message = new Message("This content can be retrieved by any authenticated user");
        return ResponseEntity.ok(message);
    }
}
