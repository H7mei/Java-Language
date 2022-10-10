import pakage.file.LoginRequest;

class ExceptionValidate extends Throwable {
    private String message;

    public ExceptionValidate(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

class NullExceptionValidate extends Throwable {
    public NullExceptionValidate(String message) {
        super(message);
    }
    public String getMessage() {
        return super.getMessage();
    }
}

class BlankException extends RuntimeException {
    public BlankException(String message) {
        super(message);
    }
    public String getMessage() {
        return super.getMessage();
    }
}

public class Exception extends Throwable {
    public static void validate(LoginRequest loginRequest) throws ExceptionValidate, NullExceptionValidate {
        if (loginRequest.username() == null) {
            throw new NullExceptionValidate("Username tidak boleh null");
        }else if(loginRequest.username().isBlank()){
            throw new BlankException("Username tidak boleh kosong");
        }else if(loginRequest.password() == null){
            throw new NullExceptionValidate("Password tidak boleh null");
        }else if(loginRequest.password().isBlank()){
            throw new BlankException("Password tidak boleh kosong");
        }else if (loginRequest.username().equals("hann") && loginRequest.password().equals("123")) {
            loginRequest.susses();
        } else {
            throw new ExceptionValidate("Email atau Password Salah");
        }
    }

    public static void main(String[] args) throws ExceptionValidate {
        LoginRequest loginRequest = new LoginRequest("hann", "123");

        try {
            validate(loginRequest);
        } catch (ExceptionValidate | NullExceptionValidate e) { // multi catch
            System.out.println("kesalahan : " + e.getMessage());
        } finally {
            System.out.println("selesai");
        }

        // RuntimeException
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[1]);
        } catch (BlankException e) {
            System.out.println("kesalahan : " + e.getMessage());
            // StackTraceElement
            e.printStackTrace();
        } finally {
            System.out.println("selesai");
        }
    }
}