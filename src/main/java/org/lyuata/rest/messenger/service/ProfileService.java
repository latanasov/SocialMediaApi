package org.lyuata.rest.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.lyuata.rest.messenger.databases.DatabaseClass;

import org.lyuata.rest.messenger.model.Profile;

public class ProfileService {
	private Map<String, Profile> profiles = DatabaseClass.getProfiles();


	public ProfileService()
	{
		if (profiles.size()==0) {
			profiles.put("lyuata",new Profile(1,"lyuata","ss","ss"));
			profiles.put("liosko",new Profile(2,"liosko","ss","ss"));		
			  }
	}
	public List<Profile> getProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}
	

	public Profile getProfile(String name) {
		return profiles.get(name);
	}

	public Profile addProfile(Profile newProfile) {
		newProfile.setId(profiles.size() + 1);
		profiles.put(newProfile.getProfileName(), newProfile);
		return newProfile;

	}

	public Profile updateProfile(Profile profile) {
		if (profile.getFirstName().isEmpty()) {
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public Profile removeProfile(String name) {

		return profiles.remove(name);
	}
	

}
