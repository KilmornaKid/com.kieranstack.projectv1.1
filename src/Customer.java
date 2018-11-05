

public class Customer {

    private String registrationNumber;
    private String loginPassword;
    private GUI menu;

    //Getters
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public GUI getMenu() {
        return menu;
    }

    //Setters
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public void setMenu(GUI menu) {
        this.menu = menu;
    }

    public Customer() {
        this("No Registration Entered","No Password Entered",null);
    }

    public Customer(String registrationNumber, String loginPassword, GUI menu){
        setRegistrationNumber(registrationNumber);
        setLoginPassword(loginPassword);
        setMenu(menu);
    }


    public String toString(){
        return "Registration Number: " + getRegistrationNumber() + "\nPassword: " + getLoginPassword();
    }


}
