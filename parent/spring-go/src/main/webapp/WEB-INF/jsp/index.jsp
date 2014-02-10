<%@ include file="common.jsp"%>
<html>
<body>
	<h2>
		Hello World!,${user}</br>
		<c:forEach items="${list}" var="s">
			<c:out value="${s}"></c:out>
		</c:forEach>
	</h2>
</body>
</html>
