<?php
    $url = "http://localhost:8085/Servigruas/service/login/";
    $name = $_POST['name'];
    $password = $_POST['password'];
    $data =array('name' => $name, 'password'=>$password);    
    $cli=curl_init($url);
    curl_setopt($cli, CURLOPT_HTTPHEADER, array('Content-Type: application/json'));
    curl_setopt($cli, CURLOPT_POST,true);
    curl_setopt($cli, CURLOPT_POSTFIELDS,json_encode($data));
    curl_setopt($cli, CURLOPT_RETURNTRANSFER, true);
    $respone = curl_exec($cli);
    curl_close($cli);
?>


<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="windows-1254">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">        
    </head>
    <body>
        <div class="container my-3">
         <?php 
            if(strcmp($respone,"true")==0){
                echo('<h1> User confirm</h1>');
            }
            else{
                echo("<h1>User not found</p>");                  
            }
         ?>
        </div>        
    </body>
</html>