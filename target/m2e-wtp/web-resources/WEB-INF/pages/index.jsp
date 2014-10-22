<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app>
	<head>
		<title>Hello AngularJS</title>
		<script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.1/jquery.min.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
		<script>
    	function Hello($scope, $http) {
		    $http.get('http://localhost:8080/service/getdriverdetails').
		        success(function(data) {
		            $scope.driver = data;
		        });
		}
    	</script>
	</head>

	<body>
		<div ng-controller="Hello">
			<p>The Driver First Name is {{driver.driverFirstName}}</p>
			<p>The Driver Last Name is {{driver.driverLastName}}</p>
		</div>
	</body>
</html>