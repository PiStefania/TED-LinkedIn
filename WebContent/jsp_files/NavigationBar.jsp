<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css_files/navbar.css" type="text/css">
		
		<!-- Add icon library -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<title>Navigation Bar</title>
	</head>
	<body>
		<div class="icon-bar">
  			<a class="home" href="${pageContext.request.contextPath}/jsp_files/home.jsp">
	  			<div class="item">
	  				<i class="glyphicon glyphicon-home"></i>
	  				<p class="caption">Αρχική Σελίδα</p>
	  			</div>
  			</a>
			<a class="network" href="${pageContext.request.contextPath}/jsp_files/network.jsp">
				<div class="item">
	  				<i class="glyphicon glyphicon-globe"></i>
	  				<p class="caption">Δίκτυο</p>
		  		</div>
	  		</a> 
			<a class="jobs" href="${pageContext.request.contextPath}/jsp_files/jobs.jsp">
				<div class="item">
	  				<i class="glyphicon glyphicon-briefcase"></i>
	  				<p class="caption">Αγγελίες</p>
		  		</div>
	  		</a>
			<a class="messaging" href="${pageContext.request.contextPath}/jsp_files/Messaging.jsp">
				<div class="item">
	  				<i class="glyphicon glyphicon-envelope"></i>
	  				<p class="caption">Συζητήσεις</p>
		  		</div>
	  		</a>
			<a class="notifications" href="${pageContext.request.contextPath}/jsp_files/notifications.jsp">
				<div class="item">
	  				<i class="glyphicon glyphicon-bell"></i>
	  				<p class="caption">Ειδοποιήσεις</p>
		  		</div>
	  		</a> 
			<a class="profile" href="${pageContext.request.contextPath}/jsp_files/profile.jsp">
				<div class="item">
	  				<i class="glyphicon glyphicon-user"></i>
	  				<p class="caption">Προσωπικά Στοιχεία</p>
		  		</div>
	  		</a> 
			<a class="settings" href="${pageContext.request.contextPath}/jsp_files/Settings.jsp">
				<div class="item">
	  				<i class="glyphicon glyphicon-cog"></i>
	  				<p class="caption">Ρυθμίσεις</p>
		  		</div>
	  		</a>
	  		<a class="logout" onclick="document.getElementById('logoutFrom').submit()">
		  		<div class="item">
	  				<i class="glyphicon glyphicon-log-out"></i>
	  				<p class="caption">Αποσύνδεση</p>
			  	</div>
		  	</a>
	  		<form id="logoutFrom" action="${pageContext.request.contextPath}/Logout" method="post">	
		  	</form>
		</div>
	</body>
</html>