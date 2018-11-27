<html>
<head>
    <title>spring boot form submit example</title>
</head>
<body>
<h2>Employee Details</h2>
<form method="post" action="saveDetails" enctype="multipart/form-data">
    Enter Employee Name : <input type="text" name="employeeName"/>
    <br>
    Enter Employee Email Address: <input type="email" name="employeeEmail">
    <br>
    Cargar archivo:  <input type="file" name="employeeFile" />
    <br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
