<?php
    $name = $_GET['name'];
    $data = json_decode(file_get_contents("http://localhost:8080/CyberRestaurant/operation/search/USER/$name"), true);
?>

<!DOCTYPE html>
<html>
    <head>
        <title>BUY PHP</title>
        <meta charset="windows-1254">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">        
    </head>
    <body>
        <div class="container my-3">
         <h3>Information</h3>
         <?php 
            if($data['username'] === ""){
                echo('<h1> User not found</h1>');
            }
            else{
                echo("<p> USER: {$data['username']}</p>"); 
                echo("<p> PASS: {$data['password']}</p>");       
                echo("<p> TYPE: {$data['type']}</p>"); 
            }
         
         ?>
        </div>        
    </body>
</html>
