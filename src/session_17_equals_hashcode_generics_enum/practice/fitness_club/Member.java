package session_17_equals_hashcode_generics_enum.practice.fitness_club;

import java.time.LocalDate;
import java.util.List;

public class Member {

    private String lastName;
    private String firstName;
    private long id;
    private String email;
    private String phone;
    private Membership membership;
    private LocalDate dateOfBirth;
    private List<FitnessClass> fintessClassList;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<FitnessClass> getFintessClassList() {
        return fintessClassList;
    }

    public void setFintessClassList(List<FitnessClass> fintessClassList) {
        this.fintessClassList = fintessClassList;
    }
}
