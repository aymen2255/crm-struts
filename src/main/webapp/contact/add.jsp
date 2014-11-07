<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>


	<s:actionerror />

	<s:form action="addAction">
		<s:hidden name="contact.id" />
		<s:textfield name="contact.nom" label="nom" />
		<s:textfield name="contact.prenom" label="prenom" />
		<s:textfield name="contact.mail" label="mail" />
		<s:textfield name="contact.telFixe" label="telFixe" />
		<s:textfield name="contact.telMobile" label="telMobile" />
		<s:select name="contact.entreprise.id" list="entreprises"
			listValue="raisonSociale" listKey="id">
		</s:select>

		<s:submit />
	</s:form>



</body>
</html>
