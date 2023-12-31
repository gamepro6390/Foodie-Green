package user;

public class UserDTO {
	private String name;
	private String nickname;
	private String email; 
	private String pw;
	private String phone;
	private int id;
	private String logintype;
	private String kakaoId;
	
	public UserDTO(String name, String nickname, String email, String pw, String phone, int id, String logintype,
			String kakaoId) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.email = email;
		this.pw = pw;
		this.phone = phone;
		this.id = id;
		this.logintype = logintype;
		this.kakaoId = kakaoId;
	}

	public String getKakaoId() {
		return kakaoId;
	}

	public void setKakaoId(String kakaoId) {
		this.kakaoId = kakaoId;
	}

	public String getLogintype() {
		return logintype;
	}

	public void setLogintype(String logintype) {
		this.logintype = logintype;
	}

	public UserDTO() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
