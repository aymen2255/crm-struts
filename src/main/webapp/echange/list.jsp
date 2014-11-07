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
			<th>date</th>
			<th>commentaire</th>
			

		</tr>
		<s:iterator value="echanges">
			<tr>
				<td><s:property value="id" /></td>
				<td><s:property value="date" /></td>
				<td><s:property value="commentaire" /></td>
			
			</tr>
		</s:iterator>
	</table>
	
	<s:url  action="initaddAction" var ="initaddAction">
				<s:param name="contact.id">
				<s:property value ="%{echange.contact.id}"/>
				</s:param>
				</s:url>
				
				<a href="${initaddAction}">add echange</a>
</body>
</html>