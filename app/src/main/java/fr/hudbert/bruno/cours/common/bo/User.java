package fr.hudbert.bruno.cours.common.bo;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

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

    protected User(Parcel in) {
        if (in.readByte() == 0) {
            id = null;
        } else {
            id = in.readLong();
        }
        name = in.readString();
        firstname = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (id == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(id);
        }
        dest.writeString(name);
        dest.writeString(firstname);
    }
}
