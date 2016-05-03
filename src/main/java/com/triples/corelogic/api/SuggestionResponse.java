package com.triples.corelogic.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SuggestionResponse {
	private List<Message> messages;
	private List<Suggestion> suggestions;
	private SystemInfo systemInfo;

	public SuggestionResponse() {
	}

	public SuggestionResponse(List<Message> messages, List<Suggestion> suggestions, SystemInfo systemInfo) {
		this.messages = messages;
		this.suggestions = suggestions;
		this.systemInfo = systemInfo;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public List<Suggestion> getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(List<Suggestion> suggestions) {
		this.suggestions = suggestions;
	}

	public SystemInfo getSystemInfo() {
		return systemInfo;
	}

	public void setSystemInfo(SystemInfo systemInfo) {
		this.systemInfo = systemInfo;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Messages: { ");
		if (messages != null) {
			for (Message message : messages) {
				sb.append(" [ ").append(message.toString()).append(" ], ");
			}
		}
		sb.append(" }");

		sb.append(", Suggestions: { ");
		if (suggestions != null) {
			for (Suggestion suggestion : suggestions) {
				sb.append(" [ ").append(suggestion.toString()).append(" ], ");
			}
		}
		sb.append(" }");

		if (systemInfo != null) {
			sb.append(", System Info: { ").append(systemInfo.toString()).append(" }");
		}

		return sb.toString();

	}

	public static class Message {
		private Integer code;
		private String message;
		private String type;

		public Message() {
		}

		public Message(Integer code, String message, String type) {
			this.code = code;
			this.message = message;
			this.type = type;
		}

		public Integer getCode() {
			return code;
		}

		public void setCode(Integer code) {
			this.code = code;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			Utils.appendOptional(sb, "Code: ", code);
			Utils.appendOptional(sb, "Message: ", message);
			Utils.appendOptional(sb, "Type: ", type);
			return sb.toString();
		}
	}

	public static class Suggestion {
		private Integer councilAreaId;
		private Integer countryId;
		private Boolean isBodyCorporate;
		private Boolean isUnit;
		private Integer localityId;
		private Integer postcodeId;
		private Integer propertyId;
		private Integer stateId;
		private Integer streetId;
		private String suggestion;
		private String suggestionType;
		private Integer territorialAuthorityId;

		public Suggestion() {
		}

		public Suggestion(Integer councilAreaId, Integer countryId, Boolean isBodyCorporate, Boolean isUnit,
				Integer localityId, Integer postcodeId, Integer propertyId, Integer stateId, Integer streetId,
				String suggestion, String suggestionType, Integer territorialAuthorityId) {
			this.councilAreaId = councilAreaId;
			this.countryId = countryId;
			this.isBodyCorporate = isBodyCorporate;
			this.isUnit = isUnit;
			this.localityId = localityId;
			this.postcodeId = postcodeId;
			this.propertyId = propertyId;
			this.stateId = stateId;
			this.streetId = streetId;
			this.suggestion = suggestion;
			this.suggestionType = suggestionType;
			this.territorialAuthorityId = territorialAuthorityId;
		}

		public Integer getCouncilAreaId() {
			return councilAreaId;
		}

		public void setCouncilAreaId(Integer councilAreaId) {
			this.councilAreaId = councilAreaId;
		}

		public Integer getCountryId() {
			return countryId;
		}

		public void setCountryId(Integer countryId) {
			this.countryId = countryId;
		}

		public Boolean getIsBodyCorporate() {
			return isBodyCorporate;
		}

		public void setIsBodyCorporate(Boolean isBodyCorporate) {
			this.isBodyCorporate = isBodyCorporate;
		}

		public Boolean getIsUnit() {
			return isUnit;
		}

		public void setIsUnit(Boolean isUnit) {
			this.isUnit = isUnit;
		}

		public Integer getLocalityId() {
			return localityId;
		}

		public void setLocalityId(Integer localityId) {
			this.localityId = localityId;
		}

		public Integer getPostcodeId() {
			return postcodeId;
		}

		public void setPostcodeId(Integer postcodeId) {
			this.postcodeId = postcodeId;
		}

		public Integer getPropertyId() {
			return propertyId;
		}

		public void setPropertyId(Integer propertyId) {
			this.propertyId = propertyId;
		}

		public Integer getStateId() {
			return stateId;
		}

		public void setStateId(Integer stateId) {
			this.stateId = stateId;
		}

		public Integer getStreetId() {
			return streetId;
		}

		public void setStreetId(Integer streetId) {
			this.streetId = streetId;
		}

		public String getSuggestion() {
			return suggestion;
		}

		public void setSuggestion(String suggestion) {
			this.suggestion = suggestion;
		}

		public String getSuggestionType() {
			return suggestionType;
		}

		public void setSuggestionType(String suggestionType) {
			this.suggestionType = suggestionType;
		}

		public Integer getTerritorialAuthorityId() {
			return territorialAuthorityId;
		}

		public void setTerritorialAuthorityId(Integer territorialAuthorityId) {
			this.territorialAuthorityId = territorialAuthorityId;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			Utils.appendOptional(sb, "Council Area Id: ", councilAreaId);
			Utils.appendOptional(sb, "Country Id: ", countryId);
			Utils.appendOptional(sb, "Body Corporate: ", isBodyCorporate);
			Utils.appendOptional(sb, "Unit: ", isUnit);
			Utils.appendOptional(sb, "Locality Id: ", localityId);
			Utils.appendOptional(sb, "Post Code Id: ", postcodeId);
			Utils.appendOptional(sb, "Property Id: ", propertyId);
			Utils.appendOptional(sb, "State Id: ", stateId);
			Utils.appendOptional(sb, "Street Id: ", streetId);
			Utils.appendOptional(sb, "Suggestion: ", suggestion);
			Utils.appendOptional(sb, "Suggestion Type: ", suggestionType);
			Utils.appendOptional(sb, "Territorial Authority Id: ", territorialAuthorityId);

			return sb.toString();
		}
	}

	public class SystemInfo {
		private String instanceName;
		private String requestDate;

		public String getInstanceName() {
			return instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getRequestDate() {
			return requestDate;
		}

		public void setRequestDate(String requestDate) {
			this.requestDate = requestDate;
		}

		@Override
		public String toString() {
			return String.format("Instance Name: %s, Request Date: %s", instanceName, requestDate);
		}
	}
}
