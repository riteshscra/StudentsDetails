<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student info</title>
<style>
.box{
background-color:silver;
margin-left: 300px;
margin-right: 300px;
top: 50%;
left: 50%;
vertical-align: middle
height:500px;
width:600px;
}
img{
height:100px;
width:100px;
margin-left:250px;
margin-right:250px;
}
.sub{
height:40px;
width:300px;
top: 50%;
left: 50%;
border-radius:30px;
margin-left:150px;
margin-right:150px;
color:white;
background-color:#800000;
}
.txt{
border:none;
border-bottom-style:solid;
border-bottom-width:1px;
width:500px;
height:50px;
border-color:white;
background-color:silver;
color:gray;
}
h1
{
text-align:center;
color:#800000;
}
p{
color:#800000;
}
</style>
</head>
<body>
<div class="box">
<img src="https://th.bing.com/th/id/OIP.d_Y_F1y6WwA0J1SHZvrXBQHaHa?pid=Api&rs=1">
<div class="stuform">
<form action="addDetails">
<h1>STUDENT INFORMATION</h1>
<hr>
<p>Roll Number</p>
<input type="text" name="Roll_number" placeholder="Enter Roll No"class="txt">
<p>Name</p>
<input type="text" name="Name" placeholder="Enter Name"class="txt">
<p>Branch</p>
<input type="text" name="Branch" placeholder="Enter Branch"class="txt">
<p>Grade</p>
<input type="text" name="Grade" placeholder="Enter Grade"class="txt"><br>
<br>
<input type="submit" value="submit" class="sub">
<br>
<br>
</form>
<form action="getDetails" method="post">
<p>Roll Number</p>
<input type="text" name="Roll_number" placeholder="Enter Roll No"class="txt">
<input type="submit" value="Search Student" class="sub">
</form>
</div>
</div>
</body>
</html>