package br.com.coachme.controllers;

import br.com.coachme.dtos.UserDto;
import br.com.coachme.models.User;
import br.com.coachme.services.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody @Valid UserDto userDto){
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        return ResponseEntity.ok().body(userService.save(user));
    }
}
