package me.pugabyte.edenapi.persistence;

public enum MongoDBDatabase {
	BEARNATION;

	public String getDatabase() {
		String name = name().toLowerCase();

		if (name.equals("bearnation"))
			return name;

		return "bearnation_" + name;
	}
}
