<%--
  Created by IntelliJ IDEA.
  User: WQ-Y7000
  Date: 2019-10-24
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- JSTL 核心标签库 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- JSTL 格式化标签 用来格式化并输出文本、日期、时间、数字 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
    <title>Unit System</title>
</head>
<body>
    <h1>Unit System</h1>
    <div>
        ${unitSystem.id}
    </div>
    <div>
        ${unitSystem.name}
    </div>
</body>
</html>
