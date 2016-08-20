package org.lyuata.rest.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.lyuata.rest.messenger.model.*;
import org.lyuata.rest.messenger.service.ProfileService;


@Path("/profiles")
public class ProfileResource {
	ProfileService profileService = new ProfileService();



@GET
public List<Profile> getProfiles() {
	return profileService.getProfiles();
}


@POST
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public Profile addProfile(Profile newProfile) {
	return profileService.addProfile(newProfile);
}

@Path("/{profileName}")
@PUT
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public Profile updateProfile(@PathParam("profileName") String profileName, Profile newProfile) {
	newProfile.setProfileName(profileName);
	return profileService.updateProfile(newProfile);
}


@Path("/{profileName}")
@DELETE
public void removeProfile(@PathParam("profileName") String profileName) {
 profileService.removeProfile(profileName);
}

@Path("/{profileName}")
@GET
@Produces(MediaType.APPLICATION_JSON)
public Profile getProfile(@PathParam("profileName") String profileName) {
	return profileService.getProfile(profileName);
}



	
	
	
}
