function operation(){
    var nameSaucer = document.getElementById('nameSaucer').value;
    if (nameSaucer === "") {
        alert('MUST GIVE AN ID');
        return false;
    } else{        
        document.getElementById('form').action = "./U_17.php";        
        return true;
    }
}
