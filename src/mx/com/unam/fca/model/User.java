package mx.com.unam.fca.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;

import static mx.com.unam.fca.util.CommonConstants.ES_VALUE;
import static mx.com.unam.fca.util.CommonConstants.FORMAT_DATE_TIME;
import static mx.com.unam.fca.util.CommonConstants.MX_VALUE;
import static mx.com.unam.fca.util.CommonConstants.TEMPORARY_EMAIL;
import static mx.com.unam.fca.util.CommonConstants.TEMPORARY_NAME;
import static mx.com.unam.fca.util.CommonConstants.TEMPORARY_PASSWORD;

public class User {

    private UUID idUser;

    private String nameUser;

    private String password;

    private String email;

    private LocalDateTime createdDate;

    private Locale locale = new Locale(ES_VALUE, MX_VALUE);

    public User() {
        this.idUser = UUID.randomUUID();
        this.nameUser = TEMPORARY_NAME;
        this.email = TEMPORARY_EMAIL;
        this.password = TEMPORARY_PASSWORD;
        this.createdDate = LocalDateTime.now();
    }

    public User(String nameUser, String email, String password) {
        this.idUser = UUID.randomUUID();
        this.nameUser = Optional.ofNullable(nameUser).orElse(TEMPORARY_NAME);
        this.email = Optional.ofNullable(email).orElse(TEMPORARY_EMAIL);
        this.password = Optional.ofNullable(password).orElse(TEMPORARY_PASSWORD);
        this.createdDate = LocalDateTime.now();
    }

    public String getIdUser() {
        return this.idUser.toString();
    }

    public String getNameUser() {
        return nameUser;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getCreatedDate() {
        return createdDate.format(DateTimeFormatter.ofPattern(FORMAT_DATE_TIME, locale));
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
