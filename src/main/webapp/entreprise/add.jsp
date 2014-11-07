<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        
        <s:actionerror/>
        
        <s:form action="addAction" >
        <s:hidden name="entreprise.id"/>
            <s:textfield name="entreprise.raisonSociale" label="raison Sociale"  />
            <s:textfield name="entreprise.adresse" label="adresse"  />
            <s:textfield name="entreprise.secteurActivite" label="secteur Activite" />
            
            <s:submit />
        </s:form>

       
        
    </body>
</html>
