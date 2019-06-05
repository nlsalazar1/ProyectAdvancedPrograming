<?php
    $name = $_GET['name'];
    $pass = $_GET['pass'];
    $data = json_decode(file_get_contents("http://localhost:8080/CyberRestaurant/operation/search/USER/$name/$pass"), true);
?>

<!DOCTYPE html>
<html>
    <head>
        <title>LOGIN PHP</title>
        <meta charset="windows-1254">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">        
    </head>
    <body>
        <div class="container my-3">
         <h1>Information</h1>
         <?php 
            if($data['username'] === ""){
                echo('<h1> User not found</h1>');
            }
            else{
                echo("<h1>- -- :: WELCOME :: -- -</h1><br>");

                echo("<p> USER: {$data['username']}</p>"); 
                echo("<p> PASS: {$data['password']}</p>");       
                echo("<p> TYPE: {$data['type']}</p>"); 
            }
         
         ?>
        </div>        
    </body>
</html>
