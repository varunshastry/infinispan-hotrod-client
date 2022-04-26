package org.varun;

import java.io.IOException;

import org.infinispan.protostream.MessageMarshaller;

import genny.BaseEntity;

public class BaseEntityMessageMarshaller implements MessageMarshaller<BaseEntity> {

	@Override
	public Class<BaseEntity> getJavaClass() {
		return BaseEntity.class;
	}

	@Override
	public String getTypeName() {
		return "genny.baseentity_value";
	}

	// @Override
	public BaseEntity readFrom(ProtoStreamReader reader) throws IOException {
		BaseEntity be = new BaseEntity();
		be.setDtype(reader.readString("dtype"));
		be.setId(reader.readLong("id"));
		be.setCode(reader.readString("code"));
		be.setCreated(reader.readLong("created"));
		be.setName(reader.readString("name"));
		be.setRealm(reader.readString("realm"));
		be.setStatus(reader.readInt("status"));
		be.setUpdated(reader.readLong("updated"));
		return be;
	}

	// @Override
	public void writeTo(ProtoStreamWriter writer, BaseEntity be) throws IOException {
		writer.writeString("dtype", be.getDtype());
		writer.writeLong("id", be.getId());
		writer.writeString("code", be.getCode());
		writer.writeLong("created", be.getCreated());
		writer.writeString("name", be.getName());
		writer.writeString("realm", be.getRealm());
		writer.writeInt("status", be.getStatus());
		writer.writeLong("updated", be.getUpdated());
	}

}
