<%@page import="com.xhc.model.Poetries"%>
<%@page import="com.xhc.model.Poets"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示诗词信息</title>
<link rel="stylesheet" type="text/css" href="../css/display.css" />
</head>
<body>
	<div class="context">
		<center>
			<table>
				<tr style="background: #ccccca">
					<td style="width: 180px; text-align: center;">诗人名</td>
					<td style="width: 500px; text-align: center;">诗词名称</td>
					<td style="width: 500px; text-align: center;">诗词内容</td>
				</tr>
				<s:iterator value="#request.poetries" id="poetrie">
					<tr style="background:#f0f8ff">
						<td style="text-align: center;"><s:property value="#poetrie.poets.name"/></td>
						<td style="text-align: center;"><s:property value="#poetrie.title"/></td>
						<td style="text-align: center;"><s:property value="#poetrie.content"/></td>
					</tr>
				</s:iterator>
			</table>
		</center>
	</div>
</body>
</html>