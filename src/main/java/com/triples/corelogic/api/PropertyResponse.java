package com.triples.corelogic.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PropertyResponse {
	private Property property;

	public PropertyResponse() {
	}

	public PropertyResponse(Property property) {
		this.property = property;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}


	@Override
	public String toString() {
		return property.toString();
	}

	public static class Property {
		private Address address; // The address of the property record.
		//private PropertyAttributes attributes; // Details of attributes of the property. e.g.: bedrooms, bathrooms, land area etc.
		//private List<AvmDetail> avmDetailList; // A list of the available automated valuation models (AVMs) for the property.Not available for NZ
		//private List<Contact> contactList; // A list of contacts for the property.
		//private Coordinate coordinate; // The longitude and latitude location of the property.
		// private List<CurrentOwnership> currentOwnershipList; // A list of the current owner(s) of the property. May only appear as a surname in some states. Note: This is not returned for properties located within the Northern Territory.
		// private List<DevelopmentApplication> developmentApplicationList; // A list of development applications for the property sorted descending by permit issue date.Not available for NZ
		// private List<ExternalReference> externalReferenceList; // A list of external references relating to the property.
		// private List<Feature> featureList; // A list of features related to the property.
		// private List<RentPropertyCampaign> forRentPropertyCampaignList; // A list of For Rent advertisements for the property grouped at the property campaign level.
		// private List<AgencyCampaign> forSaleAgencyCampaignList; // A list of For Sale advertisements for the property grouped into agency level campaigns and returned in descending order by campaign from date.
		// private List<PropertyCampaign> forSalePropertyCampaignList; A list of For Sale advertisements for the property grouped at the property campaign level and returned in descending order by campaign from date.
		private Integer id; // The unique CoreLogic RP Data property Id.
		// private Legal legal; // Legal descriptors for the property; this data varies by State.
		private String occupancyType; // Details of the property's occupancy type. Available values include: Owner Occupied; Rented; Government Owned - Rented; and Government Owned - Other.
		// private List<Parcel> parcelList; // A list of land parcel information for the property; this data varies per State.
		// private List<PropertyPhoto> propertyPhotoList; // A list of the available property photo URLs.
		private String propertySubType; // The sub type of the property. This is a concatenation of the propertyType and propertySubTypeShort.This is the recommended display value when identifying a property type.
		private String propertySubTypeShort; // The short sub type of the property. This corresponds to the propertyType and provides a more descriptive indication of the property type.
		private String propertyType; // The type of the property. e.g.: HOUSE, UNIT, etc.
		// private List<SalesHistory> saleList; // A list of the property's sales made up of Agents Advice and Valuer General data sorted descending by contract date.
		// private Site site; // Details of the property's site including site values, land use and zoning information. ,
		// private Title title; // Property title information; this data varies per State.
		
		public Property() {
		}

		public Property(Address address, Integer id, String occupancyType, String propertySubType,
				String propertySubTypeShort, String propertyType) {
			this.address = address;
			this.id = id;
			this.occupancyType = occupancyType;
			this.propertySubType = propertySubType;
			this.propertySubTypeShort = propertySubTypeShort;
			this.propertyType = propertyType;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getOccupancyType() {
			return occupancyType;
		}

		public void setOccupancyType(String occupancyType) {
			this.occupancyType = occupancyType;
		}

		public String getPropertySubType() {
			return propertySubType;
		}

		public void setPropertySubType(String propertySubType) {
			this.propertySubType = propertySubType;
		}

		public String getPropertySubTypeShort() {
			return propertySubTypeShort;
		}

		public void setPropertySubTypeShort(String propertySubTypeShort) {
			this.propertySubTypeShort = propertySubTypeShort;
		}

		public String getPropertyType() {
			return propertyType;
		}

		public void setPropertyType(String propertyType) {
			this.propertyType = propertyType;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			Utils.appendOptional(sb, "Address: ", (address == null ? null : address.toString()));
			return sb.toString();
		}
	}

	public static class Address {
		private String buildingComplexName; // The building or complex name.
		private String councilArea; // The name of the councilArea.
		private String endAlpha; // The unit end Alpha if it is made up of a range (e.g. A-S).
		private Integer endNumber; // The unit end number if it is made up of a range (e.g. 46-51).
		private Boolean isDerivedUnit; // Whether the data has been derived: True = unitNumber is derived from the lot number; False = unitNumber is not derived from the lot number.
		private String singleLine; // A complete address in one line.
		private String startAlpha; // The unit start Alpha if it is made up of a range (e.g. A-S).
		private Integer startNumber; // The unit start number if it is made up of a range (e.g. 46-51).
		private Street street; // Returns street details including name, extension, direction, single line and locality.
		private String unitAlpha; // The unit alpha.
		private Integer unitNumber; // The unit number.
		
		public Address() {
		}

		public Address(String buildingComplexName,
				String councilArea, String endAlpha, Integer endNumber, Boolean isDerivedUnit, String singleLine,
				String startAlpha, Integer startNumber, Street street, String unitAlpha, Integer unitNumber				) {
			this.buildingComplexName = buildingComplexName;
			this.councilArea = councilArea;
			this.endAlpha = endAlpha;
			this.endNumber = endNumber;
			this.isDerivedUnit = isDerivedUnit;
			this.singleLine = singleLine;
			this.startAlpha = startAlpha;
			this.startNumber = startNumber;
			this.street = street;
			this.unitAlpha= unitAlpha;
			this.unitNumber = unitNumber;;
		}

		public String getBuildingComplexName() {
			return buildingComplexName;
		}

		public void setBuildingComplexName(String buildingComplexName) {
			this.buildingComplexName = buildingComplexName;
		}

		public String getCouncilArea() {
			return councilArea;
		}

		public void setCouncilArea(String councilArea) {
			this.councilArea = councilArea;
		}

		public String getEndAlpha() {
			return endAlpha;
		}

		public void setEndAlpha(String endAlpha) {
			this.endAlpha = endAlpha;
		}

		public Integer getEndNumber() {
			return endNumber;
		}

		public void setEndNumber(Integer endNumber) {
			this.endNumber = endNumber;
		}

		public Boolean getIsDerivedUnit() {
			return isDerivedUnit;
		}

		public void setIsDerivedUnit(Boolean isDerivedUnit) {
			this.isDerivedUnit = isDerivedUnit;
		}

		public String getSingleLine() {
			return singleLine;
		}

		public void setSingleLine(String singleLine) {
			this.singleLine = singleLine;
		}

		public String getStartAlpha() {
			return startAlpha;
		}

		public void setStartAlpha(String startAlpha) {
			this.startAlpha = startAlpha;
		}

		public Integer getStartNumber() {
			return startNumber;
		}

		public void setStartNumber(Integer startNumber) {
			this.startNumber = startNumber;
		}

		public Street getStreet() {
			return street;
		}

		public void setStreet(Street street) {
			this.street = street;
		}

		public String getUnitAlpha() {
			return unitAlpha;
		}

		public void setUnitAlpha(String unitAlpha) {
			this.unitAlpha = unitAlpha;
		}

		public Integer getUnitNumber() {
			return unitNumber;
		}

		public void setUnitNumber(Integer unitNumber) {
			this.unitNumber = unitNumber;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			Utils.appendOptional(sb, "buildingComplexName: ", buildingComplexName);
			Utils.appendOptional(sb, "councilArea: ", councilArea);
			Utils.appendOptional(sb, "endAlpha: ", endAlpha);
			Utils.appendOptional(sb, "endNumber: ", endNumber);
			Utils.appendOptional(sb, "isDerivedUnit: ", isDerivedUnit);
			Utils.appendOptional(sb, "singleLine: ", singleLine);
			Utils.appendOptional(sb, "startAlpha: ", startAlpha);
			Utils.appendOptional(sb, "startNumber: ", startNumber);
			Utils.appendOptional(sb, "street: ", (street == null ? null : street.toString()));
			Utils.appendOptional(sb, "unitAlpha: ", unitAlpha);
			Utils.appendOptional(sb, "unitNumber: ", unitNumber);
			return sb.toString();
		}
	}

	public class Street {
		private String direction; // The street direction.
		private String extension; // The street extension.
		private Integer id; // A unique street Id.
		private Locality locality; // Returns locality information including locality name and well as postcode information.
		private String name; // The name of the street.
		private String singleLine; // A single line street level address. 
			
		public Street() {
		}
		
		public Street(String direction, String extension, Integer id, Locality locality, String name,
				String singleLine) {
			this.direction = direction;
			this.extension = extension;
			this.id = id;
			this.locality = locality;
			this.name = name;
			this.singleLine = singleLine;
		}

		public String getDirection() {
			return direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}

		public String getExtension() {
			return extension;
		}

		public void setExtension(String extension) {
			this.extension = extension;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Locality getLocality() {
			return locality;
		}

		public void setLocality(Locality locality) {
			this.locality = locality;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSingleLine() {
			return singleLine;
		}

		public void setSingleLine(String singleLine) {
			this.singleLine = singleLine;
		}
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			Utils.appendOptional(sb, "direction: ", direction);
			Utils.appendOptional(sb, "extension: ", extension);
			Utils.appendOptional(sb, "id: ", id);
			Utils.appendOptional(sb, "locality: ", (locality == null ? null : locality.toString()));
			Utils.appendOptional(sb, "name: ", name);
			Utils.appendOptional(sb, "singleLine: ", singleLine);
			return sb.toString();
		}
	}

	public class Locality {
		private Integer id; // A unique locality ID
		private String name; // The name of the locality. Also known as suburb.
		private Postcode postcode; // Returns Postcode information including state and postcode ,
		private String singleLine; // A single line locality level address 
		
		public Locality() {
		}
		
		public Locality(Integer id, String name, Postcode postcode, String singleLine) {
			this.id = id;
			this.name = name;
			this.postcode = postcode;
			this.singleLine = singleLine;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Postcode getPostcode() {
			return postcode;
		}

		public void setPostcode(Postcode postcode) {
			this.postcode = postcode;
		}

		public String getSingleLine() {
			return singleLine;
		}

		public void setSingleLine(String singleLine) {
			this.singleLine = singleLine;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			Utils.appendOptional(sb, "id: ", id);
			Utils.appendOptional(sb, "name: ", name);
			Utils.appendOptional(sb, "postcode: ", (postcode == null ? null : postcode.toString()));
			Utils.appendOptional(sb, "singleLine: ", singleLine);
			return sb.toString();
		}
	}

	public class Postcode {
		private Integer id; // A unique postcode ID
		private String name; // The postcode
		private String singleLine; // A single line postcode level address 
		private String state; // The Australian stete 
		
		public Postcode() {
		}
		
		public Postcode(Integer id, String name, String singleLine, String state) {
			this.id = id;
			this.name = name;
			this.singleLine = singleLine;
			this.state = state;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSingleLine() {
			return singleLine;
		}

		public void setSingleLine(String singleLine) {
			this.singleLine = singleLine;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			Utils.appendOptional(sb, "id: ", id);
			Utils.appendOptional(sb, "name: ", name);
			Utils.appendOptional(sb, "singleLine: ", singleLine);
			Utils.appendOptional(sb, "state: ", state);
			return sb.toString();
		}
	}
}
