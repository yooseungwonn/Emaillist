package himedia.dao;

import java.util.Date;

// Table emaillist의 레코드를 저장하기 위한 DTO 객체
// 1. 기본 생성자를 가지고 있다.
// 2. 비즈니스 로직을 가지지 않은 순수 데이터 객체
// 3. 필드, getters/setters
// 4. toString, equals 들 객체 관련 매서드를 오버라이드
public class EmailVo {
	// Fields
	private Long no;
	private String firstName;
	private String lastName;
	private String email;
	private Date createdAt;
	
	// 생성자
	public EmailVo() {		
	}
	
	// 전체 필드 생성자
	public EmailVo(Long no, String lastName, String firstName, String email, Date createdAt) {
		this.no = no;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.createdAt = createdAt;
	}
	// no(PK) -> 시퀀스, createdAt -> default
	public EmailVo(String lastName, String firstName, String email) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
	}
	
	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	@Override
	public String toString() {
		return "EmailVo [no=" + no + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", createdAt=" + createdAt + "]";
	}

	
	
}
