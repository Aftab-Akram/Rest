<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content=
"text/html; charset=ISO-8859-1">
<link rel="stylesheet"
href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Products</title>
</head>
<body>
<section>
<div class="jumbotron">
<a href="<c:url value="/j_spring_security_logout" />" class="btn btn-danger btn-mini pull-right">logout</a>
<div class="container">
<h1>Welcome Back</h1>
<p>Admin Panel</p>
</div>
</div>
</section>
<section>
<div class="container">
<div class="row">
<div class="col-md-4 col-md-offset-4">
<div class="panel panel-default">
<div class="panel-heading">
<h3 class="panel-title">Drop your File</h3>
</div>
<div class="panel-body">

<form action="<c:url value="/savefile"></c:url>" method="post"enctype="multipart/form-data">
<fieldset>
<div class="form-group">
 <input class="form-control" placeholder=
"Name of File" type="text" name="name">
<input class="form-control" placeholder=
"Upload" name='file' id="fileToUpload"  type="file">
</div>
<input class="btn btn-lg btn-success btn-block"
type="submit" value="Upload">
</fieldset>
</form>
</div>
</div>
</div>
</div>
</div>
</section>
</body>
</html>    
