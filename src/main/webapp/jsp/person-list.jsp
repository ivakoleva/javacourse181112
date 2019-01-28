<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Person list page</title>
</head>

<body>
<div>
    Hello, ${user}!
    <h2>Persons</h2>

    <!--Person List-->
    <c:choose>
        <c:when test="${not empty personList}">
            <table>
                <thead>
                <tr>
                    <td>#</td>
                    <td>Name</td>
                    <td>Family</td>
                    <td>Date of birth</td>
                </tr>
                </thead>
                <c:forEach var="person" items="${personList}" varStatus="status">
                    <%--<c:set var="testVar" value="false"/>
                    <c:if test="${true}">
                        <c:set var="testVar" value="true"/>
                    </c:if>--%>
                    <tr>
                        <td>${status.index}</td>
                        <td>${person.name}</td>
                        <td>${person.family}</td>
                        <td>${person.dateOfBirth}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <br>
            <div>
                No people found
            </div>
        </c:otherwise>
    </c:choose>

</div>
</body>
</html>