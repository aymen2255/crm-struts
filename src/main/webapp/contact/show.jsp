<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1px" cellpadding="8px">
		<tr>
			<th>ID</th>
			<th>nom</th>
			<th>prenom</th>
			<th>mail</th>
			<th>tel fixe</th>
			<th>tel mobile</th>
			<th>echanges</th>

		</tr>
	
			<tr>
				<td><s:property value="contact.id" /></td>
				<td><s:property value="contact.nom" /></td>
				<td><s:property value="prenom" /></td>
				<td><s:property value="mail" /></td>
				<td><s:property value="telFixe" /></td>
				<td><s:property value="telMobile" /></td>
			
			</tr>
		
	</table>
</body>
</html>