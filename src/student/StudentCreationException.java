package student;

public class StudentCreationException extends RuntimeException{

    private String name;
    private String sName;
    private String lName;

    public StudentCreationException(String name, String sName, String lName) {
        super(String.format("Incorrect user initialization. You can`t create user with name = %s second name = %s and last name = %s"
                , name, sName, lName));
        this.name = name;
        this.sName = sName;
        this.lName = lName;
    }

    public StudentCreationException(String additionalMessage, String name, String sName, String lName) {
        super(String.format("Incorrect user initialization. You can`t create user with name = %s second name = %s and last name = %s. %s"
                , name, sName, lName, additionalMessage));
        this.name = name;
        this.sName = sName;
        this.lName = lName;
    }
}
