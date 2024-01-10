<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<body>
	 	
		<div>
			<form:form method="POST" action="/Hibernate_05/worker/" modelAttribute="work" enctype="multipart/form-data">
				<table>
        			<tr>
        				<td>Name</td>
        				<td><form:input type="text" path="name"></form:input></td>
        			</tr>
        			<tr>
        				<td> count</td>
        				<td><form:input type="text" path="count"></form:input> </td>
        			</tr>
        			<tr>
        				<td colspan=2><input type="submit" value="Save"> </td>
        			</tr>
        		</table>
			</form:form>
		</div>
	</body>
</html>