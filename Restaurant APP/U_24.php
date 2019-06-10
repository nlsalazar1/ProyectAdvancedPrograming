<?php
    $data = json_decode(file_get_contents("http://localhost:8080/CyberRestaurant/operation/search/MENUS"),true);
?>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Menu PHP</title>

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        

        <!-- Custom fonts for this template -->
        <link href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/business-casual.min.css" rel="stylesheet">
    </head>
    <body>

        <h1 class="site-heading text-center text-white d-none d-lg-block">
        <span class="site-heading-upper text-primary mb-3">CYBER RESTAURANT</span>
        <MARQUEE class="site-heading-lower" style="background:rgba(37, 21, 2, 0.9)">    
            <FONT SIZE=8>
            <b>LIST MENU</b>
            </font>
            </MARQUEE>
        </h1>
        <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-dark py-lg-4" id="mainNav">
            <div class="container">
                <a class="navbar-brand text-uppercase text-expanded font-weight-bold d-lg-none" href="#">MENU</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" 
                aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav mx-auto">
                    <li class="nav-item px-lg-4">
                    <a class="nav-link text-uppercase text-expanded" href="index.html">HOME
                        <span class="sr-only">(current)</span>
                    </a>
                    </li>
                    <li class="nav-item px-lg-4">
                    <a class="nav-link text-uppercase text-expanded" href="menu.html">menu</a>
                    </li>
                </ul>
                </div>
            </div>
        </nav>

    <form class="container cta">

      <div class="container">
        <div class="row">
          <div class="col-xl-9 mx-auto">
            <div class="cta-inner text-center rounded">
              <h2 class="section-heading mb-5">
                <span class="section-heading-upper"> - -- --- H --- -- -</span>
                <span class="section-heading-lower">
                  <b>MENUS</b>
                </span>
              </h2>
                <ul class="list-unstyled list-hours mb-5 text-left mx-auto">
                    <li class="list-unstyled-item list-hours-item d-flex">
                    <?php echo("");?>
                    <span class="ml-auto">
                        <?php echo(""); ?>
                    </span>
                    </li>
                    
                    <?php
                    foreach ($data as $d){
                        echo("<p> <b>ID:</b> {$d['idMenu']} </p>"); 
                        echo("<p> <b>NAME:</b> {$d['nameMenu']} </p><br><br>");               
                    }
                    ?>
                </ul>
            </div>
          </div>
        </div>
      </div>
    </form>

    <footer class="footer text-faded text-center py-5"> 
        <div class="container">

            <button align="center" onclick="location.href='./index.html'" style="background:rgba(27, 15, 1, 0.9)" 
            class="btn btn-primary" name="cl" id="cl">
            HOME
            </button>
            <button align="center" onclick="location.href='./menu.html'" style="background:rgba(27, 15, 1, 0.9)" 
            class="btn btn-primary" name="cl" id="cl">
            MENU MENU
            </button>

            <p class="m-0 small">Copyright &copy; Your Website 2018</p>
        </div>
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    </body>

      <!-- Script to highlight the active date in the hours list -->
    <script>
        $('.list-hours li').eq(new Date().getDay()).addClass('today');
    </script>

</html>