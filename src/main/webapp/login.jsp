<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>

<style>

body{
    margin:0;
    padding:0;
    font-family: Arial, sans-serif;
    background: #dff6ff;
}

.container{
    width:400px;
    margin:100px auto;
    background:#ffffff;
    padding:30px;
    border-radius:15px;
    box-shadow:0 0 20px rgba(0, 119, 182, 0.2);
    border:2px solid #90e0ef;
}

h2{
    text-align:center;
    color:#0077b6;
    margin-bottom:25px;
}

label{
    color:#023e8a;
    font-weight:bold;
}

input[type=text],
input[type=password]{
    width:100%;
    padding:12px;
    margin-top:5px;
    margin-bottom:15px;
    border:1px solid #90e0ef;
    border-radius:8px;
    box-sizing:border-box;
}

input[type=text]:focus,
input[type=password]:focus{
    outline:none;
    border-color:#00b4d8;
}

input[type=submit]{
    width:100%;
    padding:12px;
    background:#00b4d8;
    color:white;
    border:none;
    border-radius:8px;
    cursor:pointer;
    font-size:16px;
    font-weight:bold;
}

input[type=submit]:hover{
    background:#0096c7;
}

.credentials{
    margin-top:20px;
    background:#caf0f8;
    padding:15px;
    border-radius:10px;
    border-left:5px solid #00b4d8;
}

.credentials h4{
    margin-top:0;
    color:#0077b6;
}

.footer{
    text-align:center;
    margin-top:15px;
    color:#0077b6;
    font-size:14px;
}

</style>

</head>

<body>

<div class="container">

    <h2>Employee Management System</h2>

    <form action="login" method="post">

        <label>Username</label>

        <input type="text"
               name="username"
               placeholder="Enter Username"
               required>

        <label>Password</label>

        <input type="password"
               name="password"
               placeholder="Enter Password"
               required>

        <input type="submit" value="Login">

    </form>

    <div class="credentials">

        <h4>Demo Login Credentials</h4>

        <b>Username:</b> admin <br>
        <b>Password:</b> admin123

    </div>

    <div class="footer">
        Employee Management System Project
    </div>

</div>

</body>
</html>