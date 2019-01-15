<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Company Portal</title>
</head>
<body id="IndexPage">
<h2>What Is Your Role? </h2>

<br><br>
<center>
<div class="row">
    <div class="col-sm-8 text-center">
        <a href="Login"><button id="btnSearch" class="btn btn-success btn-md center-block" Style="width: 150px;" OnClick="btnSearch_Click" >Employee</button></a>
          <a href="New"><button id="btnClear" class="btn btn-primary btn-md center-block" Style="width: 150px;" OnClick="btnClear_Click" >Admin</button></a>
     </div>
</div>
</center>

</body>

<style>
body#IndexPage{ background-image:url("https://wallpaper-house.com/data/out/7/wallpaper2you_202157.jpg");background-repeat:no-repeat; background-position:center; background-size:cover;background-repeat:no-repeat; background-position:center; background-size:cover; background-attachment: fixed; margin-left: 175px;}
#btnSearch,
#btnClear{
    display: inline-block;
    vertical-align: top;
}
</style>
</html>