<!DOCTYPE HTML>
<%@ page trimDirectiveWhitespaces="true" %>
<html>
	<head>
		<title>Core Logic RP Data Property Search Demo</title>
		<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
		<script type="text/javascript">
			$(document).ready(function() {
				$("#mainForm").submit(function(){
					setSuggestionTypes();
					setIncludes();
				});
			});
			
			function setSuggestionTypes() {
				var types = "";
				$(".suggestionTypes:checked").each(function(index, value){
					if (types != "") {
						types += ", " + value.id;					
					}
					else {
						types = value.id;
					}
				});
				
				$("#suggestionTypes").val(types);
			}
			
			function setIncludes() {
				$(".include").each(function(index, value) {
					if (value.is(":checked")) {
						$("#" + value.id).val();
					}
				});
			}
		</script>
	</head>
	<body>
		<H1>Core Logic RP Data Property Search Demo</H1>
		<form action="/property" method="get" id="mainForm">
			<table>
				<tr>
					<td>Query</td>
					<td><input type="text" name="query" value="2903" required/></td>
				</tr>
				<tr>
					<td>Types</td>
					<td>
						<input type="checkbox" class="suggestionTypes" id="address" checked>address</input>
						<input type="checkbox" class="suggestionTypes" id="street" checked>street</input>
						<input type="checkbox" class="suggestionTypes" id="locality" checked>locality</input>
						<input type="checkbox" class="suggestionTypes" id="postcode">postcode</input>
						<input type="checkbox" class="suggestionTypes" id="territorialAuthority">territorialAuthority</input>
						<input type="checkbox" class="suggestionTypes" id="councilArea">councilArea</input>
						<input type="checkbox" class="suggestionTypes" id="state">state</input>
						<input type="checkbox" class="suggestionTypes" id="country">country</input>
						<input type="hidden" name="suggestionTypes" id="suggestionTypes"/>
					</td>
				</tr>
				<tr>
					<td>Limit</td>
					<td><input type="number" name="limit" min="0" max="100"/></td>
				</tr>
				<tr>
					<td>Include Units</td>
					<td>
						<select name="includeUnits">
							<option value="true" default>true</option>
							<option value="false">false</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>Include Body Corporates</td>
					<td>
						<select name="includeBodyCorporates">
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
	</body>
</html>