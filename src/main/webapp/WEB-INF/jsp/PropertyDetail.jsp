<!DOCTYPE HTML>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>Core Logic RP Data Property Detail</title>
		<style>
			table {
				border-collapse: collapse;
			}
		</style>
		<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
		<script type="text/javascript">
			$(document).ready(function() {
			});
		</script>
	</head>
	<body>
		<H1>Core Logic RP Data Property Detail</H1>

		<table border="1">
			<tr>
				<th rowspan="2">Property Id</th>
				<th rowspan="2">Occupancy Type</th>
				<th rowspan="2">Property Type</th>
				<th rowspan="2">Property Sub Type</th>
				<th rowspan="2">Property Sub Type Short</th>
				<th rowspan="2">Building Complex Name</th>
				<th colspan="10">Address</th>
			</tr>
			<tr>
				<!-- Address -->
				<th>Council Area</th>
				<th>Start Alpha</th>
				<th>End Alpha</th>
				<th>Start Number</th>
				<th>End Number</th>
				<th>Derived Unit?</th>
				<th>Single Line</th>
				<th>Street</th>
				<th>Unit Alpha</th>
				<th>Unit Number</th>
			</tr>
			<tr>
				<td>${propertyId}</td>
				<td>${property.occupancyType}</td>
				<td>${property.propertyType}</td>
				<td>${property.propertySubType}</td>
				<td>${property.propertySubTypeShort}</td>
				
				<!-- Address -->
				<td>${property.address.buildingComplexName}</td>
				<td>${property.address.councilArea}</td>
				<td>${property.address.startAlpha}</td>
				<td>${property.address.endAlpha}</td>
				<td>${property.address.startNumber}</td>
				<td>${property.address.endNumber}</td>
				<td>${property.address.isDerivedUnit}</td>
				<td>${property.address.singleLine}</td>
				<td>${property.address.street}</td>
				<td>${property.address.unitAlpha}</td>
				<td>${property.address.unitNumber}</td>
			</tr>
		</table>
	</body>
</html>