import pakage.Annotation.NotBlank;

class CreateUserRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class Reflection {

    public static void main(String[] args) {
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setUsername("hann");
        createUserRequest.setPassword("123");

        Class<?> aClass = createUserRequest.getClass();

        // get username
        try {
            var usernameField = aClass.getDeclaredField("username");
            usernameField.setAccessible(true);
            System.out.println(usernameField.get(createUserRequest));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        // get password
        try {
            var passwordField = aClass.getDeclaredField("password");
            passwordField.setAccessible(true);
            System.out.println(passwordField.get(createUserRequest));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
