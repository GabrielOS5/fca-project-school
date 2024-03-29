package mx.com.unam.fca;

import mx.com.unam.fca.model.User;

import static mx.com.unam.fca.util.CommonConstants.CREATE_DATE;
import static mx.com.unam.fca.util.CommonConstants.EMAIL;
import static mx.com.unam.fca.util.CommonConstants.ID;
import static mx.com.unam.fca.util.CommonConstants.NAME;
import static mx.com.unam.fca.util.CommonConstants.PASSWORD;

public class Application {

    public static void main(String[] args) {
        User user = new User("Gabriel", "gabriel@example.com","Gabo05");
        printInformation(user);
    }

    private static void printInformation(User user) {
        System.out.println(ID.concat(user.getIdUser()));
        System.out.println(NAME.concat(user.getNameUser()));
        System.out.println(EMAIL.concat(user.getEmail()));
        System.out.println(PASSWORD.concat(user.getPassword()));
        System.out.println(CREATE_DATE.concat(user.getCreatedDate()));
    }

}