<%--
  Created by IntelliJ IDEA.
  User: rojee
  Date: 24-2-2022
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>VoegToe</title>
    <link href="style.css" rel="stylesheet" type="text/css"><script src="https://kit.fontawesome.com/eca43c78f4.js" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="apple-touch-icon" sizes="180x180" href="/apple-touch-icon.png">
    <link rel="icon" type="image/png" sizes="32x32" href="favicon/favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="16x16" href="favicon/favicon-16x16.png">
    <link rel="manifest" href="/site.webmanifest">
</head>
<body>
<div class="alles">
    <header>
        <nav class="main-menu">
            <span class="bar-hamburger"><i id="hamburger-icon" class="fas fa-bars"></i></span>
            <div id="logo"><img src="img/flower_icon.png" alt="navIcon"></div>
            <ul>
                <li><a href="home.html">Home</a></li>
                <li class="hier"><a href="voegtoe.html">Voeg Toe</a></li>
                <li><a href="overzicht.html">Overzicht</a></li>

            </ul>
        </nav>
    </header>

    <div class="kiekBloem">
        <h1>Voeg je bloem toe</h1>
        <form action="">
            <label for="fname">Naam:</label>
            <input type="text" id="fname" name="fname">

            <label for="fcolor">Kleur:</label>
            <input type="text" id="fcolor" name="fcolor">

            <label for="flower">Aantal</label>
            <select name="flower" id="flower">
                <option value=1>1</option>
                <option value=2>2</option>
                <option value=3>3</option>
                <option value=4>4</option>
                <option value=1>5</option>
                <option value=2>6</option>
                <option value=3>7</option>
                <option value=4>8</option>
                <option value=1>9</option>
                <option value=2>10</option>
            </select>
            <br><br>
            <input type="submit" value="Submit">
        </form>



    </div>

    <footer>
        <p>BlomenWinkel &copy;</p>
        <div class="socialMedia">
            <p id="followparagraaf">Volg ons</p>
            <a href="https://www.facebook.com/facebookapp" class="socialMedia"><i class="fab fa-facebook-square"></i></a>
            <a href="https://www.instagram.com/" class="socialMedia"><i class="fab fa-instagram"></i></a>
            <a href="https://twitter.com/" class="socialMedia"><i class="fab fa-twitter"></i></a>
            <a href="https://www.snapchat.com/l/nl-nl/" class="socialMedia"><i class="fab fa-snapchat-ghost"></i></a>
        </div>
    </footer>

    <script>
        $(document).ready(function() {
            $('#hamburger-icon').click(function () {
                $(".main-menu ul").stop();
                $(".main-menu ul").slideToggle();
                $('#hamburger-icon').toggleClass("fa-times");
                $('#hamburger-icon').toggleClass("fa-bars");
            });
        });
    </script>
</div>
</body>
</html>
