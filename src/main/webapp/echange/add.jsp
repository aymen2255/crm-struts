<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
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
			

		</tr>
		
			<tr>
				<td><s:property value="contact.id" /></td>
				<td><s:property value="contact.nom" /></td>
				<td><s:property value="contact.prenom" /></td>
				<td><s:property value="contact.mail" /></td>
				<td><s:property value="contact.telFixe" /></td>
				<td><s:property value="contact.telMobile" /></td>

			</tr>
		
	</table>



	<s:form action="addAction">
 
		<s:hidden name="echange.contact.id" />
		
		<s:textfield name="echange.commentaire" label="commentaire" />
		
		
<%-- 		<s:textfield name="%{echange.date}" label="Date" /> --%>
		


		<s:submit />
	</s:form>



</body>
</html>
