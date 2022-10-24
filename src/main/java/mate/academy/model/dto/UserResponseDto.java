package mate.academy.model.dto;

import java.util.List;

public class UserResponseDto {
    private String email;
    private List<RoleResponseDto> roles;

    public String getEmail() {
        return email;
    }

    public void setEmail(String login) {
        this.email = login;
    }

    public List<RoleResponseDto> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleResponseDto> roles) {
        this.roles = roles;
    }
}
