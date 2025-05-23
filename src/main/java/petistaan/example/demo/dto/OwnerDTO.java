package petistaan.example.demo.dto;


import petistaan.example.demo.enums.Gender;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class OwnerDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName;
    private String lastName;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String city;
    private String state;
    private String mobileNumber;
    private String emailId;
    @OneToOne(mappedBy = "ownerDTO", cascade = CascadeType.ALL)
    private PetDTO petDTO;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobNo) {
        this.mobileNumber = mobNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public PetDTO getPetDTO() {
        return petDTO;
    }

    public void setPetDTO(PetDTO petDTO) {
        this.petDTO = petDTO;
    }

    @Override
    public String toString() {
        if (Objects.nonNull(petDTO)) {
            return "OwnerDTO{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", gender=" + gender +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", mobileNumber='" + mobileNumber + '\'' +
                    ", emailId='" + emailId + '\'' +
                    ", petDTO=" + petDTO +
                    '}';
        }else{
            return "OwnerDTO{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", gender=" + gender +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", mobileNumber='" + mobileNumber + '\'' +
                    ", emailId='" + emailId + '\'' +
                    '}';
        }
    }
}
