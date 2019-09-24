public class Main {

    public static void main(String[] args) {
        String myUsername = "nymann96";
        String myPassword = "sonxet-qofke1-bewDon";

        if(!User.validateUsername(myUsername)) {
            System.out.println("Username doesn't fit the rules. Please check the User class.");
        } else {
            User u = new User(myUsername, User.hashPassword(myPassword));
            System.out.println(u);
        }
    }
}
