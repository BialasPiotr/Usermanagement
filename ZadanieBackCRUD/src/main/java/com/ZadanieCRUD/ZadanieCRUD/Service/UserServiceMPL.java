package com.ZadanieCRUD.ZadanieCRUD.Service;

import com.ZadanieCRUD.ZadanieCRUD.DTO.UserDTO;
import com.ZadanieCRUD.ZadanieCRUD.DTO.UserSaveDTO;
import com.ZadanieCRUD.ZadanieCRUD.DTO.UserUpdateDTO;
import com.ZadanieCRUD.ZadanieCRUD.Entity.User;
import com.ZadanieCRUD.ZadanieCRUD.UserRepo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceMPL  implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public String addUser(UserSaveDTO userSaveDTO) {
        User user = new User(
                userSaveDTO.getUsername(),
                userSaveDTO.getUseremail(),
                userSaveDTO.getUserpassword(),
                userSaveDTO.getUserphone(),
                userSaveDTO.getUserbirthdate()
        );
        userRepo.save(user);
        return user.getUsername();
    }

    @Override
    public List<UserDTO> getAllUser() {
        List<User> getUsers = userRepo.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();
        for(User a:getUsers){
            UserDTO userDTO = new UserDTO(
                    a.getUserid(),
                    a.getUseremail(),
                    a.getUsername(),
                    a.getUserbirthdate(),
                    a.getUserpassword(),
                    a.getUserphone()
            );
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }

    @Override
    public String updateUsers(UserUpdateDTO userUpdateDTO) {
        if (userRepo.existsById(userUpdateDTO.getUserid())) {
            User user = userRepo.getById(userUpdateDTO.getUserid());
            user.setUsername(userUpdateDTO.getUsername());
            user.setUserpassword(userUpdateDTO.getUserpassword());
            user.setUseremail(userUpdateDTO.getUseremail());
            user.setUserbirthdate(userUpdateDTO.getUserbirthdate());
            user.setUserphone(userUpdateDTO.getUserphone());

            userRepo.save(user);
        }
            else{
                System.out.println("User ID nie istnieje");
            }
            return null;
        }

    @Override
    public boolean deleteUser(int id) {
        if(userRepo.existsById(id)){
            userRepo.deleteById(id);
        }
        else{
            System.out.println("Nie ma użytkownika");
        }
        return true;
    }
}

