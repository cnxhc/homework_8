<%@page import="com.xhc.model.Poetries"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
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
					<td style="width: 80px; text-align: center;">诗人名</td>
					<td style="width: 180px; text-align: center;">诗词名称</td>
					<td style="width: 500px; text-align: center;">诗词内容</td>
				</tr>
				<s:iterator value="#request.poetries" id="poetrie">
					<tr style="background: #f0f8ff">
						<td style="text-align: center;"><s:property
								value="#poetrie.poets.name" /></td>
						<td style="text-align: center;"><s:property
								value="#poetrie.title" /></td>
						<td style="text-align: center;"><s:property
								value="#poetrie.content" /></td>
						<input type="hidden" name="queryName"
							value="<s:property value="#poetrie.poets.name"/>">
					</tr>
				</s:iterator>
				<tr style="background: #f0f8ff;"><td colspan="3" style="text-align: center;">
					<s:set name="pager" value="#request.page"></s:set>
					<s:if test="#pager.hasFirst">
						<a href="queryByName.action?currentPage=1">首页</a>
					</s:if>
					<s:if test="#pager.hasPrevious">
						<a
							href="queryByName.action?currentPage=<s:property value="#pager.currentPage-1"/>">上一页</a>
					</s:if>
					<s:if test="#pager.hasNext">
						<a
							href="queryByName.action?currentPage=<s:property value="#pager.currentPage+1"/>">下一页</a>
					</s:if>
					<s:if test="#pager.hasLast">
						<a
							href="queryByName.action?currentPage=<s:property value="#pager.totalPage"/>">尾页</a>
					</s:if>
					当前第
					<s:property value="#pager.currentPage" />
					页，总共
					<s:property value="#pager.totalPage" />
					页</td>
				</tr>
			</table>
		</center>
	</div>
</body>
</html>