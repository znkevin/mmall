<html>
<body>
<h2>Hello World!</h2>
<%--enctype="multipart/form-data"--%>
<form action="${pageContext.request.contextPath}/update/he.do" method="post" >
    <input type = "text"  name = "username" /><br>
    file<input type="file"     name = "password" /><br>
    <input type = "submit" value = "submit">
</form>
springmvc上传文件
<form name="form1" action="/manage/product/upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file" />
    <input type="submit" value="springmvc上传文件" />
</form>
</body>
</html>
