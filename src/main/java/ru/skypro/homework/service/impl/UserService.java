package ru.skypro.homework.service.impl;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.NewPasswordDto;
import ru.skypro.homework.dto.UserDto;


import java.io.IOException;

@Service
public class UserService implements UserDetailsManager {
    public void setPassword(NewPasswordDto newPassword) {
    }

    public UserDto getUser() {
        return null;
    }

    public void updateUser(UserDto user) {
    }

    public void updateUserImage(MultipartFile file) throws IOException {

    }

    public void getUserImage(Integer id) {
    }

    @Override
    public void createUser(UserDetails user) {

    }

    @Override
    public void updateUser(UserDetails user) {

    }

    @Override
    public void deleteUser(String username) {

    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {

    }

    @Override
    public boolean userExists(String username) {
        return false;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

}
