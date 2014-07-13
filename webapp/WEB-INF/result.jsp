<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<fmt:bundle basename="i18n.messages" prefix="index.">
    <html>
    <head>
        <title></title>
    </head>
    <body>

    <div>
${text}
        <form action="${pageContext.request.contextPath}/" method="get">
            <input type="submit" value="<fmt:message key="input.return"/>"/> <br/><br/>
        </form>
        <p><fmt:message key="output.text"/></p>
        <c:out value="${text}"/>
        <br>

        <p><fmt:message key="paragraphs"/></p>
        <c:forEach var="sent" items="${paragraph}" varStatus="loop">
            <br> ${loop.index}. <c:out value="${sent}"/><br>
        </c:forEach>

        <br>

        <p><fmt:message key="sentences"/></p>
        <c:forEach var="sent" items="${sentence}" varStatus="loop">
            <br>${loop.index}. <c:out value="${sent}"/><br>
        </c:forEach>

        <br>


    </div>

    </body>
    </html>
</fmt:bundle>