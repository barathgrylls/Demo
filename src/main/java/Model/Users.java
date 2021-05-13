package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data

public class Users {
	
	@Id
	@GeneratedValue
	private int userId;
	
	private String userName;
	
	private String userNickName;

}
