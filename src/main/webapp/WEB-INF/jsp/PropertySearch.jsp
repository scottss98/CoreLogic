<!DOCTYPE HTML>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>Core Logic RP Data Property Search Demo</title>
		<style>
			.tableWithBorder {
				border-collapse: collapse;
			}
		</style>
		<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
		<script type="text/javascript">
			$(document).ready(function() {
				preFillFrom();
				
				$("#mainForm").submit(function(){
					setSuggestionTypes();
				});
			});
			
			function preFillFrom() {
				// Pre fill the form with details from the model if present
				var includeUnits = "${includeUnits}";
				var includeBodyCorporates = "${includeBodyCorporates}";
				var suggestionTypes = "${suggestionTypes}";
				
				<c:if test="${not empty query}">
					// Prevent JavaScript injection by using c:out which will uuencode the value
					$("#query").val("<c:out value='${query}'/>");
				</c:if>
				
				if ((includeUnits == "true") || (includeUnits == "false")) {
					$("#includeUnits").val(includeUnits);
				}
				
				if ((includeBodyCorporates == "true") || (includeBodyCorporates == "false")) {
					$("#includeBodyCorporates").val(includeBodyCorporates);
				}
				
				// Comma seperated list with the IDs of the checkboxes
				var suggestionTypesArray = suggestionTypes.split(/\s*,\s*/);
				if (suggestionTypes != "") {
					for (suggestion in suggestionTypesArray) {
						$("#" + suggestionTypesArray[suggestion]).attr("checked", true);
					}
				}
				else {
					// Not set, so use defaults
					$("#address, #street, #locality").attr("checked", true);
				}
			}
			
			function setSuggestionTypes() {
				// Create a comma seperated list of the ids of the suggestion type checkboxes
				var types = "";
				$(".suggestionTypes:checked").each(function(index, value){
					if (types != "") {
						types += "," + value.id;					
					}
					else {
						types = value.id;
					}
				});
				
				// Store the comma seperated list in the hidden input
				$("#suggestionTypes").val(types);
			}
		</script>
	</head>
	<body>
		<H1>Core Logic RP Data Property Search Demo</H1>
		<form action="/propertySearch" method="post" id="mainForm">
			<table>
				<tr>
					<td>Query</td>
					<td><input type="text" name="query" id="query" placeholder="2903" required/></td>
				</tr>
				<tr>
					<td>Types</td>
					<td>
						<input type="checkbox" class="suggestionTypes" id="address">Address
						<input type="checkbox" class="suggestionTypes" id="street">Street
						<input type="checkbox" class="suggestionTypes" id="locality">Locality
						<input type="checkbox" class="suggestionTypes" id="postcode">Post Code
						<input type="checkbox" class="suggestionTypes" id="territorialAuthority">Territorial Authority
						<input type="checkbox" class="suggestionTypes" id="councilArea">Council Area
						<input type="checkbox" class="suggestionTypes" id="state">State
						<input type="checkbox" class="suggestionTypes" id="country">Country
						<input type="hidden" name="suggestionTypes" id="suggestionTypes"/>
					</td>
				</tr>
				<tr>
					<td>Limit</td>
					<td><input type="number" name="limit" min="0" max="100" value="${limit}"/></td>
				</tr>
				<tr>
					<td>Include Units</td>
					<td>
						<select name="includeUnits" id="includeUnits">
							<option value="true" default>true</option>
							<option value="false">false</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>Include Body Corporates</td>
					<td>
						<select name="includeBodyCorporates" id="includeBodyCorporates">
							<option value="true" default>true</option>
							<option value="false">false</option>
						</select>
					</td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit"/></td>
				</tr>
			</table>
		</form>
		
		<datalist id="trueFalseList">
			<option value="true">
			<option value="false">
		</datalist>
		
		<c:set var="suggestions" value="${suggestionResponse.suggestions}"/>
		<c:if test="${!empty suggestions}">
		<hr>

		<table border="1" class="tableWithBorder">
			<tr>
				<th>Council Area Id</th>
				<th>Country Id</th>
				<th>Body Corporate?</th>
				<th>Unit?</th>
				<th>Locality Id</th>
				<th>Post Code Id</th>
				<th>Property Id</th>
				<th>State Id</th>
				<th>Street Id</th>
				<th>Suggestion</th>
				<th>Suggestion Type</th>
				<th>Territorial Authority Id</th>
			</tr>		
			<c:forEach items="${suggestions}" var="suggestion">
				<tr>
					<td>${suggestion.councilAreaId}</td>
					<td>${suggestion.countryId}</td>
					<td>${suggestion.isBodyCorporate}</td>
					<td>${suggestion.isUnit}</td>
					<td>${suggestion.localityId}</td>
					<td>${suggestion.postcodeId}</td>
					<td><a href="/property?id=${suggestion.propertyId}">${suggestion.propertyId}</a></td>
					<td>${suggestion.stateId}</td>
					<td>${suggestion.streetId}</td>
					<td>${suggestion.suggestion}</td>
					<td>${suggestion.suggestionType}</td>
					<td>${suggestion.territorialAuthorityId}</td>
				</tr>
			</c:forEach>
		</table>
		</c:if>
	</body>
</html>