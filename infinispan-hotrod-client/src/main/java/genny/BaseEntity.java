package genny;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BaseEntity implements CoreEntity {
	String dtype;
	long id;
	LocalDateTime created;
	String name;
	String realm;
	LocalDateTime updated;
	String code;
	int status;

	public BaseEntity() {
		this(null, 0, 0, null, null, 0, null, 0);
	}

	public BaseEntity(String dtype, long id, long created, String name, String realm, long updated, String code,
			int status) {
		super();
		this.dtype = dtype;
		this.id = id;
		this.created = LocalDateTime.ofEpochSecond(created / 1000, 0, ZoneOffset.UTC);
		this.name = name;
		this.realm = realm;
		this.updated = LocalDateTime.ofEpochSecond(updated / 1000, 0, ZoneOffset.UTC);
		this.code = code;
		this.status = status;
	}

	public String getDtype() {
		return dtype;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCreated() {
		return created.toEpochSecond(ZoneOffset.UTC);
	}

	public void setCreated(long created) {
		this.created = LocalDateTime.ofEpochSecond(created / 1000, 0, ZoneOffset.UTC);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRealm() {
		return realm;
	}

	public void setRealm(String realm) {
		this.realm = realm;
	}

	public long getUpdated() {
		return updated.toEpochSecond(ZoneOffset.UTC);
	}

	public void setUpdated(long updated) {
		this.updated = LocalDateTime.ofEpochSecond(updated / 1000, 0, ZoneOffset.UTC);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String toString() {
		return dtype + ":" + id + ":" + created + ":" + name + ":" + realm + ":" + updated + ":" + code + ":" + status;
	}
}
