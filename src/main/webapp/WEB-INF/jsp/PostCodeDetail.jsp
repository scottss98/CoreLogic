<!DOCTYPE HTML>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>Core Logic RP Data Post Code Detail</title>
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
		<H1>Core Logic RP Data Post Code Detail</H1>

		<table border="1">
			<tr>
				<th rowspan="2">Property Id</th>
				<th rowspan="2">Photo</th>
				<th rowspan="2">Address</th>
				<th colspan="5">Attributes</th>
				<th colspan="3">Coordinates</th>
				<th colspan="3">Status</th>
				<th rowspan="2">Type</th>
				<th rowspan="2">Sub Type</th>
				<th rowspan="2">Sub Type Short</th>
			</tr>
			<tr>
				<th>Bathrooms</th>
				<th>Bedrooms</th>
				<th>Car Spaces</th>
				<th>Land Area</th>
				<th>Lock Up Garages</th>
				<th>Latitude</th>
				<th>Longitude</th>
				<th>Google Maps</th>
				<th>For Rent</th>
				<th>For Sale</th>
				<th>Recent Sale</th>
			</tr>
			<c:forEach items="${postCodeDetails.embedded.propertySummaryList}" var="propertySummary">
				<tr>
					<td><a href="/property?id=${propertySummary.propertySummary.id}">${propertySummary.propertySummary.id}</a></td>
					<td>
						<a href="${propertySummary.propertySummary.propertyPhoto.largePhotoUrl}">
							<img src="${propertySummary.propertySummary.propertyPhoto.thumbnailPhotoUrl}">
						</a>
					</td>
					<td>${propertySummary.propertySummary.address.singleLineAddress}</td>
					<td>${propertySummary.propertySummary.attributes.bathrooms}</td>
					<td>${propertySummary.propertySummary.attributes.bedrooms}</td>
					<td>${propertySummary.propertySummary.attributes.carSpaces}</td>
					<td>${propertySummary.propertySummary.attributes.landArea}</td>
					<td>${propertySummary.propertySummary.attributes.lockUpGarages}</td>
					<td>${propertySummary.propertySummary.coordinate.latitude}</td>
					<td>${propertySummary.propertySummary.coordinate.longitude}</td>
					<td><a href="http://maps.google.com/?q=${propertySummary.propertySummary.coordinate.latitude},${propertySummary.propertySummary.coordinate.longitude}">Map</a></td>
					<td>${propertySummary.propertySummary.propertyStatus.otmForRent}</td>
					<td>${propertySummary.propertySummary.propertyStatus.otmForSale}</td>
					<td>${propertySummary.propertySummary.propertyStatus.recentSale}</td>
					<td>${propertySummary.propertySummary.propertyType}</td>
					<td>${propertySummary.propertySummary.propertySubType}</td>
					<td>${propertySummary.propertySummary.propertySubTypeShort}</td>
				</tr>
			</c:forEach>
		</table>

	</body>
</html>