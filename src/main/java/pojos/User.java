package pojos;

import javax.persistence.*;



import java.util.Date;

@Entity
@Table(name = "dac_users")
public class User {
	private Integer id;
	private String email;
	private String name;
	
	@Column
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String  pass;
	

	// def constr
	public User() {
		System.out.println("in user constr");
	}

	public User(String email, String pass,String name) {
		super();
		this.email = email;
		this.pass = pass;
		this.name= name;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(unique = true)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password")
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", pass=" + pass + "]";
	}

}
