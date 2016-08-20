package org.lyuata.rest.messenger.databases;

import java.util.HashMap;
import java.util.Map;

import org.lyuata.rest.messenger.model.*;
public class DatabaseClass {
	private static Map<Long,Message> message=new HashMap<>();
	private static Map<String,Profile> profiles=new HashMap<>();

	public static Map<Long,Message> getMessages()
	{
		return message;
		
	}
	
	public static Map<String,Profile> getProfiles()
	{
		return profiles;
		
	}

}
