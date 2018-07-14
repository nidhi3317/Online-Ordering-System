package pojos;

import javax.persistence.*;



import java.util.Date;

@Entity
@Table(name = "dac_users")
public class User {
	private Integer id;
	private String email;
	private String  pass;
	private double regAmount;
	private Date regDate;

	// def constr
	public User() {
		System.out.println("in user constr");
	}

	public User(String email, String pass, double regAmount, Date regDate) {
		super();
		this.email = email;
		this.pass = pass;
		this.regAmount = regAmount;
		this.regDate = regDate;
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

	@Column(name = "reg_amt")
	public double getRegAmount() {
		return regAmount;
	}

	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}

	@Column(name = "reg_date")
	@Temporal(TemporalType.DATE)
	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", pass=" + pass + ", regAmount=" + regAmount + ", regDate="
				+ regDate + "]";
	}

}
