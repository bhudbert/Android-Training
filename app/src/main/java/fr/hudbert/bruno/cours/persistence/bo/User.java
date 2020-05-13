package fr.hudbert.bruno.cours.persistence.bo;

public class User {

    private Long id;
    private String name;
    private String firstname;


    public User() {
    }

    public User(String name, String firstname) {
        this.name = name;
        this.firstname = firstname;
    }


    public User(Long id, String name, String firstname) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String toString(){
        StringBuilder userToString = new StringBuilder();
        userToString.append(this.id);
        userToString.append(" => ");
        userToString.append(this.firstname);
        userToString.append(" ");
        userToString.append(this.name.toUpperCase());

     return userToString.toString();
    }

}