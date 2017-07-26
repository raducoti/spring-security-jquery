package demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private static final Logger log = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ResponseEntity<?> login(Authentication authentication) {
        log.info("authenticated user {}", authentication.getName());
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public ResponseEntity<UserProfile> userInfo(Authentication authentication) {
        log.info("authenticated user {}", authentication.getName());
        return ResponseEntity.ok(new UserProfile(authentication.getName()));
    }
}
