package org.varun;

import java.io.IOException;

import org.infinispan.protostream.DescriptorParserException;

import genny.BaseEntity;
import genny.BaseEntityKey;

public class Entrypoint {

	public static void main(String[] args) throws DescriptorParserException, IOException {
		InfinispanUtils utils = new InfinispanUtils();
		System.out.println("utils.getCacheNames() -> " + utils.getCacheNames());
		long start = System.currentTimeMillis();
		// BaseEntity be = (BaseEntity)
		// utils.getData("baseentity","internmatch"+":PRJ_INTERNMATCH");
		// BaseEntity be = (BaseEntity) utils.getData("baseentity","1");
		// BaseEntity be = (BaseEntity)
		// utils.getData("baseentity_test","{\"_type\":\"genny.baseentity_key\",\"realm\":\"hidden\",\"code\":\"PER_3AD94898-99FD-4477-B98A-C232C62AE5BD\"}");
		BaseEntityKey key = new BaseEntityKey();
		//key.setType("genny.baseentity_key");
		key.setRealm("internmatch");
		key.setCode("APP_003B03DC-CB06-4F88-BBDA-46EA72BC7DC9");
		BaseEntity be = (BaseEntity) utils.getData("baseentity", key);
		// BaseentityAttribute bea = (BaseentityAttribute)
		// utils.getData("baseentity_attribute", );
		long end = System.currentTimeMillis();
		System.out.println("utils.getData(\"baseentity\") -> " + be);
		System.out.println("Time taken (ms) -> " + (end - start));
		start = System.currentTimeMillis();
		be.setName("Saimadhav Dasa");
		utils.insertData("baseentity", key, be);
		end = System.currentTimeMillis();
		System.out.println("utils.getData(\"baseentity\") -> " + be);
		System.out.println("Time taken (ms) -> " + (end - start));
	}
}
