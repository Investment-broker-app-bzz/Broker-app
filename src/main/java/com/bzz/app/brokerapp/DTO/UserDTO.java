package com.bzz.app.brokerapp.DTO;

import com.bzz.app.brokerapp.Entities.User;
import com.bzz.app.brokerapp.Entities.User;

public class UserDTO {

    private final User user;

    public UserDTO(User user){
        this.user = user;
    }

    public String getUsername() {
        return this.user.getUsername();
    }

    public String getPassword(){
        return this.user.getPassword();
    }


}
