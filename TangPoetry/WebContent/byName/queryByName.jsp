<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>通过诗人名搜索</title>
</head>
<link rel="stylesheet" type="text/css" href="../css/style.css" />
<body>
	<div class="search">
		<form action="queryByName" method="post">
			<input type="text" name="queryName" id="s_text" > 
			<input type="submit" value="搜索一下" id="s_sub">
		</form>
	</div>
</body>
</html>