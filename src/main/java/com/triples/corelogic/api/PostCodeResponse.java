package com.triples.corelogic.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PostCodeResponse {
	private List<PropertySearchResource> content;
	private List<Link> links;
	//private Page page;
	
	public PostCodeResponse() {
	}
	
	public PostCodeResponse(List<PropertySearchResource> content, List<Link> links) {
		this.content = content;
		this.links = links;
	}

	public List<PropertySearchResource> getContent() {
		return content;
	}

	public void setContent(List<PropertySearchResource> content) {
		this.content = content;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if ((content != null) && !content.isEmpty()) {
			sb.append("content: {");
			for (PropertySearchResource propertySearchResource : content) {
				sb.append("[ ").append(propertySearchResource.toString()).append(" ], ");
			}
			sb.append("}, ");
		}

		if ((links != null) && !links.isEmpty()) {
			sb.append("links: {");
			for (Link link : links) {
				sb.append("[ ").append(link.toString()).append(" ], ");
			}
			sb.append("}, ");
		}

		//Utils.appendOptional(sb, "page: ", (page == null ? null : page.toString()));
		return sb.toString();
	}
	
	public static class PropertySearchResource {
		private List<Link> links;
		private PropertySummary propertySummary;
		
		public PropertySearchResource() {
		}

		public PropertySearchResource(List<Link> links, PropertySummary propertySummary) {
			this.links = links;
			this.propertySummary = propertySummary;
		}

		public List<Link> getLinks() {
			return links;
		}

		public void setLinks(List<Link> links) {
			this.links = links;
		}

		public PropertySummary getPropertySummary() {
			return propertySummary;
		}

		public void setPropertySummary(PropertySummary propertySummary) {
			this.propertySummary = propertySummary;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			
			if ((links != null) && !links.isEmpty()) {
				sb.append("links: {");
				for (Link link : links) {
					sb.append("[ ").append(link.toString()).append(" ], ");
				}
				sb.append("}, ");
			}
			
			Utils.appendOptional(sb, "propertySummary: ", (propertySummary == null ? null : propertySummary.toString()));
			return sb.toString();
		}
	}

	public static class Link {
		private String href; // The url of the relative pagination link.
		private String rel; // The type of pagination link; available values are first, self, next and last. 
			
		public Link() {
		}
		
		public Link(String href, String rel) {
			this.href = href;
			this.rel = rel;
		}

		public String getHref() {
			return href;
		}

		public void setHref(String href) {
			this.href = href;
		}

		public String getRel() {
			return rel;
		}

		public void setRel(String rel) {
			this.rel = rel;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			Utils.appendOptional(sb, "href: ", href);
			Utils.appendOptional(sb, "rel: ", rel);
			return sb.toString();
		}
	}
	
	public static class PropertySummary {
		private Address address; // Details of the property's address. ,
		//private Attributes attributes; // Details of the property's basic attributes. ,
		//private Coordinate coordinate; // Details of the property's geo coordinates (latitude, longitude). ,
		private Integer id; // The unique identifier of the property. ,
		//private LocationIdentifiers locationIdentifiers; // Details of the unique location Ids that relate to the property's location. ,
		private PropertyPhoto propertyPhoto; // Details of the property's primary photo provided as numerous URLs varying in size. ,
		//private PropertyStatus propertyStatus; // Details of the property's current status, as observed by CoreLogic. ,
		private String propertySubType; // The sub type of the property, which can offer additional info to that of propertyType. ,
		private String propertyType; // The type of the property (e.g.: HOUSE, UNIT, etc.) 
			
		public PropertySummary() {
		}

		public PropertySummary(Address address, Integer id, PropertyPhoto propertyPhoto, String propertySubType,
				String propertyType) {
			this.address = address;
			this.id = id;
			this.propertyPhoto = propertyPhoto;
			this.propertySubType = propertySubType;
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

		public PropertyPhoto getPropertyPhoto() {
			return propertyPhoto;
		}

		public void setPropertyPhoto(PropertyPhoto propertyPhoto) {
			this.propertyPhoto = propertyPhoto;
		}

		public String getPropertySubType() {
			return propertySubType;
		}

		public void setPropertySubType(String propertySubType) {
			this.propertySubType = propertySubType;
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
			Utils.appendOptional(sb, "address: ", (address == null ? null : address.toString()));
			Utils.appendOptional(sb, "id: ", id);
			Utils.appendOptional(sb, "propertyPhoto: ", (propertyPhoto == null ? null : propertyPhoto.toString()));
			Utils.appendOptional(sb, "propertyType: ", propertyType);
			Utils.appendOptional(sb, "propertySubType: ", propertySubType);
			return sb.toString();
		}
	}
	
	public static class Address {
		private String singleLineAddress; // The property's single line address.
		
		public Address() {
		}
		
		public Address(String singleLineAddress) {
			this.singleLineAddress = singleLineAddress;
		}

		public String getSingleLineAddress() {
			return singleLineAddress;
		}

		public void setSingleLineAddress(String singleLineAddress) {
			this.singleLineAddress = singleLineAddress;
		}

		@Override
		public String toString() {
			return singleLineAddress;
		}
	}
	
	public static class PropertyPhoto {
		private String largePhotoUrl; // Large size photo URL. Photo size 768x512.
		private String mediumPhotoUrl; // Medium size photo URL. Photo size 470x313.
		private String scanDate; // The date the image was created in format YYYY-MM-DD.
		private String thumbnailPhotoUrl; // Thumbnail photo URL. Photo size 120x80. 
		
		public PropertyPhoto() {
		}

		public PropertyPhoto(String largePhotoUrl, String mediumPhotoUrl, String scanDate, String thumbnailPhotoUrl) {
			this.largePhotoUrl = largePhotoUrl;
			this.mediumPhotoUrl = mediumPhotoUrl;
			this.scanDate = scanDate;
			this.thumbnailPhotoUrl = thumbnailPhotoUrl;
		}

		public String getLargePhotoUrl() {
			return largePhotoUrl;
		}

		public void setLargePhotoUrl(String largePhotoUrl) {
			this.largePhotoUrl = largePhotoUrl;
		}

		public String getMediumPhotoUrl() {
			return mediumPhotoUrl;
		}

		public void setMediumPhotoUrl(String mediumPhotoUrl) {
			this.mediumPhotoUrl = mediumPhotoUrl;
		}

		public String getScanDate() {
			return scanDate;
		}

		public void setScanDate(String scanDate) {
			this.scanDate = scanDate;
		}

		public String getThumbnailPhotoUrl() {
			return thumbnailPhotoUrl;
		}

		public void setThumbnailPhotoUrl(String thumbnailPhotoUrl) {
			this.thumbnailPhotoUrl = thumbnailPhotoUrl;
		}
	}
}
