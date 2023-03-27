package com.ZadanieCRUD.ZadanieCRUD.Service;

import com.ZadanieCRUD.ZadanieCRUD.DTO.UserDTO;
import com.ZadanieCRUD.ZadanieCRUD.DTO.UserSaveDTO;
import com.ZadanieCRUD.ZadanieCRUD.DTO.UserUpdateDTO;

import java.util.List;

public interface UserService {
    String addUser(UserSaveDTO userSaveDTO);

    List<UserDTO> getAllUser();

    String updateUsers(UserUpdateDTO userUpdateDTO);

    boolean deleteUser(int id);
}
