<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Aykut Ismailov
  Date: 26.1.2019 г.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>

<head>

    <title>
        Library inventory and clients list page
    </title>

</head>

<body>

<div>
    <h2>
        Library
    </h2>
    <c:choose>
        <c:when test="${not empty library}">

            <p align="center">${library.name}</p>
            <table>

                <tr>

                    <td>
                        Items
                    </td>
                    <c:forEach var="item" items="${library.items}">
                        <td>
                                ${item.name}+" "+${item.isbn}
                        </td>
                    </c:forEach>

                </tr>

                <tr>

                    <td>
                        People
                    </td>

                    <c:forEach var="person" items="${library.people}">
                        <td>
                                ${person.role}+" "+${person.name}+" "+${person.id}
                        </td>
                    </c:forEach>

                </tr>

            </table>

        </c:when>
        <c:otherwise>

            <div>
                No library found
            </div>

        </c:otherwise>
    </c:choose>

</div>
</body>

</html>
