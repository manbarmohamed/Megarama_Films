<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 03/05/2024
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .container {
            max-width: 400px;
            margin: 50px auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .container h2 {
            margin-bottom: 20px;
            text-align: center;
        }

        .form-group {
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-bottom: 5px;
        }

        input[type="text"],
        input[type="email"],
        textarea {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }

        button {
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }

        button:hover {
            background-color: #0056b3;
        }

    </style>
</head>
<body>
<div class="container">
    <h2>Simple Form</h2>
    <form action="fav" method="post">

            <input type="number" id="id_film" name="id_film" required>

            <input type="number" id="id_user" name="id_user" required>

            <input id="favoriteTitle" name="favoriteTitle" required></input>

            <input type="text" id="favoriteCategory" name="favoriteCategory" required>

            <input id="favoriteImage" name="favoriteImage" required></input>
        <button type="submit">Submit</button>
    </form>
</div>


</body>
</html>
