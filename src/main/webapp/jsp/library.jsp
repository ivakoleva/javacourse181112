<%@ page import="java.time.LocalTime" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Aykut Ismailov
  Date: 26.1.2019 г.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>

<?php

?>
<%
    String cssStyleClass = "sample-class";
    if(LocalTime.now().isBefore(LocalTime.NOON)) {
        cssStyleClass += " before-noon";
    }
%>

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
        <%--not empty is usable in context of collection; library could be null--%>
        <c:when test="${library != null}">

            <p align="center ${cssStyleClass}">${library.name}</p>
            <table>

                <tr>

                    <td>
                        Items
                    </td>
                    <c:forEach var="item" items="${library.items}">
                        <td>
                            <%--a whole java expression would be between ${ and }--%>
                                ${item.name} ${item.ISBN}
                        </td>
                    </c:forEach>

                </tr>

                <tr>

                    <td>
                        People
                    </td>

                    <c:forEach var="person" items="${library.people}">
                        <td>
                                ${person.role} ${person.name} ${person.id}
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
