package com.ZadanieCRUD.ZadanieCRUD.UserController;

import com.ZadanieCRUD.ZadanieCRUD.DTO.UserDTO;
import com.ZadanieCRUD.ZadanieCRUD.DTO.UserSaveDTO;
import com.ZadanieCRUD.ZadanieCRUD.DTO.UserUpdateDTO;
import com.ZadanieCRUD.ZadanieCRUD.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {
@Autowired
private UserService userService;
    @PostMapping(path = "/save")
    public String saveUser(@RequestBody UserSaveDTO userSaveDTO){
        String id = userService.addUser(userSaveDTO);
        return id;

    }
    @GetMapping(path = "/getAllUser")
    public List<UserDTO> getAllUsers(){
        List<UserDTO>allUsers = userService.getAllUser();
        return allUsers;

    }
    @PutMapping(path = "/update")
    public String updateUser(@RequestBody UserUpdateDTO userUpdateDTO){
        String id = userService.updateUsers(userUpdateDTO);
        return id;

    }
    @DeleteMapping(path = "/deleteuser/{id}")
    public String deleteUser(@PathVariable(value ="id")int id){
      boolean deleteUser = userService.deleteUser(id);
      return"Usunięty";

    }

}
