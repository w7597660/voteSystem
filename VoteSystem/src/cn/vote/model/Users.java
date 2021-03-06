package cn.vote.model;

// Generated 2014-6-29 1:14:17 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name = "users", catalog = "vote")
public class Users implements java.io.Serializable {

	private String id;
	private String password;
	private String realname;
	private String phone;
	private List<Voteinfo> voteinfos = new ArrayList<Voteinfo>(0);

	public Users() {
	}

	public Users(String id, String password, String realname, String phone) {
		this.id = id;
		this.password = password;
		this.realname = realname;
		this.phone = phone;
	}

	public Users(String id, String password, String realname, String phone,
			List<Voteinfo> voteinfos) {
		this.id = id;
		this.password = password;
		this.realname = realname;
		this.phone = phone;
		this.voteinfos = voteinfos;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "password", nullable = false, length = 10)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "realname", nullable = false, length = 10)
	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	@Column(name = "phone", nullable = false, length = 15)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public List<Voteinfo> getVoteinfos() {
		return this.voteinfos;
	}

	public void setVoteinfos(List<Voteinfo> voteinfos) {
		this.voteinfos = voteinfos;
	}

}
