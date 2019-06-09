
function operation(){
    var name = document.getElementById('nameSaucer').value;
    var pass = document.getElementById('qualification').value;
    if (nameSaucer === "" || qualification === "") {
        alert('MUST GIVE AN ID');
        return false;
    } else{        
        document.getElementById('form').action = "./U_15.php";        
        return true;
    }
}