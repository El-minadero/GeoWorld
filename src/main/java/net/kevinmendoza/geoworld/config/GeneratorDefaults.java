package net.kevinmendoza.geoworld.config;

import com.google.common.reflect.TypeToken;

import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

@ConfigSerializable
class GeneratorDefaults implements IGeneratorDefaults {
	static final TypeToken<GeneratorDefaults> type = TypeToken.of(GeneratorDefaults.class);
	@Setting 
	boolean removeDefaultOres;
	
	GeneratorDefaults(){
		removeDefaultOres = true;
	}
	@Override
	public boolean removeVanillaOres() {
		// TODO Auto-generated method stub
		return false;
	}

}
