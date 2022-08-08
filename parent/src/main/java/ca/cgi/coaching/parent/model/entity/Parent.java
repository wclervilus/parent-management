package ca.cgi.coaching.parent.model.entity;

import javax.persistence.Entity;
import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Parent extends Base{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
    @Column(name = "FIRST_NAME", nullable = false)
    @Length(min=3,max=50, message="Incorrect First Name")
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    @Length(min=3,max=50, message="Incorrect last Name")
    private String lastName;
    
    @Column(name = "MAIL", nullable = false)
    @Email(message="Incorrect Email address")
    private String mail;
}
