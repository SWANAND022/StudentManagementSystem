package com.anudip.training.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//postmen -  controlle(DTO classes) - serviceIMpl(DTO)(Conertion to DTO classes into entity classes) - Entity - data base
/*http://localhost:8080/Teacher/addTeacher
{
	"tid": 1,
	"tname":"kartik",
	"tsurname":"pawar"...
}
send*/
//databases- entity - (convertion from entity classes to DTO classes - serviceimple- controlle(DTO)-  client(postmen))
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Trainer_info")
public class Teacher {    //create table Trainer_info(tid int, tname varchar(25),tsurname varchar(25)...)
	@Id
	private int tid;
	
	@Column(length = 25, nullable = false)
	@NotBlank(message="Trainer name cannot be blank")
	private String tname;
	
	@Column(length = 25, nullable = false)
	@NotBlank(message="Trainer surname cannot be blank")
	private String tsurname;
	
	@Column(length = 25, nullable = false)
	@NotBlank(message="Trainer email cannot be blank")
	@Email(message="email id is not proper")
	private String temail;
	
	@Column(length = 11, nullable = false, unique = true)
	@NotNull(message="Trainer phone cannot be Null")
	private long tphone;
	
	@Column(length = 25, nullable = false)
	@NotBlank(message="Designation cannot be blank")
	private String designation;
	
	/*
	 * @ManyToOne private Department department;
	 */

	
	
	
}
