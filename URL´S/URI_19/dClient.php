<?php
    $name = $_GET['name'];
    $data = json_decode(file_get_contents("http://localhost:8080/CyberRestaurant/operation/delete/CLIENT/$name"), true);
?>

<!DOCTYPE html>
<html>
    <head>
        <title>MENU PHP</title>
        <meta charset="windows-1254">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">        
    </head>
    <body>
        <div class="container my-3">
         <h1>Information</h1>
         <?php 
            echo("<h1>- -- :: CLIENT DELETE :: -- -</h1><br>");
            echo("<p><b> LASTNAME:</b> $name</p>");
         ?>
        </div>        
    </body>
</html>
