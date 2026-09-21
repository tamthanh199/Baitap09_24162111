package vn.hcmute.vidu1.dto;

public class UserDTO {

    private Long id;

    private String email;

    private String fullName;

    private String roleName;

    private boolean enabled;

    public UserDTO() {
    }

    public UserDTO(Long id,
                   String email,
                   String fullName,
                   String roleName,
                   boolean enabled) {

        this.id = id;
        this.email = email;
        this.fullName = fullName;
        this.roleName = roleName;
        this.enabled = enabled;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}