package shop.tripn.api.backend.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import shop.tripn.api.backend.user.domain.User;
import shop.tripn.api.backend.user.service.UserService;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("/user/{id}")
    public Optional<User> findById(@PathVariable long id){
        return userService.findById(id);
    }
}
