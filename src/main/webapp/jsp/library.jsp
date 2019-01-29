<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>
        Library
    </title>
</head>

<body>

<div>
    <h2>
        Library
    </h2>
    <c:choose>
        <c:when test="${library != null}">

            <p align="center ${cssStyleClass}">${library.name}</p>
            <table>
                <tr>
                    <td>
                        Items
                    </td>
                    <c:forEach var="item" items="${library.itemList}">
                        <td>
                                ${item.name} ${item.isbn} ${item.id}
                                <br>
                        </td>
                    </c:forEach>
                </tr>
                <tr>
                    <td>
                        People
                    </td>
                    <c:forEach var="person" items="${library.personList}">
                        <td>
                                ${person.name} ${person.egn}
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