package genny;

public class BaseEntityKey implements CoreEntityKey {
	String realm;
	String code;

	public BaseEntityKey() {
		this(null, null);
	}

	public BaseEntityKey(String realm, String code) {
		super();
		this.realm = realm;
		this.code = code;
	}

	public String getRealm() {
		return realm;
	}

	public void setRealm(String realm) {
		this.realm = realm;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String toString() {
		return realm + ":" + code;
	}
}
