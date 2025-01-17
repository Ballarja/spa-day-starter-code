package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Users {

    @NotBlank(message = "Field is Empty")
    @Size(min = 5, max = 15, message = "Must be between 5 and 15 characters")
    private String username;

    @Email(message = "Invalid email format.")
    private String email;

    @Min(value = 6, message = "Must be 6 characters long")
    private String password;

    public Users() {

    }

    public Users(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
