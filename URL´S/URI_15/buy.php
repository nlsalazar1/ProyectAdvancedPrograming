<?php
    $name = $_GET['nameSaucer'];
    $qual = $_GET['qualification'];
    $data = json_decode(file_get_contents("http://localhost:8080/CyberRestaurant/operation/buy/SAUCER/$name/$qual"), true);
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
            if($data['idPurchase'] == ""){
                echo('<h1> User not found</h1>');
            }
            else{
                echo("<p> COST: {$data['costPurchase']}</p>");       
                echo("<p> ID: {$data['idPurchase']}</p>"); 
                echo("<p> SAUCER: {$data['namePurchase']}</p>"); 
                echo("<p> QUALIFICATION: {$data['qualificationPurchase']}</p>");
                echo("<p> TIKET: {$data['tiket']}</p>");  
            }
         
         ?>
        </div>        
    </body>
</html>
