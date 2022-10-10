package pakage.file;

public record LoginRequest(String username, String password) {
    public LoginRequest {
        System.out.println("...");
    }
    public void failed() {
        System.out.println("Login Failed");
    }

    public void susses(){
        System.out.println("Login Sukses");
    }

}
